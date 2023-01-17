package usermanagement.repository;

import java.util.ArrayList;
import java.util.List;

import usermanagement.entity.User;

public class UserRepository {

	private List<User> userDataList;

	private static UserRepository instance;

	public static UserRepository getInstance() {
		if (instance == null) {
			instance = new UserRepository();
		}
		return instance;
	}

	private UserRepository() {
		userDataList = new ArrayList<>();
	}

	public int saveUser(User user) {
		userDataList.add(user);
		return userDataList.indexOf(user);
	}

	public User findUserByUsername(String username) {
		User user = null;
		for (User u : userDataList) {
			if (u.getUsername().equals(username)) {
				user = u;
				break;
			}
		}

		return user;
	}

}
