package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entity.concretes.User;

public class InMemoryUserDao implements UserDao {
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		
		
	}

	@Override
	public void delete(User user) {
		users.removeIf(obj->obj.getId() == user.getId());
		
	}

	@Override
	public void update(User user) {
		User userToUpdate = get(user.getId());
		userToUpdate.setFirstName(user.getFirstName());
		userToUpdate.setLastName(user.getLastName());
		
	}

	@Override
	public User get(int id) {
		for(User user : users) {
			if(user.getId() == id)
				return user;
		}
		return null;
	}

	@Override
	public User getByEmail(String email) {
		for(User user : users) {
			if(user.getEmail() == email)
				return user;
			
		}
		return null;
	}

	@Override
	public User getByEmailAndPassword(String email, String password) {
		for(User user : users) {
			if(user.getEmail() == email && user.getPassword() == password)
				return user;
		}
		
		return null;
	}

	@Override
	public List<User> getall() {
		return users;
	}

	

}
