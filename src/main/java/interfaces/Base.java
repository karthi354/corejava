package interfaces;

import java.util.*;

import in.karthikeyan.firstproject.model.User;

public interface Base<T> {

	public abstract Set<T> findAll();

	public abstract void create(User newUser);

	public abstract void delete(int id);

	public abstract void update(int id, T newT);

	public abstract <T> T findById(int id);

}