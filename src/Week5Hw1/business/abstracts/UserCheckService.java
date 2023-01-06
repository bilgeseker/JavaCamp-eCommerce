package Week5Hw1.business.abstracts;

import Week5Hw1.entites.concretes.User;

public interface UserCheckService {
	boolean isValidPassword(User user);
	boolean isValidMail(User user);
	boolean checkFirstName(User user);
	boolean checkLastName(User user);
	boolean isUniqueMail(User user);
	boolean isValid(User user);
}
