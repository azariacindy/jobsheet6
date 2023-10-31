import java.util.Scanner;

public class Selection2Exp107 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input07 = new Scanner(System.in);

        // Get the year from the user
        System.out.print("Enter a year: ");
        int year = input07.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            } else {
                System.out.println("Leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }

        // Close the Scanner to release resources
        input07.close();
    }
}
