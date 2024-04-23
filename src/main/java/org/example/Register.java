package org.example;

public class Register {

    public static boolean checkPasswordComplexity(String password) {
        if (password.length()<8){
           return false;
    }
        boolean Pcaps = false;
        boolean Pnum = false;
        boolean Pspecial = false;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                Pcaps = true;
            } else if (Character.isDigit(ch)) {
                Pnum = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                Pspecial = true;
                //CHeck for special character
            }
        }
        return Pcaps && Pnum && Pspecial;
    }

    public static boolean checkUserName(String user_name){
        boolean underscore = user_name.contains("_");
        return user_name.length() <= 5 && underscore;
    }
    public static boolean checkavailable(String user_name){
        return Users.findUserByName(user_name) == null;
    }
    static void registerUser() {
        String username = Users.promptUsername();
        if (!checkUserName(username)|| !checkavailable(username)) {
            System.out.println("Username must contain no more than 5 characters and an \"_\"");
            registerUser();
        } else{
            System.out.println("Username is valid");
        }
        String password = Users.promptpassword();
        if (checkPasswordComplexity(password)) {
            System.out.println("Password successfully captured");
        } else {

            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
            registerUser();
        }
        String name = Users.promptName();
        String surname = Users.promptSurname();
        Users user = new Users(username, password, name, surname);
        if (checkUserName(username) && checkPasswordComplexity(password)) {
            Users.usersArr[Users.counter] = user;
            Users.counter++;
            System.out.println("User has registered");
        }
    }



}
