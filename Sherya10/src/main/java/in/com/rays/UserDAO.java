package in.com.rays;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO <t extends UserDTO>{
	
	@PersistenceContext 
	protected EntityManager em;
	
	public long add(UserDTO dto) {
		
		em.persist(dto);
		return dto.getId();
	}
	

}
