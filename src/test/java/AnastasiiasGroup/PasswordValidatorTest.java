package AnastasiiasGroup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    @Test
        void hasMinLength_returnTrue_whenLengthIsEight() {
        //GIVEN
        String Password = "abcdefgh";
        int minLength = 8;
        //WHEN
        boolean result = PasswordValidator.hasMinLength(Password, minLength);
        //THEN
        assertTrue(result);
    }


}