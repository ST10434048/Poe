package main;
public class Login {

	public static void login() {
//		String username = Prompt.promptUserName();
//		User user = UserManager.findUserByUserName(username);
//		if (user == null) {
//			System.out.println("User Not Found - Check that your Username is correct! \n");
//			return;
//		}
//		String password = Prompt.promptPassword();
//		Boolean valid = validateLoginCredentials(user, password);
//		if (valid) {
//			System.out.println("\nSuccessfully Logged-In \n");
//			Main.current_logged_in_User = user;
//			new Kanban();
//		} else {
//			System.out.println("\nPasswords don't Match ... \n");
//		}
		new Kanban();
	}

	private static Boolean validateLoginCredentials(User user, String password) {
//		if (user.getPassword().equals(password)) {
//			return true;
//		}
//		return false;
		return true;
	}
}