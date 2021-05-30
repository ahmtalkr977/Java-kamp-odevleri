package core;

import verifyManager.VerifyManager;

public class VerifyManagerAdapter implements VerifyService {

	@Override
	public void register(int id, String email, String password, String firstName, String lastName) {
		VerifyManager verifyManager = new VerifyManager();
		verifyManager.register(email, password);
		
		
	}

	@Override
	public void login(String email, String password) {
		VerifyManager verifyManager = new VerifyManager();
		verifyManager.login(email, password);
		
		
		
	}

}
