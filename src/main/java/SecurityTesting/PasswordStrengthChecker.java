package SecurityTesting;

import java.util.Scanner;

public class PasswordStrengthChecker {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            // Check password strength
            int score = 0;
            if (password.length() >= 8) score++;
            if (password.matches(".*[A-Z].*")) score++;
            if (password.matches(".*[a-z].*")) score++;
            if (password.matches(".*\\d.*")) score++;
            if (password.matches(".*[!@#$%^&*()].*")) score++;

            // Provide feedback based on score
            switch (score) {
                case 5:
                    System.out.println("Password Strength: Strong");
                    break;
                case 3:
                case 4:
                    System.out.println("Password Strength: Moderate");
                    break;
                default:
                    System.out.println("Password Strength: Weak");
                    System.out.println("Suggestions to improve:");
                    if (password.length() < 8) System.out.println("- Make it at least 8 characters long.");
                    if (!password.matches(".*[A-Z].*")) System.out.println("- Add an uppercase letter.");
                    if (!password.matches(".*[a-z].*")) System.out.println("- Add a lowercase letter.");
                    if (!password.matches(".*\\d.*")) System.out.println("- Add a digit.");
                    if (!password.matches(".*[!@#$%^&*()].*")) System.out.println("- Add a special character.");
                    break;
            }

            scanner.close();
        }
    }
