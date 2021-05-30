package business.concretes;

import java.util.regex.Pattern;

import business.abstracts.UserValidationService;
import core.utils.ValidationRules;
import entity.concretes.User;

public class UserValidationManager implements UserValidationService {
	 
	public static final Pattern VALID_EMAIL_ADRESS_REGEX = 
			Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	

	@Override
	public boolean validate(User user) {
		boolean result = ValidationRules.validate(
				isEmailValid(user.getEmail()),
				isPasswordValid(user.getPassword()),
				isFirstNameValid(user.getFirstName()),
				isLastNameValid(user.getLastName()),
				isRequiredFieldsFull(user.getFirstName(),user.getLastName(),user.getEmail(),user.getPassword())
				);
		return result;
	}


	private boolean isRequiredFieldsFull(String firstName, String lastName, String email, String password) {
		if (firstName.length() <=0 || lastName.length()<=0 || email.length()<=0 ||password.length()<=0){
		return false;	
		}return true;
	}


	private boolean isLastNameValid(String lastName) {
		return lastName.length()> 2;
	}


	private boolean isFirstNameValid(String firstName) {
		return firstName.length()> 2;
	}


	private boolean isPasswordValid(String password) {
		return password.length() > 6;
		
	}


	private boolean isEmailValid(String email) {
		return  VALID_EMAIL_ADRESS_REGEX.matcher(email).find();
	}


	

}
