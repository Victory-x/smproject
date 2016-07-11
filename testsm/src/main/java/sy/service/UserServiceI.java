package sy.service;

import sy.model.User;

import java.util.List;

public interface UserServiceI {

	public User getUserById(String id);

	List<User> getAll();

	List<User> getAll2();

	List<User> getAll3();

}
