package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password to validate: ");
        String password = scanner.nextLine();

        validatePassword validatePassword = new validatePassword();
        boolean output = validatePassword.isPasswordSecure(password);
        System.out.println("Is the password secure? " + output);
    }
}