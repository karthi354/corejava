package Validation;
import exception.ValidationException;
import in.karthikeyan.firstproject.model.User;

public class UserValidator {
	public static void Validate(User user) throws ValidationException{
    	if(user == null) {
    		throw new ValidationException("Invalid User Input");
    	}
    	if(user.getEmail() == null || "".equals(user.getEmail().trim())) {
    		throw new ValidationException("Email cannot be null or empty");
    	}
    	if(user.getPassword() == null || "".equals(user.getPassword().trim())) {
    		throw new ValidationException("Password cannot be null or empty");
    	}
    	if(user.getFirstName() == null || "".equals(user.getFirstName().trim())) {
    		throw new ValidationException("FirstName cannot be null or empty");
    	}

    }
	
}
