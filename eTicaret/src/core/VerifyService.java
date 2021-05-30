package core;

public interface VerifyService {
	void register(int id,String email,String password,String firstName,String lastName);
	void login (String email,String password);

}
