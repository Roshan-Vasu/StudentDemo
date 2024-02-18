package UserManagement.UserManagement.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import UserManagement.UserManagement.Entity.UserDetails;

public interface UserRepo extends JpaRepository<UserDetails, Long> {

}
