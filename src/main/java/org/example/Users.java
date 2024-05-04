package org.example;

import java.util.Scanner;

public class Users {
    String _userName;
    String _Password;
    String _fName;
    String _lName;
    Task[] _tasks;
    int _taskCounter;
    static Users _loggedUsers;
//    static Task task;

    public Users(String username, String password, String name, String surname) {
        this._userName = username;
        this._Password = password;
        this._fName = name;
        this._lName = surname;
        this._tasks = new Task[10];
        this._taskCounter = 0;
    }


    static int Length = 10;
    static int counter = 0;
    static Users[] usersArr = new Users[Length];

    public static String promptUsername() {
        System.out.print("\nInsert Username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        return username;
    }

    public static String promptpassword() {
        System.out.print("\nInsert Password: ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        return password;
    }

    static String promptName() {
        System.out.print("\nEnter your Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        return name;
    }

    static String promptSurname() {
        System.out.print("\nEnter your Surname: ");
        Scanner scanner = new Scanner(System.in);
        String surname = scanner.nextLine();

        return surname;
    }

    static Users findUserByName(String Name) {
        for (int i = 0; i < counter; i++) {
            if (usersArr[i]._userName.equals(Name)) {
                return usersArr[i];
            }
        }
        return null;
    }

    public static Users getLoggedInUsers(){
        return _loggedUsers;
    }

    public static void setLoggedInUser(Users user){
        _loggedUsers = user;
    }
}

