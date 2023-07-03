package in.karthikeyan.firstproject;
import in.karthikeyan.firstproject.model.User;
import in.karthikeyan.firstproject.service.UserService;


public class App {

	public static void main(String[] args) {
		try {
			UserService userService = new UserService();

			User newUser = new User();
			newUser.setId(10);
			newUser.setFirstName("karthi");
			newUser.setLastName("keyan");
			newUser.setEmail("karthikn352004@gmail.com");
			newUser.setPassword("Sollamattan");
			newUser.setActive(true);

			userService.create(newUser);
			userService.getAll();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
}
}
