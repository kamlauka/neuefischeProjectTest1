package AnastasiiasGroup;

public final class PasswordValidator {
    public static boolean hasMinLength(String password, int min) {
        return password != null && password.length() >= min;
    }

    public static boolean containsDigit(String password) {
        for (char passwordChar: password.toCharArray()) {
            if (Character.isDigit(passwordChar)) {
                return true;
            }
        }
        return false;
    }
}