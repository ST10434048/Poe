package main;

public class Prompt {

	// If a user later decides to change their username via account manager, then the function is already available
	public static String promptUserName() {
		System.out.println("Enter Username:");
		String username = Main.scanner.nextLine();
		return username;
	}
	
	// If a user later decides to change their password via account manager, then the function is already available
	public static String promptPassword() {
		System.out.println("Enter Password:");
		String password = Main.scanner.nextLine();
		return password;
	}
	
	// If a user later decides to change their name via account manager, then the function is already available
	public static String promptFirstName() {
		System.out.println("Enter First Name:");
		String FirstName = Main.scanner.nextLine();
		return FirstName;
	}

	// If a user later decides to change their surname via account manager, then the function is already available
	public static String promptLastName() {
		System.out.println("Enter Last Name:");
		String lastname = Main.scanner.nextLine();
		return lastname;
	}
	
}