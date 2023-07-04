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
	
	
	@Test
	public void testUserPasswordWithNull() {
		UserService userService = new UserService();
		 
	 	User newUser1 = new User();
		newUser1.setId(10);
		newUser1.setFirstName("karthi");
		newUser1.setLastName("keyan");
		newUser1.setEmail("karthikn352004@gmail.com");
		newUser1.setPassword(null);
		newUser1.setActive(true);
		
		Exception exception = assertThrows(Exception.class, ()->{
			userService.create(newUser1);
		});
		String exceptedMessage = "Password can't be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(exceptedMessage.equals(actualMessage));
	}
	
	@Test
	public void testUserPasswordWithEmpty() {
		UserService userService = new UserService();
		 
	 	User newUser1 = new User();
		newUser1.setId(10);
		newUser1.setFirstName("karthi");
		newUser1.setLastName("keyan");
		newUser1.setEmail("karthikn352004@gmail.com");
		newUser1.setPassword(" ");
		newUser1.setActive(true);
		
		Exception exception = assertThrows(Exception.class, ()->{
			userService.create(newUser1);
		});
		String exceptedMessage = "Password can't be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(exceptedMessage.equals(actualMessage));
	}
	
	@Test
	public void testUserFirstNameWithNull() {
		UserService userService = new UserService();
		 
	 	User newUser1 = new User();
		newUser1.setId(10);
		newUser1.setFirstName(null);
		newUser1.setLastName("keyan");
		newUser1.setEmail("karthikn352004@gmail.com");
		newUser1.setPassword("sollamattan");
		newUser1.setActive(true);
		
		Exception exception = assertThrows(Exception.class, ()->{
			userService.create(newUser1);
		});
		String exceptedMessage = "FirstName can't be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(exceptedMessage.equals(actualMessage));
	}
	
	@Test
	public void testUserFirstNameWithEmpty() {
		UserService userService = new UserService();
		 
	 	User newUser1 = new User();
		newUser1.setId(10);
		newUser1.setFirstName("  ");
		newUser1.setLastName("keyan");
		newUser1.setEmail("karthikn352004@gmail.com");
		newUser1.setPassword("sollamattan");
		newUser1.setActive(true);
		
		Exception exception = assertThrows(Exception.class, ()->{
			userService.create(newUser1);
		});
		String exceptedMessage = "FirstName can't be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(exceptedMessage.equals(actualMessage));
	}
	
	
	
	
	
}