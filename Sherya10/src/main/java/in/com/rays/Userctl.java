package in.com.rays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class Userctl<f extends Userform, t extends UserDTO, s extends UserService> {
	@Autowired
	UserService service;

	@PostMapping("signup")
	public String signup(@RequestBody Userform form) {
		UserDTO dto = new UserDTO();
		dto.setFirstName(form.getFirstName());
		dto.setLastName(form.getLastName());
		dto.setLoginId(form.getLoginId());
		dto.setPassword(form.getPassword());
		service.add(dto);
		return "ho gyaa add";

	}

}
