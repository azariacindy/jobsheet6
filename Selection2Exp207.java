import java.util.Scanner;

public class Selection2Exp207 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input07 = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the value of angle1: ");
        double angle1 = input07.nextDouble();

        System.out.print("Enter the value of angle2: ");
        double angle2 = input07.nextDouble();

        System.out.print("Enter the value of angle3: ");
        double angle3 = input07.nextDouble();

        double totalAngle = angle1+angle2+angle3;

        if (totalAngle == 180) {
            // Check for types of triangles
            if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
                System.out.println("Equilateral triangle"); // All angles are 60 degrees
            } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("Isosceles triangle"); // At least two angles are equal
            } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("Right triangle"); // At least one angle is 90 degrees
            } else {
                System.out.println("Scalene triangle"); // None of the above conditions met
            }
        } else {
            System.out.println("Not a triangle");
        }

        // Close the Scanner to release resources
        input07.close();
    }
}
