import static org.junit.Assert.assertTrue;
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

}
