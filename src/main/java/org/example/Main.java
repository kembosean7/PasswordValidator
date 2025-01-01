package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        validatePassword validatePassword = new validatePassword();
        boolean output = validatePassword.isPasswordSecure("seaS2425_n");
        System.out.println(output);
    }
}