import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        System.out.println("Enter your birth month: ");
        int birthMonth = scanner.nextInt();

        System.out.println("Enter your birth day: ");
        int birthDay = scanner.nextInt();

        System.out.println("Enter the current year: ");
        int currentYear = scanner.nextInt();

        System.out.println("Enter the current month: ");
        int currentMonth = scanner.nextInt();

        System.out.println("Enter the current day: ");
        int currentDay = scanner.nextInt();

        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate currentDate = LocalDate.of(currentYear, currentMonth, currentDay);

        Period period = Period.between(birthDate, currentDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("You are " + years + " years, " + months + " months, and " + days + " days old.");
    }
}