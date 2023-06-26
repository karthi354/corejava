package in.karthikeyan.firstproject;

import in.karthikeyan.firstproject.service.UserService;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserService userService = new UserService();
		
		userService.getAll();

	}

}
