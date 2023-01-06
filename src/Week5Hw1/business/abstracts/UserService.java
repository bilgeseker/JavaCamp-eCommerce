package Week5Hw1.business.abstracts;

import Week5Hw1.entites.concretes.User;

public interface UserService {
	void signIn(User user);
	void signUp(User user);
}
