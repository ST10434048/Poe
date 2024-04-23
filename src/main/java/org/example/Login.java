package org.example;

public class Login {
    static void credscheck(String username, String password){
        for (int i= 0; i<Users.counter;i++){
            if(Users.usersArr[i]._userName.equals(username)&& Users.usersArr[i]._Password.equals(password)){
                System.out.println("Welcome: " + Users.usersArr[i]._fName +" "+ Users.usersArr[i]._lName);
            }else{
                System.out.println("Username or password incorrect, please try again");
            }
        }
    }

    static Boolean returnLoginStatus(String username, String password){
        for (int i= 0; i<Users.counter;i++){
            if(Users.usersArr[i]._userName.equals(username)&& Users.usersArr[i]._Password.equals(password)) {
                return true;
            }
        }return false;
    }
    static void loginUser(){
        String username = Users.promptUsername();
        String password = Users.promptpassword();
        credscheck(username,password);
        if(returnLoginStatus(username,password)){
            System.out.println("Login Successful");
            while(returnLoginStatus(username,password)){
                TaskMenu.promptKanbanChoice();
            }
        }else {
        System.out.println("Failed login");
        loginUser();
        }
    }
}
