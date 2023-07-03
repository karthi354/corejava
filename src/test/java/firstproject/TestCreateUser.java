package firstproject;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import in.karthikeyan.firstproject.model.User;
import in.karthikeyan.firstproject.service.UserService;

public class TestCreateUser {
	@Test
     public void testCreateUserWithValidataInput(){
    	UserService userService = new UserService();

 		User newUser = new User();
 		newUser.setId(10);
 		newUser.setFirstName("karthi");
 		newUser.setLastName("keyan");
 		newUser.setEmail("karthikn352004@gmail.com");
 		newUser.setPassword("Sollamattan");
 		newUser.setActive(true);
        assertDoesNotThrow(()->{
    	   userService.create(newUser);
        });
 		
 		
     }
	@Test
	public void testCreateUserWithInvalidataInput() {
		UserService userService = new UserService();
		Exception exception = assertThrows(Exception.class,()->{
			userService.create(null);
		});
		String expectedMessage = "Invalid User Input";
		String actualMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(actualMessage));
	}
	@Test
	public void testCreateUserWithEmailNull() {
		UserService userService = new UserService();

		User newUser = new User();
		newUser.setId(10);
		newUser.setFirstName("karthi");
		newUser.setLastName("keyan");
		newUser.setEmail("");
		newUser.setPassword("Sollamattan");
		newUser.setActive(true);
		
		Exception exception = assertThrows(Exception.class,()->{
			userService.create(newUser);
		});
		String expectedMessage = "Email cannot be null or empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(actualMessage));
	}
	@Test
	public void testUserEmailWithEmailEmpty() {
		UserService userService = new UserService();

		User newUser = new User();
		newUser.setId(10);
		newUser.setFirstName("karthi");
		newUser.setLastName("keyan");
		newUser.setEmail("");
		newUser.setPassword("Sollamattan");
		newUser.setActive(true);
		
		Exception exception = assertThrows(Exception.class,()->{
			userService.create(newUser);
		});
		String expectedMessage = "Email cannot be null or empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(actualMessage));
	}
}