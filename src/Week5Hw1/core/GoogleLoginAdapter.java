package Week5Hw1.core;

public class GoogleLoginAdapter implements LoginService{

	@Override
	public void logIn(String email, String password) {
		System.out.println("Google ile giriş yapıldı");
	}
	
}
