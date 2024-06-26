package main;
public class Registration {
	
	public static void reg() {
		// System.out.println("Registration.reg();");
		// Registration.reg();
		String username = Prompt.promptUserName();
		// check if username exists before adding new user to UserManager.users
		Boolean exists = checkUserNameExists(username);
		if (exists) {
			System.out.println("Username Exists - Login/Register a New Accout ... \n");
			return;
		}
		// check if username format is correct
		Boolean valid_username = utils.Format.checkUsernameComplexity(username);
		if (!valid_username) {
			utils.Format.printUsernameComplexityRules();
			return;
		}
		String password = Prompt.promptPassword();
		// check if password is a valid format - do not use regex
		Boolean valid_password = utils.Format.checkPasswordComplexity(password);
		if (!valid_password) {
			utils.Format.printPasswordComplexityRules();
			return;
		}
		String firstName = Prompt.promptFirstName(); // Accept any input
		String lastName = Prompt.promptLastName(); // Accept any input
		// The below will only happen if the above is correct
		User user = new User(username, password, firstName, lastName);
		UserManager.addUser(user);
	}
	
	private static Boolean checkUserNameExists(String username) {
		User user = UserManager.findUserByUserName(username);
		if (user == null) {
			return false;
		}
		return true;
	}
	
}