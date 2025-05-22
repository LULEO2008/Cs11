package u4;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the password: ");
        String password = scanner.nextLine();
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }
        int strength = 0;
        if (password.length() >= 8) {
            strength++;
        }
        if (hasUpperCase) {
            strength++;
        }
        if (hasLowerCase) {
            strength++;
        }
        if (hasNumber) {
            strength++;
        }
        if (hasSpecialChar) {
            strength++;
        }
        if (strength >= 4) {
            System.out.println("Strong passwords");
        } else if (strength >= 3) {
            System.out.println("Medium password strength");
        } else {
            System.out.println("Weak passwords");
        }
        scanner.close();
    }

}
