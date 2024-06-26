package main;

import java.util.Scanner;

public class Menu {

	enum Items {
		Login,
		Register,
		Exit,
	}
	
	public static void printMenuItems() {
	
		System.out.println("Main Menu: \n");
		
		for (int i = 0;i  < Items.values().length; i++) {
			System.out.println(i + ") " + Items.values()[i]);
		}
	}
	
	public static void promptUser() {
		
		int choice = Main.scanner.nextInt();
		Main.scanner.nextLine();  // Consume newline left-over
		
		Main.choice = choice;
		
		if (choice == 0) {
			Login.login();
		} else if (choice == 1) {
			Registration.reg();
		} else if (choice == 2) {
			// Do Nothing
			System.out.println("Terminating Program!");
		} else {
			// Do Nothing
			System.out.println("Invalid Option Selected - Try Again?");			
		}
		
	}
	enum Report{
		Display_Done_Tasks,
		Display_Longest_Task,
		Search_For_Task_By_Name,
		Search_For_Task_By_Developer,
		Remove_Task_By_Name,
		Display_All_Tasks,
		Go_Back,
	}


	static void showReportItems(){
		System.out.println("\nReport options: \n");
		for (int x = 0; x < Report.values().length; x++) {
			System.out.println("(" + x + ")" + Report.values()[x]);

		}
		System.out.print("Insert Choice here: ");
	}

	static void promptReport() {
		showReportItems();
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {
			int choice = scanner.nextInt();
			switch (choice) {
				case 0:
					TaskManager.showDoneTasks();
					promptReport();
				case 1:
					TaskManager.showLongestTask();
					promptReport();
				case 2:
					TaskManager.searchTasksByName();
					promptReport();
				case 3:
					TaskManager.searchTasksByDevName();
					promptReport();
				case 4:
					TaskManager.deleteTaskByName();
					promptReport();
				case 5:
					TaskManager.fullReport();
					promptReport();
				case 6:
					new Kanban();
			}
		} else {
			System.out.println("Invalid Choice");
			promptReport();
		}
	}

	
}
