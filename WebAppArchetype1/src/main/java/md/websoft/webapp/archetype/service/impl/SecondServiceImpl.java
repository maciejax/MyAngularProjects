package md.websoft.webapp.archetype.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import md.websoft.webapp.archetype.entities.Message;
import md.websoft.webapp.archetype.service.SecondService;

import org.springframework.stereotype.Repository;


@Repository
public class SecondServiceImpl implements SecondService {

	//@Autowired
	private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.em = entityManager;
    }
	
	@SuppressWarnings("unchecked")
	public List<Message> getMessagesFromDB(){
		
			List<Message> list = em.createNamedQuery("GetTestMessages").getResultList();
		return list;
	}
}
