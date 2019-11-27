/*
 * Copyright 2019 Alemnew Asrese
 * <p>
 * A Roman number to decimal integer converter. The program converts roman numerals within the range I - MMMMCMXCIX
 * (i.e, 1 to 4999 in the decimal notation).
 *
 * @author alemnew.asrese@aalto.fi Alemnew Asrese
 * @version 1.0
 * Created on 2019/11/27
 */

package fi.documill.roman.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToDecimal {

    static final private Map<Character, Integer> ROMAN_DECIMAL = new HashMap<>();

    static {
        ROMAN_DECIMAL.put('I', 1);
        ROMAN_DECIMAL.put('V', 5);
        ROMAN_DECIMAL.put('X', 10);
        ROMAN_DECIMAL.put('L', 50);
        ROMAN_DECIMAL.put('C', 100);
        ROMAN_DECIMAL.put('D', 500);
        ROMAN_DECIMAL.put('M', 1000);
    }

    /**
     * Checks whether a given string contains a valid roman numeral within the range I - MMMMCMXCIX and
     * correctly formatted.
     *
     * @param str the string that contains the roman numeral.
     * @return true if the string is a valid roman number, false otherwise.
     */
    static private boolean isValid(String str) {
        return str.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");

    }

    /**
     * Convert roman number to decimal integer.
     *
     * @param str the roman number in string format.
     * @return the integer equivalent  of the roman string.
     */
    public int convertToDecimal(String str) {
        int decimal = 0;
        String roman = str.toUpperCase(); // Change all the user input to capital letter.
        int romanLength = roman.length();

        // Check if the string is valid roman numeral.
        if (!isValid(roman)) {
            return 0;
        }
        try {
            for (int i = 0; i < romanLength; i++) {
                int current = ROMAN_DECIMAL.get(roman.charAt(i));
                int next = (i + 1) < romanLength ? ROMAN_DECIMAL.get(roman.charAt(i + 1)) : 0;

                if (current >= next) {
                    decimal += current;
                } else {
                    decimal -= current;
                }
            }
            return decimal;
        } catch (NullPointerException e) {
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter the roman numeral or type 'quit' to exit: ");
        RomanToDecimal romanToDecimal = new RomanToDecimal();
        Scanner scanner = new Scanner(System.in);

        int decimal;
        while (true) {

            String roman = scanner.nextLine();
            if (roman.equals("quit")) {
                break;
            }

            decimal = romanToDecimal.convertToDecimal(roman);
            if (decimal == 0) {
                System.out.println("Invalid number. Please enter a valid roman number.");
            } else {
                System.out.println(decimal);
            }
        }

    }
}

