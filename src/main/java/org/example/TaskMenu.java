package org.example;

import java.util.Scanner;

public class TaskMenu {
    enum Items {
        NewTask,
        ShowReport,
        exit,
    }

    static void showTaskItems(){
        System.out.println("\nMenu Options: \n");
        for (int x = 0; x < Items.values().length; x++) {
            System.out.println("(" + x + ")" + Items.values()[x]);

        }
        System.out.print("Insert Choice here: ");
    }
    static void promptKanbanChoice(){
        showTaskItems();
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
        int choice = scanner.nextInt();
        switch (choice) {
            case 0:
                TaskManager.newTask();
                break;
            case 1:
                TaskManager.showReport();
                break;
            case 2:
                System.exit(0);
                break;

        }
    }else {
            System.out.println("Invalid Choice");
            promptKanbanChoice();
        }
    }
    public enum Status{
        Doing,
        Done,
        To_DO,

    }
    static void showStatusItems(){
        System.out.println("\nStatuses: \n");
        for (int x = 0; x < Status.values().length; x++) {
            System.out.println("(" + x + ")" + Status.values()[x]);

        }
        System.out.print("Insert Choice here: ");
    }
    static Status promptStatus() {
        showStatusItems();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        Status chosen;
        switch (choice) {
            case 0:
                chosen = Status.Doing;
                break;
            case 1:
                chosen = Status.Done;
                break;
            case 2:
                chosen = Status.To_DO;
                break;
            default:
                System.out.println("Invalid choice. Setting status to 'To_DO' by default.");
                chosen = Status.To_DO;
                break;
        }
        return chosen;
    }
    enum Report{
        Display_Done_Tasks,
        Display_Longest_Task,
        Search_For_Task_By_Name,
        Search_For_Task_By_Developer,
        Remove_Task_By_Name,
        Display_All_Tasks
    }

    static void showReportItems(){
        System.out.println("\nStatuses: \n");
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
                    break;
                case 1:
                    TaskManager.showLongestTask();
                    break;
                case 2:
                    TaskManager.searchTasksByName();
                    break;
                case 3:
                    TaskManager.searchTasksByDevName();
                    break;
                case 4:
                    TaskManager.deleteTaskByName();
                    break;
                case 5:
                    TaskManager.fullReport();
                    break;
                case 6:
                    System.exit(0);
                    break;

            }
        } else {
            System.out.println("Invalid Choice");
            promptReport();
        }


    }
}
