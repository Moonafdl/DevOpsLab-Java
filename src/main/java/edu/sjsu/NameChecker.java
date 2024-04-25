package edu.sjsu;

import java.util.regex.Pattern;

public class NameChecker {
    /**
     * Checks if a given string is a valid name following these rules:
     * - Between 2 to 40 characters
     * - Contains only alphabetic characters, non-consecutive hyphens, or a single quote
     * - Cannot start with a hyphen or single quote
     * 
     * @param input Name to check
     * @return True if input is a valid name, else false
     */
    public static boolean check(String input) {
        // Check length
        if (input.length() < 2 || input.length() > 40) {
            return false;
        }

        if (input.startsWith("-") || input.startsWith("'")) {
            return false;
        }

        if (!Pattern.matches("[a-zA-Z'-]+", input)) {
            return false;
        }

        if (input.contains("--")) {
            return false;
        }

        return true;
    }
}
