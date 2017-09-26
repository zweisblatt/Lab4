import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        int hoursWorked = 0;
        double hourlyWage = 0.0;
        double weeklyEarnings = 0.0;

        System.out.println("Enter hourly wage.");
        hourlyWage = scnr.nextInt();

        System.out.println("Enter hours worked this week.");
        hourlyWage = scnr.nextInt();

        weeklyEarnings = hourlyWage * hoursWorked;

        System.out.println("You've earned "+weeklyEarnings+" this week.");
    }
}
