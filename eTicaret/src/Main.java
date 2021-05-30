import business.abstracts.UserService;
import business.concretes.EmailManager;
import business.concretes.UserManager;
import business.concretes.UserValidationManager;
import business.concretes.VerifyManager;
import core.VerifyManagerAdapter;
import core.VerifyService;
import dataAccess.concretes.InMemoryUserDao;
import entity.concretes.User;



public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new InMemoryUserDao());
		VerifyService verifyService = new VerifyManager(userService,new UserValidationManager(),new EmailManager());
		verifyService.register(1, "ahmetalkur@mail.com", "12341234", "Ahmet", "Alkur");   //Kayýt baþarýlý dogrulama adresi...
		verifyService.register(2, "mailcom", "564654", "Ahmet", "Alkur");   //þifre  ve mail yanlýþ
		verifyService.register(3, "eposta@mail.com", "f", "Ahmet", "Alkur");  // þifre 6 karakter deðil
		verifyService.register(4, "eposta@mail.com", "1235135", "a", "a");   //isim ve soy isim 2 hane
		verifyService.register(5, "ahmetalkur@mail.com", "12341234", "Ahmet", "Alkur");  //varolan eposta 
		
		verifyService.login("ahmetalkur@mail.com", "12341234");   //üyelik doðrulanmamýþ
		userService.verifyUser(1);   //doðrulama baþarýlý
		verifyService.login("ahmetalkur@mail.com", "12345555");  //þifre yanlýþ girilmiþ
		verifyService.login("ahmetalkur@mail.com", "12341234");  //giriþ yapýldý
		verifyService.login("", "");  //mail adresi ve eposta kýsmý boþ býrakýlmýþ
		
		
		
		
		VerifyService verifyManager = new VerifyManagerAdapter();
		verifyManager.register(6, "alkr@mail.com", "12341234","Ahmet","Alkur");
		verifyManager.login("alkr@mail.com", "12341234");
		
		
		
		
		
		
		
		
		
		
		

	}

}
