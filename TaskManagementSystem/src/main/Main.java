package main;
import java.util.Scanner;

//import javax.swing.*;

public class Main {

	public static User current_logged_in_User;
	static Scanner scanner;
	static int choice = -1;
	
	public static void main(String[] args) {	
		
//		 Login.showLoginBox();
		
		scanner = new Scanner(System.in);
		
		while (choice!=2) {
			Menu.printMenuItems();
			Menu.promptUser();
		}
		
		scanner.close();
		
	}

}
