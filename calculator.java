import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // compound interest calculator

        Scanner scanner = new Scanner(System.in);
        System.out.println("Compound Interest Calculator");
        // Prompt user for input
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        // Prompt for the rate of interest
         // Convert percentage to decimal
         // Prompt for the time in years
        System.out.print("Enter the rate of interest (in %): ");
        double rate = scanner.nextDouble() / 100;
         // Convert percentage to decimal
        System.out.print("Enter the time (in years): ");  
        double time = scanner.nextDouble();
        // Prompt for the number of times interest is compounded per year
        System.out.print("Enter the number of times interest is compounded per year: ");   
        int n = scanner.nextInt();
        // Calculate compound interest
        double compoundInterest = principal * Math.pow((1 + rate / n), n * time) - principal;
        // Display the result             
        System.out.printf("The compound interest is: %.2f%n", compoundInterest);
        // Display the total amount after interest
        double totalAmount = principal + compoundInterest;
        System.out.printf("The total amount after interest is R %.2f%n", totalAmount);
    }
}