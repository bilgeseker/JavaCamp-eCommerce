package Week5Hw1.dataAccess.abstracts;

import java.util.List;

import Week5Hw1.entites.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);
	List<User> getAll();
}
