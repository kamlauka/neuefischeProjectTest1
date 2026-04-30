package AnastasiiasGroup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    @Test
        void hasMinLength() {
            int minLength = 8;

            //7 chars
            assertFalse(PasswordValidator.hasMinLength("abcdefg", minLength));
            assertFalse(PasswordValidator.hasMinLength("", minLength));
            assertFalse(PasswordValidator.hasMinLength(null, minLength));


            //8 chars
            assertTrue(PasswordValidator.hasMinLength("abcdefgh", minLength));
            //9 chars
            assertTrue(PasswordValidator.hasMinLength("abcdefghi", minLength));

        }



    @Test
    void containsDigit_returnFalse_withoutNumber() {
        String password = "abcdefgh";
        boolean result = PasswordValidator.containsDigit(password);
        assertFalse(result);
    }

    @Test
    void containsDigit_returnTrue_withOneNumber() {
        String password = "abcdefg1";
        boolean result = PasswordValidator.containsDigit(password);
        assertTrue(result);
    }

    @Test
    void containsDigit_returnTrue_withThreeNumbers() {
        String password = "abcde321";
        boolean result = PasswordValidator.containsDigit(password);
        assertTrue(result);
    }

    @Test
    void containsDigit_returnTrue_onlyNumbers() {
        String password = "12345678";
        boolean result = PasswordValidator.containsDigit(password);
        assertTrue(result);
    }
}