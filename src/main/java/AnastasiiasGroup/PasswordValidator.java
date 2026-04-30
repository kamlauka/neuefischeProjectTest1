package AnastasiiasGroup;

public final class PasswordValidator {
    public static boolean hasMinLength(String password, int min) {
            return password.length() >= min;
    }

}