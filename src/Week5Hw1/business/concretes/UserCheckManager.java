package Week5Hw1.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Week5Hw1.business.abstracts.UserCheckService;
import Week5Hw1.entites.concretes.User;

public class UserCheckManager implements UserCheckService {
	List<User> users = new ArrayList<User>();

	@Override
	public boolean isValidPassword(User user) {
		if (user.getPassword().isEmpty()) {
			System.out.println("Parola boş bırakılamaz!");
			return false;
		} else {
			if (user.getPassword().length() < 6) {
				System.out.println("Şifre en az 6 karakterden oluşmalı!");
				return false;
			}
		}

		return true;
	}

	@Override
	public boolean isValidMail(User user) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		if(user.getEmail().isEmpty()) {
			System.out.println("Email boş bırakılamaz");
			return false;
		} else {
			if(pattern.matcher(user.getEmail()).find() == false) {
				System.out.println("Geçersiz email formatı");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkFirstName(User user) {
		if (user.getFirstName().isEmpty()) {
			System.out.println("İsim boş bırakılamaz!");
			return false;
		} else {
			if (user.getFirstName().length() < 2) {
				System.out.println("İsim en az 2 karakterden oluşmalı!");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkLastName(User user) {
		if (user.getFirstName().isEmpty()) {
			System.out.println("Soyad boş bırakılamaz!");
			return false;
		} else {
			if (user.getFirstName().length() < 2) {
				System.out.println("Soyad en az 2 karakterden oluşmalı!");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isUniqueMail(User user) {
		for (User u : users) {
			if (u.getEmail() == user.getEmail()) {
				System.out.println("Girilen e-posta sistemde mevcut!");
				return false;
			}
		}
		users.add(user);
		return true;
	}

	@Override
	public boolean isValid(User user) {
		if(isValidPassword(user) && isValidMail(user) && checkLastName(user) && checkFirstName(user) && isUniqueMail(user) )
		{
			return true;
		}
		return false;
	}

}
