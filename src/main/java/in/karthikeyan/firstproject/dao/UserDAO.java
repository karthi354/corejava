package in.karthikeyan.firstproject.dao;

import in.karthikeyan.firstproject.model.User;

public class UserDAO {
	public User[] findAll() {
		
		User[] userlist = UserList.listOfUsers;
		return userlist;
		
		
	}
	
	public void creat() {
		User newUser  = new User();
		
		newUser.setId(1234567890);
		newUser.setFirstName("karthi");
		newUser.setLastName("keyan");
		newUser.setEmail("karthikn352004@gmail.com");
		newUser.setPassword("sollamattan");
		newUser.setActive(true);
		
		UserList.listOfUsers[0] = newUser;
		
	}
}
