package business.concretes;

import business.abstracts.EmailService;
import business.abstracts.UserService;
import business.abstracts.UserValidationService;
import core.VerifyService;
import core.utils.RegisterRules;
import entity.concretes.User;

public class VerifyManager implements VerifyService {

	UserService userService;
	UserValidationService userValidationService;
	EmailService emailService;
	
	
	public VerifyManager(UserService userService, UserValidationService userValidationService,
			EmailService emailService) {
		super();
		this.userService = userService;
		this.userValidationService = userValidationService;
		this.emailService = emailService;
	}


	@Override
	public void register(int id, String email, String password, String firstName, String lastName) {
		User userToRegister = new User(id, email, password, firstName, lastName, false);
		if(!userValidationService.validate(userToRegister)) {
			System.out.println("Do�rulanamad�.Bilgilerinizi kontrol ediniz(Validasyon)");
			return;
		}
		if(!RegisterRules.register(checkIfUserExists(email))){
			System.out.println("Kay�t olma i�lemi ger�ekle�tirilemedi(E posta daha �nceden tan�mlanm��)");
			return;
		}
		
		System.out.println("Kay�t i�lemi ba�ar�l�.�yeli�inizi do�rulamak i�in eposta adresinizi kontrol ediniz");
		emailService.send("�yelik do�rulama.Do�rulamak i�in //... adresine gidin. ",userToRegister.getEmail());
		userService.add(userToRegister);
		
		
	}


	


	@Override
	public void login(String email, String password) {
		if(!RegisterRules.register(isRequiredFieldsFull(email,password))) {
			System.out.println("Email veya �ifre alanlar� bo� ge�ilemez");
			return;
		}
		User userToLogin = userService.getByEmailAndPassword(email, password);
		
		if(userToLogin == null) {
			System.out.println("Email veya �ifre yanl��");
			 return;
		}
		 
		 
		 if(!checkIfUserVerified(userToLogin)) {
			 System.out.println("Giri� ba�ar�s�z l�tfen �yeli�inizi do�rulay�n.");
			 return;
		 }
		 System.out.println("**HO�GELD�N�Z** "+userToLogin.getId()+" "+userToLogin.getFirstName()+" "+userToLogin.getLastName());
		 
		
	}


	private boolean checkIfUserVerified(User user) {
		return user.isVerified();
	}


	private boolean isRequiredFieldsFull(String email, String password) {
		if(email.length()<=0 || password.length()<=0) {
			return false;
		}
		return true;
	}
	private boolean checkIfUserExists(String email) {
		return userService.getByEmail(email) == null;
	}
	
	
	

}
