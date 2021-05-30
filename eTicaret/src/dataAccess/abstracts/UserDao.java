package dataAccess.abstracts;

import java.util.List;

import entity.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	User get(int id);
	User getByEmail(String email);
	User getByEmailAndPassword(String email,String password);
	List<User> getall();

}
