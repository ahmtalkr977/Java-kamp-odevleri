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
		verifyService.register(1, "ahmetalkur@mail.com", "12341234", "Ahmet", "Alkur");   //Kay�t ba�ar�l� dogrulama adresi...
		verifyService.register(2, "mailcom", "564654", "Ahmet", "Alkur");   //�ifre  ve mail yanl��
		verifyService.register(3, "eposta@mail.com", "f", "Ahmet", "Alkur");  // �ifre 6 karakter de�il
		verifyService.register(4, "eposta@mail.com", "1235135", "a", "a");   //isim ve soy isim 2 hane
		verifyService.register(5, "ahmetalkur@mail.com", "12341234", "Ahmet", "Alkur");  //varolan eposta 
		
		verifyService.login("ahmetalkur@mail.com", "12341234");   //�yelik do�rulanmam��
		userService.verifyUser(1);   //do�rulama ba�ar�l�
		verifyService.login("ahmetalkur@mail.com", "12345555");  //�ifre yanl�� girilmi�
		verifyService.login("ahmetalkur@mail.com", "12341234");  //giri� yap�ld�
		verifyService.login("", "");  //mail adresi ve eposta k�sm� bo� b�rak�lm��
		
		
		
		
		VerifyService verifyManager = new VerifyManagerAdapter();
		verifyManager.register(6, "alkr@mail.com", "12341234","Ahmet","Alkur");
		verifyManager.login("alkr@mail.com", "12341234");
		
		
		
		
		
		
		
		
		
		
		

	}

}
