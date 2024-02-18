package UserManagement.UserManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import UserManagement.UserManagement.Entity.UserDetails;
import UserManagement.UserManagement.Service.UserService;

@RestController
@RequestMapping("/api/UserManagement/User")
public class UserController {

	@Autowired
	private UserService userService;
	
	public UserController(UserService userService) {
		
		this.userService = userService;
	}

	@GetMapping("/AllUsers")
	public List<UserDetails>showAllUsers(){
		return userService.retriveAllUser();
	}
	
	@RequestMapping(value =  "/AddUser", method = RequestMethod.POST)
	public UserDetails saveUser(@RequestBody UserDetails user) {
		return userService.addUser(user);
		  
	}
}
