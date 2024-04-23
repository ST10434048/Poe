package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Task {
    String _taskName;
    int _taskNumber;
    int _taskDuration;
    String _taskDescription;
    String _developerName;
    String _taskID;
    TaskMenu.Status _taskStatus;


    public Task(String taskName, int taskNumber, int taskDuration, String taskDescription, String developerName, String taskID, TaskMenu.Status taskStatus) {
        this._taskName = taskName;
        this._taskNumber = taskNumber;
        this._taskDuration = taskDuration;
        this._taskDescription = taskDescription;
        this._developerName = developerName;
        this._taskID = taskID;
        this._taskStatus = taskStatus;
    }
    static  int Length = 10;
    static int counter = 0;
    static Task[] taskArr = new Task[Length];

    public static String promptTaskName(){
        System.out.print("\nEnter Task Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        return name;
    }
    public static int promptDuration(){
        System.out.print("\nEnter Task duration ");
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();

        return duration;
    }
    public static String promptDevNam(){
        System.out.print("\nEnter Developer Name: ");
        Scanner scanner = new Scanner(System.in);
        String DevName = scanner.nextLine();

        return DevName;
    }

    public static String createTaskID(String devName, String taskName,int taskNumber){
        int len = devName.length();
        String a = taskName.substring(0,2);
        int c = taskNumber;
        String b = devName.substring(len-3,len);
        return String.format("%s:%s:%s",a,c,b);

    }
   public static String promptDescription(){
       System.out.println("Enter Task Description: ");
        Scanner scanner = new Scanner(System.in);
        String description = scanner.nextLine();
        return description;
    }
   public static Boolean checkTaskDescription(String description){
        return description.length()<=50;
    }

}
