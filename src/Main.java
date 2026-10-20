/*Random Password Generator - Simple Project
Author: Daniel Cuevas
 */

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String LOWER   = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER   = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS  = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()-_=+[]{};:,.?";
    private static final SecureRandom random = new SecureRandom();

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("How many characters long do you want your random password to be? ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Please enter a number");
                    scanner.next();
                    continue;
                }
                int lengthOfPass = scanner.nextInt();
                if (lengthOfPass < 8) {
                    System.out.println("Your password must be at least 8 characters long!");
                } else {
                    String password = generatePassword(lengthOfPass);
                    System.out.println("Password generated! Your password is " + password);
                    break;
                }
            }
        }
    }
    private static String generatePassword(int length){
        char upper = (UPPER.charAt(random.nextInt(UPPER.length())));
        char lower = (LOWER.charAt(random.nextInt(LOWER.length())));
        char digits = (DIGITS.charAt(random.nextInt(DIGITS.length())));
        char symbols = (SYMBOLS.charAt(random.nextInt(SYMBOLS.length())));
        List<Character> chars = new ArrayList<>();
        chars.add(upper);
        chars.add(lower);
        chars.add(digits);
        chars.add(symbols);
        String allChars = LOWER + UPPER + DIGITS + SYMBOLS;
        for(int i = 0; i < length - 4; i++){
            chars.add(allChars.charAt(random.nextInt(allChars.length())));
        }
        Collections.shuffle(chars, random);
        StringBuilder password = new StringBuilder();
        for (char c : chars) {
            password.append(c);
        }
        return password.toString();
    }
}