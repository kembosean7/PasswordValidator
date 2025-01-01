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
            if(Character.isDigit(c)){
                hasDigit = true;
            }
            if(!Character.isLetterOrDigit(c)){
                hasSpecial =  true;
            }
        }

        return length && hasLower && hasUpper  && hasDigit && hasSpecial;
    }

    public static void main(String[] args){
        validatePassword validatePassword = new validatePassword();
        System.out.println(validatePassword.isPasswordSecure("sdfghjkW2jhgfd +"));
    }
}

