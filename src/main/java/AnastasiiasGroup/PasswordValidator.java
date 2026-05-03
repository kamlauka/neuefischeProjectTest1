package AnastasiiasGroup;


import java.security.SecureRandom;

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

    public static boolean containsUpperAndLower(String password) {
        boolean hasUpper = false;
        boolean hasLower = false;
        for (char passwordChar: password.toCharArray()) {

            if (Character.isLowerCase(passwordChar)) {
                hasLower = true;
            }
            if (Character.isUpperCase(passwordChar)) {
                hasUpper = true;
            }
        }
        return hasUpper && hasLower;
    }

    public static boolean isCommonPassword(String password) {
        String[] commonPasswordsList = {"passwort1", "qwertyui", "123456qw", "passwort2"};
        String lowerCasePassword = password.trim().toLowerCase();

        for (String passwordFromTheList : commonPasswordsList) {
            if (passwordFromTheList.equals(lowerCasePassword)) {
                return true;
            }
        }

        return false;
    }

    public static boolean containsSpecialChar(String password) {
        String specialChars = "!@#$%&*()-_+=?.,;:";

        for(char passwordChar : password.toCharArray()) {
            if (specialChars.contains(String.valueOf(passwordChar))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(String password) {
        return hasMinLength(password, 8) && containsDigit(password) && containsUpperAndLower(password) && !isCommonPassword(password) && containsSpecialChar(password);
    }

    public static String generateSecurePassword(int length, String allowedSpecials) {
        StringBuilder newPassword = new StringBuilder(length);
        SecureRandom random = new SecureRandom();
        int randomIndex;

        String allChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789" + allowedSpecials;

        for (int i = 0; i < length; i++) {
            randomIndex = random.nextInt(allChars.length());
            newPassword.append(allChars.charAt(randomIndex));
        }

        return newPassword.toString();
    }


}