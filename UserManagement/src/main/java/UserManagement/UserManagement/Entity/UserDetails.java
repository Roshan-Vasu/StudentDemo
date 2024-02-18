package UserManagement.UserManagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserDetails {
	
	@Id
	private Long userId;
	private String fName;
	private String lName;
	private String emailId;
	
	UserDetails (){ 
		
	}

	public UserDetails(Long userId, String fName, String lName, String emailId) {
		super();
		this.userId = userId;
		this.fName = fName;
		this.lName = lName;
		this.emailId = emailId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", fName=" + fName + ", lName=" + lName + ", emailId=" + emailId + "]";
	}
	
	
}	
