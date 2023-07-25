package interfaces;

import in.karthikeyan.firstproject.model.User;

public interface UserInterface extends Base<User> {
	public abstract User findByEmail(String email);

	public abstract int count();
}