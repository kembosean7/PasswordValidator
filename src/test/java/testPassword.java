import static org.junit.Assert.*;
import  org.junit.Test;
import org.example.validatePassword;


public class testPassword {
    @Test
    public void testValidPassowrd(){

        validatePassword validatePassword = new validatePassword();
        boolean output1 = validatePassword.isPasswordSecure("biggieP7$");
        boolean output2 = validatePassword.isPasswordSecure("Sk7@prince");
        boolean output3 = validatePassword.isPasswordSecure("Wale78909_");

        assertTrue(output1);
        assertTrue(output2);
        assertTrue(output3);
    }

    @Test
    public void testInvalidPassword() {
        validatePassword validatePassword = new validatePassword();
        boolean output1 = validatePassword.isPasswordSecure("         ");
        boolean output2 = validatePassword.isPasswordSecure("Sk7prince");
        boolean output3 = validatePassword.isPasswordSecure("official89");

        assertFalse(output1);
        assertFalse(output2);
        assertFalse(output3);
    }

    @Test
    public void testSpecialChar(){

        validatePassword validatePassword =new validatePassword();
        boolean output1 = validatePassword.isPasswordSecure("Kembotadiwa7@");
        boolean output2 = validatePassword.isPasswordSecure("Sk7prince");
        boolean output3 = validatePassword.isPasswordSecure("Official89#");

        assertTrue(output1);
        assertFalse(output2);
        assertTrue(output3);
    }

    @Test
    public void testUpperCase(){

        validatePassword validatePassword =new validatePassword();
        boolean output1 = validatePassword.isPasswordSecure("cjTaona7@");
        boolean output2 = validatePassword.isPasswordSecure("official89#");

        assertTrue(output1);
        assertFalse(output2);

    }

    @Test
    public void testLowerCase(){

        validatePassword validatePassword =new validatePassword();
        boolean output1 = validatePassword.isPasswordSecure("TAONA@1234");
        boolean output2 = validatePassword.isPasswordSecure("Official89$");

        assertFalse(output1);
        assertTrue(output2);
    }

    @Test
    public void testLength(){

        validatePassword validatePassword =new validatePassword();
        boolean output1 = validatePassword.isPasswordSecure("Taku@1234");
        boolean output2 = validatePassword.isPasswordSecure("Ofc89$");

        assertTrue(output1);
        assertFalse(output2);

    }

}
