package Week5Hw1;

import Week5Hw1.business.abstracts.UserService;
import Week5Hw1.business.concretes.UserCheckManager;
import Week5Hw1.business.concretes.UserManager;
import Week5Hw1.dataAccess.concretes.HibernateUserDao;
import Week5Hw1.entites.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService user = new UserManager(new UserCheckManager(), new HibernateUserDao());
		
		User user1 = new User();
		user1.setEmail("bilgeseker345@gmail.com");
		user1.setFirstName("Bilge");
		user1.setId(1);
		user1.setLastName("Şeker");
		user1.setPassword("bilgeseker");
		user.signUp(user1);
	}

}
