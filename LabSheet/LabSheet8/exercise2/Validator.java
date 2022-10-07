package LabSheet8.exercise2;

public class Validator {
    public static boolean isValidRegistrationNumber(String reg) {
        if (reg.length() >= 6 && reg.length() <= 12) {
            if (Character.isDigit(reg.charAt(0)) && Character.isDigit(reg.charAt(1))) {
                if (reg.charAt(2) == '-') {
                    if (((Character.isUpperCase(reg.charAt(3)) && Character.isUpperCase(reg.charAt(4)) && reg.charAt(5) == '-')) ||
                            (Character.isUpperCase(reg.charAt(3)) && reg.charAt(4) == '-' && Character.isDigit(reg.charAt(5)))) {
                        for (int i = 6; i < reg.length(); i++) {
                            if (Character.isDigit(reg.charAt(i)))
                                return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
