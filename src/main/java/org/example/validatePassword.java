package org.example;

public class validatePassword {
    public boolean isPasswordSecure(String password) {

        password = password.replace(" ", "");
        boolean length = true;
        if (password.length() < 8) {
            length = false;

        }
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for(int i = 0; i < password.length(); i++){
            char c = password.charAt(i);

            if(Character.isLowerCase(c)){
                hasLower = true;
            }
            if(Character.isUpperCase(c)){
                hasUpper = true;
            }
        }

        return length && hasLower;
    }

    public static void main(String[] args){
        validatePassword validatePassword = new validatePassword();
        System.out.println(validatePassword.isPasswordSecure("sdfghjkjhgfd"));
    }
}

