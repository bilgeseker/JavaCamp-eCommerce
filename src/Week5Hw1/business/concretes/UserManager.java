package Week5Hw1.business.concretes;

import Week5Hw1.business.abstracts.UserCheckService;
import Week5Hw1.business.abstracts.UserService;
import Week5Hw1.dataAccess.abstracts.UserDao;
import Week5Hw1.entites.concretes.User;

public class UserManager implements UserService{
	UserCheckService userCheck;
	UserDao userDao;
	
	public UserManager(UserCheckService userCheck, UserDao userDao) {
		super();
		this.userCheck = userCheck;
		this.userDao = userDao;
	}

	@Override
	public void signIn(User user) {
		if(userDao.get(user.getId()).getPassword() == user.getPassword() && userDao.get(user.getId()).getEmail() == user.getEmail()) {
			System.out.println("Kullanıcı başarıyla giriş yaptı: " + user.getFirstName() + " " + user.getLastName());
		}else {
			System.out.println("Email veya şifre yanlış, lütfen tekrar deneyin!");
		}
		
	}

	@Override
	public void signUp(User user) {
		if(userCheck.checkFirstName(user)&&userCheck.checkLastName(user) && 
				userCheck.isUniqueMail(user) && userCheck.isValidMail(user) && userCheck.isValidPassword(user)) {
			System.out.println("Kullanıcı " + user.getFirstName() + " " + user.getLastName() + " başarıyla kayıt edildi!");
			userDao.add(user);
		} else {
			System.out.println("Geçersiz bilgi girildi");
		}
	}

}
