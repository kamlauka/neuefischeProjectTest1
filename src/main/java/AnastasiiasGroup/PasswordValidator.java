package AnastasiiasGroup;

public final class PasswordValidator {
    public static boolean hasMinLength(String password, int min) {
        return password != null && password.length() >= min;
    }

    public static boolean containsDigit(String password) {

        return false;
    }
}