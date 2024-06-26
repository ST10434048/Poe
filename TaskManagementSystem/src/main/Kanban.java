package main;

public class Kanban {
	
	enum Items {
		ManageTasks,
		ManageAccount,
		Exit,
	}
	
	Kanban() {
		showKanbanMenu();
		int choice = promptUserChoice();
		if (choice == 0) {
			System.out.println("ManageTasks");
			TaskManager.showTaskManagerMenuItems();
//			TaskManager.promptUser();
		} else if (choice == 1) {
			System.out.println("ManageAccounts");
			
		} else if (choice == 2) {
			System.out.println("Exit to Main Menu");
		} else {
			System.out.println("Invalid Choice - Try Again? \n");
			new Kanban();
		}
	}
	
	private static void showKanbanMenu() {
		System.out.println("\nWelcome to EasyKanban\n\n");
		System.out.println("Kanban Menu: \n");
		for (int i = 0; i < Items.values().length; i++) {
			System.out.println(i + ") " + Items.values()[i]);
		};
	}
	
	private static int promptUserChoice() {
		int choice = Main.scanner.nextInt();
		Main.scanner.nextLine();
		return choice;
	}
	
}