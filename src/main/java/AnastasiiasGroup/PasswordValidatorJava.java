package AnastasiiasGroup;

public final class PasswordValidator {
    public static boolean hasMinLength(String password, int min);
    public static boolean containsDigit(String password);
    public static boolean containsUpperAndLower(String password);
    public static boolean isCommonPassword(String password);

    // Bonus:
    public static boolean containsSpecialChar(String password, String allowed);
    // Gesamtsicht:
    public static boolean isValid(String password); // nutzt die obenstehenden Checks
}