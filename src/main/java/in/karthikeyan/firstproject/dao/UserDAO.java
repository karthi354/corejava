package in.karthikeyan.firstproject.dao;
import in.karthikeyan.firstproject.model.User;

public class UserDAO {

	public User[] findAll() {
		User[] userList = UserList.listOfUsers;	
		return userList;
	}
	
public void create(User newUser) {
		
//		UserList.listOfUsers[0] = newUser;
		
		User[] arr = UserList.listOfUsers;
		
		for (int i=0; i<arr.length;i++) {
			User user = arr[i];
			if(user == null) {
				arr[i] = newUser;
				break;
				
			}
		}
	}
/**
 * 
 * @param j 
 * @param updateUser
 */

public void update(int j, User updateUser) {
	
	User[] arr = UserList.listOfUsers;

	for (int i=0; i<arr.length;i++) {
		User user = arr[i];
		if(user==null) {
			continue;
		}
		if(user.getId()==i) {
			arr[i] = updateUser;
			break;
		}
		
	}
		
	}
public void delete(int id) {
	
	User[] arr = UserList.listOfUsers;

	for (int i=0; i<arr.length;i++) {
		User user = arr[i];
		if(user==null) {
			continue;
		}
		if(user.getId()==id) {
			user.setActive(false);
			break;
		}
		
	}
		
	}

public User findById(int userId) {
	User[] userList = UserList.listOfUsers;
	User userMatch = null;

	for (int i = 0; i < userList.length; i++) {
		User user = userList[i];
		if (user.getId() == userId) {
			userMatch = user;
			break;
		}
	}
	return userMatch;
}

	
}

