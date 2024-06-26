package main;
public class UserManager {

	static int userCount = 0;
	static User[] users = new User[100];
	
	public static User findUserByUserName(String username) {
		for (int i = 0; i < userCount; i++) {
			User currentUser = users[i];
			String currentUserName = currentUser.getUserName(); 
			if (currentUserName.equals(username)) {
				return currentUser;
			}
		}
		return null;
	}
	
	public static User findUserByFirstName(String firstname) {
		for (int i = 0; i < userCount; i++) {
			User currentUser = users[i];
			String currentUserName = currentUser.getFirstName(); 
			if (currentUserName.equals(firstname)) {
				return currentUser;
			}
		}
		return null;
	}	
	public static User findUserByName(String firstname) {
		return findUserByFirstName(firstname);
	}
	
	public static User findUserByLastName(String lastname) {
		for (int i = 0; i < userCount; i++) {
			User currentUser = users[i];
			String currentUserName = currentUser.getLastName(); 
			if (currentUserName.equals(lastname)) {
				return currentUser;
			}
		}
		return null;
	}	
	public static User findUserBySurname(String lastname) {
		return findUserByLastName(lastname);
	}
	
	static public void addUser(User user) {
		users[userCount] = user;
		userCount++;
	}
	
	static public void removeUserByUserName(String username) {
		// 
	}
	
	static public void removeUserByFirstName(String firstname) {
		// 
	}
	
	static public void removeUserByLastName(String lastname) {
		// 
	}
	
	static public void removeUserBySurname(String surname) {
		removeUserByLastName(surname);
	}
	
	public static void printUsers() {
		System.out.println("All Users: \n");
		for (int i = 0; i < userCount;  i++) {
			users[i].printUser();
		}
	}
	
}