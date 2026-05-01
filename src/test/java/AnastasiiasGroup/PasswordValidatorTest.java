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

    @Test
    void containsUpperAndLower_returnFalse_onlyUpperLetters() {
        String password = "ABCDEFGHI";
        boolean result = PasswordValidator.containsUpperAndLower(password);
        assertFalse(result);
    }

    @Test
    void containsUpperAndLower_returnFalse_onlyLowerLetters() {
        String password = "abcdefghi";
        boolean result = PasswordValidator.containsUpperAndLower(password);
        assertFalse(result);
    }

    @Test
    void containsUpperAndLower_returnTrue_upperAndLowerLetters() {
        String password = "abcdeFGHI";
        boolean result = PasswordValidator.containsUpperAndLower(password);
        assertTrue(result);
    }

    @Test
    void containsUpperAndLower_returnFalse_onlyOneLetter() {
        String password = "a2345678";
        boolean result = PasswordValidator.containsUpperAndLower(password);
        assertFalse(result);
    }

    @Test
    void isCommonPassword_returnTrue_passwordInListe () {
        String password = "Passwort1";
        boolean result = PasswordValidator.isCommonPassword(password);
        assertTrue(result);
    }

    @Test
    void isCommonPassword_returnFalse_passwordNotInListe () {
        String password = "VeryHardPassword";
        boolean result = PasswordValidator.isCommonPassword(password);
        assertFalse(result);
    }

    @Test
    void containsSpecialChar_returnTrue_oneSpecialChar () {
        assertTrue(PasswordValidator.containsSpecialChar("1Goodpassword#"));
    }

    @Test
    void containsSpecialChar_returnTrue_SpecialChars () {
        assertTrue(PasswordValidator.containsSpecialChar("%1Goodpa&&ssword"));
    }

    @Test
    void containsSpecialChar_returnFalse_withoutSpecialChar () {
        assertFalse(PasswordValidator.containsSpecialChar("88Goodpassword"));
    }

    @Test
    void isValidtests () {
        //POSITIVE
        assertTrue(PasswordValidator.isValid("1Goodpassword"));

        // NEGATIVE
        assertFalse(PasswordValidator.isValid("Ab1"));

        // NEGATIVE
        assertFalse(PasswordValidator.isValid("Abcdefghijk"));

        // NEGATIVE
        assertFalse(PasswordValidator.isValid("abcd12345"));

        // NEGATIVE
        assertFalse(PasswordValidator.isValid("ABCD12345"));

        // NEGATIVE
        assertFalse(PasswordValidator.isValid("123456qw"));

        // NEGATIVE
        assertFalse(PasswordValidator.isValid(null));

        // NEGATIVE
        assertFalse(PasswordValidator.isValid(null));

        // NEGATIVE
        assertFalse(PasswordValidator.isValid(""));
    }

}