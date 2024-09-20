import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "unlock"; // correct password
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter password: ");
            String inputPassword = scanner.next();

            if (inputPassword.equals(password)) {
                System.out.println("Login successful!");
                return;
            } else {
                attempts++;
                System.out.println("Invalid password. Attempts remaining: " + (3 - attempts));
            }
        }

        System.out.println("Maximum attempts reached. Login failed.");
    }
}