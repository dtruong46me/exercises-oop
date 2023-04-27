package problem13.validation;

public class FullNameValidation {
    public static boolean isValidFullName (String fullName) {
        // Full Name is empty
        if (fullName == null) {
            return false;
        }

        // Full Name Start with or Ends with space " "
        if (fullName.startsWith(" ") || fullName.endsWith(" ")) {
            return false;
        }

        // Full Name have double spaces "  "
        if (fullName.matches(".*\\s{2,}.*")) {
            return false;
        }

        String[] stringParts = fullName.split("\\s+");
        // Full Name only has First Name or Last Name (Length quals to 1)
        if (stringParts.length == 1) {
            return false;
        }

        // Check Full Name has no special character
        for (String part : stringParts) {
            if (!part.matches("[a-zAZ]+")) {
                return false;
            }
        }
        return true;
    }
}
