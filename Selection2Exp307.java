import java.util.Scanner;

public class Selection2Exp307 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input07 = new Scanner(System.in);

        String category;
        int income, netSalary;
        double tax = 0;

        System.out.println("Input category = ");
        category = input07.next();
        System.out.println("Input income = ");
        income = input07.nextInt();

        // Check the category and calculate tax
        if (category.equalsIgnoreCase("worker")) {
            if (income <= 2000000) {
                tax = 0.1;
            } else if (income <= 3000000) {
                tax = 0.15;
            } else {
                tax = 0.2;
                netSalary = (int) (income - (income * tax));
                System.out.println("Nett salary = "+ netSalary);
            }
        } else if (category.equalsIgnoreCase("businessman")) {
            if (income <= 2500000) {
                tax = 0.15;
            } else if (income <= 3500000) {
                tax = 0.2;
            } else {
                tax = 0.25;
                netSalary = (int) (income - (income * tax));
                System.out.println("Nett salary = "+ netSalary);
            } 
        } else {
            System.out.println("Invalid category!");
            return; // Exit the program if category is invalid
        }

        netSalary = (int) (income - (income * tax));
        System.out.println("Net salary = " + netSalary);

    }
}