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
}