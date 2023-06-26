package in.karthikeyan.firstproject.service;

import in.karthikeyan.firstproject.dao.UserDAO;
import in.karthikeyan.firstproject.model.User;

public class UserService {

	public User[] getAll() {
		UserDAO userdao = new UserDAO();
		User[] UserList = userdao.findAll();
		System.out.println(UserList[0]);
		return UserList;
	}
	public void create() {
		User newUser = new User();
		newUser.setId(12345);
		newUser.setFirstName("karthi");
		newUser.setLastName("keyan");
		newUser.setEmail("karthikn354@gmail.com");
		newUser.setPassword("sollamattan");
		newUser.setActive(true);
		UserDAO userDAO = new UserDAO();
		userDAO.create(newUser);
	}
}
