package business.abstracts;

import entity.concretes.User;

public interface UserValidationService {
	boolean validate(User user);

}
