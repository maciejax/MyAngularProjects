package md.websoft.webapp.archetype.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ADM_MESSAGE")
public class Message {
	
    @Id
    @Column(name = "adm_id")
	private String id;
	
    @Column(name = "adm_message", length = 50 )
    private String message;

		
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
