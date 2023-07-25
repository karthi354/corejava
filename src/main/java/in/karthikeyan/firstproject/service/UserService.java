package in.karthikeyan.firstproject.service;
import java.util.Set;

import Validation.UserValidator;
import in.karthikeyan.firstproject.dao.UserDAO;
import in.karthikeyan.firstproject.model.User;

public class UserService {
	private UserDAO userDao;

	public UserService() {
		this.userDao = new UserDAO(); // Initialize userDao instance in the constructor
	}

	public Set<User> getAll() {
		Set<User> userList = userDao.findAll();
		for (User user : userList) {
			System.out.println(user);
		}
		return userList;
	}

	public void create(User newUser) throws Exception {
		UserValidator.Validate(newUser);
		userDao.create(newUser);
	}

	public void update() {
		User newUser2 = new User();
		newUser2.setId(788755786);
		newUser2.setFirstName("karthi");
		newUser2.setLastName("keyan");
		newUser2.setEmail("karthikeyan@gmail.com");
		newUser2.setPassword("sollamattan");
		newUser2.setActive(true);

		userDao.update(788755786, newUser2);
	}

	public void delete() {
		userDao.delete(788755786);
	}
}