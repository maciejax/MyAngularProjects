package com.myangular.firstapp.db;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mapdb.DB;
import org.mapdb.DBMaker;

import com.myangular.firstapp.dto.PersonDTO;
import com.myangular.firstapp.ro.PersonResponse;

public class InMemoryDB {

	private DB db;
	private static String dbFilePrefix = "mapdb";
	
	private Map<Long,PersonDTO> map;
	
	/** ========================================================== */
	
	public InMemoryDB(boolean fileDb) throws IOException {

		if((db==null) && fileDb){
			File file = File.createTempFile(dbFilePrefix, "db");
			db = DBMaker.newFileDB(file).closeOnJvmShutdown().make();
			initMap();
		} else if (db==null) {
			db = DBMaker.newMemoryDB().closeOnJvmShutdown().make();
			initMap();
		}
		
	}

	public void initMap(){
		if (map==null){
			map = db.getTreeMap("messageMap");
		}
	}
	
	public void populateWithTestData(){
		
		PersonDTO m1 = new PersonDTO(1L, "Nicki Pedersen", 36);
		PersonDTO m2 = new PersonDTO(2L, "Tomasz Gollob", 42);
		
		map.put(1L, m1);
		map.put(2L, m2);
		
		db.commit();
	}
	
	/** ======== CRUD methods for PERSON Service ================= */
	
	public PersonResponse getAllPersons(){
		
		return new PersonResponse();
	}
	
}
