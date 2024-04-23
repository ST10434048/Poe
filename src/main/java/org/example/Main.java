package org.example;

public class Main {
    static int choice = -1;
    static int kChoice = -1;
    public static void main(String[] args) {
        while (choice!=2 || kChoice!=1) {
            Menu.promptUser();
        }
    }
}