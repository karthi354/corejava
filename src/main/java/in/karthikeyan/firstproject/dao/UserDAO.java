package in.karthikeyan.firstproject.dao;

import in.karthikeyan.firstproject.model.User;

public class UserDAO {

	public User[] findAll() {
		User[] userList = UserList.listOfUsers;	
		return userList;
	}
	
public void create(User newUser) {
		
		UserList.listOfUsers[0] = newUser;
	}
}
