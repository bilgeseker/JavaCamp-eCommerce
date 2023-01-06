package Week5Hw1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Week5Hw1.dataAccess.abstracts.UserDao;
import Week5Hw1.entites.concretes.User;

public class HibernateUserDao implements UserDao{
	List<User> users = new ArrayList<User>();
	@Override
	public void add(User user) {
		System.out.println("Kullanıcı veritabanına eklendi: " + user.getFirstName() + " " + user.getLastName());
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		User u = new User();
		for(User user : users) {
			if(user.getId() == id) {
				u = user;
			}
		}
		return u;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
