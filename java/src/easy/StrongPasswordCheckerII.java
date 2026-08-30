package easy;

public class StrongPasswordCheckerII {

    public boolean strongPasswordCheckerII(String password) {

        if (password.length() < 8) {
            return false;
        }

        String specialChar = "!@#$%^&*()-+";
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        boolean hasAdjacent = false;
        char prevChar = '\0';

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (specialChar.contains(String.valueOf(c))){
                hasSpecialChar = true;
            }

            if (c == prevChar) {
                hasAdjacent = true;
            }
            prevChar = c;
        }

        if (!hasLowercase || !hasUppercase || !hasDigit || !hasSpecialChar || hasAdjacent) {
            return false;
        }

        return true;
    }
}
