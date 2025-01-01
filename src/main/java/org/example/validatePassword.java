package org.example;

public class validatePassword {
    public boolean isPasswordSecure(String password) {

        password = password.replace(" ", "");
        boolean output = true;
        if (password.length() < 8) {
            output = false;

        }
        return output;
    }

    public static void main(String[] args){
        validatePassword validatePassword = new validatePassword();
        System.out.println(validatePassword.isPasswordSecure("se34567u8iujhan"));
    }
}

