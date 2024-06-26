package main;
public class User {

	private String _username;
	private String _password;
	String _firstname;
	private String _lastname;
	
	User(String username, String password, String firstname, String lastname) {
		_username = username;
		_password = password;
		_firstname = firstname;
		_lastname = lastname;
	}
	
	public void printUser() {
		System.out.println
		(
		   _username + " " +
		   _password + " " +
		   _firstname + " " +
		   _lastname + "\n" 
	   );
	}
	
	public void setUserName(String username) {
		_username = username;
	}	
	public String getUserName() {
		return _username;
	}
	
	public void setPassword(String password) {
		// validate new password format before capture
		_password = password;
	}
	public String getPassword() {
		return _password;
	}
	
	public void setFirstName(String firstname) {
		_firstname = firstname;
	}
	public String getFirstName() {
		return _firstname;
	}
	
	public void setLastName(String lastname) {
		_lastname = lastname;
	}
	public String getLastName() {
		return _lastname;
	}
	
	public void setSurname(String lastname) {
		setLastName(lastname);
	}
	public String getSurname() {
		return getLastName();
	}
	
}