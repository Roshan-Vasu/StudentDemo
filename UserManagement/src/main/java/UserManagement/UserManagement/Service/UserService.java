package UserManagement.UserManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UserManagement.UserManagement.Entity.UserDetails;
import UserManagement.UserManagement.UserRepository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public List<UserDetails> retriveAllUser(){
		List<UserDetails> allUsers = userRepo.findAll();
			return userRepo.findAll();
	}
	
	public UserDetails addUser(UserDetails user) {
		
		return userRepo.save(user);
	}
	
	
	
}
