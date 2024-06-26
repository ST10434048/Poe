package utils;

public class Format {

	// array of special characters from which the user can choose to create a password
	private static char[] characters = new char[] {'!', '@', '#', '$', '%', '^', '&', '*', '.', '-', '+',  '_'};
	
	public static Boolean checkUsernameComplexity(String username) {
		// fill in the details for checking whether a username is correctly formatted
		return true; // currently all username formats are acceptable
	}
	
	public static Boolean checkPasswordComplexity(String password) {
		
		// Example Password:
		//
		// Pass*W0rd
		//
		// The above password contains (at least):
		//
		// 	- 1 Special Character
		//	- 1 Upper-Case Character
		//	- 1 Numeric Character
		//	- 8 Characters in Length
		//
		
		// Check if password is of the correct length
		if (password.length() < 8) {
			return false;
		}
		// Avoid regex using boolean flags !!!
		Boolean hasSpecialChar = false;
		Boolean hasNumericChar = false;
		Boolean hasUpperChar = false;
		
		// this loop iterates the password string only once,
		// but may have to iterate the entire character array above
		for (int i = 0; i < password.length(); i++) {
			char currentChar = password.charAt(i);
			if (contains(characters, currentChar)) {
				hasSpecialChar = true;
			}
			if (isNumeric(currentChar)) {
				hasNumericChar = true;
			}
			if (isUpper(currentChar)) {
				hasUpperChar = true;
			}
		}
		return (hasSpecialChar && hasNumericChar && hasUpperChar);
	}
	
	// function to check whether a character is contained in specified char array
	private static Boolean contains(char[] array_to_search, char character_to_find) {
		for (int i = 0; i < array_to_search.length; i++) {
			if (array_to_search[i] == character_to_find) {
				return true;
			}
		}
		return false;
	}
	
	public static Boolean isNumeric(char character) {
		return Character.isDigit(character);
	}
	public static Boolean isNumericDate(String dateString) {
		for (int i = 0; i < dateString.length(); i++) {
			if (Character.isDigit(dateString.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	public static Boolean isUpper(char character) {
		return Character.isUpperCase(character);
	}
	
	public static void printPasswordComplexityRules() {
		System.out.println("Password Format Not Valid - Ensure the Following: \n");
		System.out.println("Password MUST Contain (At Least): \n");
		System.out.println("\t - 8 Characters in Length");
		System.out.println("\t - 1 Special Character");
		System.out.println("\t - 1 Numeric Character");
		System.out.println("\t - 1 Upper-Case Character");
		System.out.println("\n");
	}
	
	public static void printUsernameComplexityRules() {
		// Inform the client how to format their username
		System.out.println("Inform client how to format their username correctly");
	}

	public static Boolean dateCheck(String date) {
		if(date.length() != 10) {
			return false;
		}
		String year = date.substring(0,3);
		String month = date.substring(5,6);
		String day = date.substring(8,9);
        return isNumericDate(year) && isNumericDate(month) && isNumericDate(day);
    }

	public static Boolean descriptionCheck(String description) {
        return description.length() <= 50;
    }
}
