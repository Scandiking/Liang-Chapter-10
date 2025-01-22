
import java.util.Scanner;
public class TestLoanClass {
    public static void main(String[] args) {
        // Create new instance of scanner class
        Scanner scanscan = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter annual interest rate, for example, 8.25: ");
        // Assign value to double variable
        double annualInterestRate = scanscan.nextDouble();

        // Enter numbers of years
        System.out.print("Enter number of years as an integer: ");
        // Assign value to integer variable
        int numberOfYears = scanscan.nextInt();

        // Enter loan amount
        System.out.print("Enter loan amount, for example, 120000.95: ");
        // Assign value to double variable
        double loanAmount = scanscan.nextDouble();

        // Create a new instance of Loan object
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        // Display the loan date, monthly payment, and total payment
        System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n",
                loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
    }
}
