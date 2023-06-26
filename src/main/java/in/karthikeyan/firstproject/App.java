package in.karthikeyan.firstproject;

import in.karthikeyan.firstproject.service.UserService;


public class App {

	 public static void main(String[] args) {
		 UserService userService = new UserService();
		 userService.create();
		 userService.getAll();
		
	 }

}
