package in.com.rays;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class UserService <t extends UserDTO,d extends UserDAO> {
	@Autowired
	UserDAO dao;
	
	
	public long add(UserDTO dto) {
		return dao.add(dto);
		
	}

}
