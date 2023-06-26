package in.karthikeyan.firstproject.service;

import in.karthikeyan.firstproject.dao.UserDAO;
import in.karthikeyan.firstproject.model.User;

public class UserService {

	public User[] getAll() {
		
		UserDAO userDao = new UserDAO();
		
		User[] userList = userDao.findAll();
		
		for(int i = 0; i <userList.length; i++) {
			
			System.out.println(userList[i]);
		}
		
		return userList;
		
		
	}
}
