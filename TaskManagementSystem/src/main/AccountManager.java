package main;

public class AccountManager {

	// This is a superficial class that will allow the user to manipulate/update/change their login/registration credentials
	
	public static void changeUserPassword(String password) {
		// We need to check that the "new" password also respects the password complexity criteria as required upon reg()
		// thankfully we have already separated the functions to re-use them here, so it is not necessary to duplicate code ...
		// invoke Prompt.promptPassword()
		// invoke Format.checkPasswordComplexity()
		// only after the above is verified, then accept the new password
		// find the current active user
		// invoke UserManager.getUser();
		// invoke User.setPassword();
	}
	
	public static void changeUserName(String username) {
		// We need to check that the "new" username also respects the username complexity criteria as required upon reg()
		// thankfully we have already separated the functions to re-use them here, so it is not necessary to duplicate code ...
		// invoke Format.checkUsernameComplexity()
	}
	
	public static void changeName(String name) {
		// invoke Prompt.promptFirstName()
	}
	
	public static void changeSurname(String surname) {
		// invoke Prompt.promptLastName()
	}
	
}