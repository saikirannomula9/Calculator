import java.util.Scanner;

public class Calculator {
	static double memory = 0;
	public static void main(String[]args) {
		  Scanner sc = new Scanner(System.in);
	        int choice;
	        char again = 'Y';

	        do {
	            System.out.println("\n===== CALCULATOR =====");
	            System.out.println("1. Addition");
	            System.out.println("2. Subtraction");
	            System.out.println("3. Multiplication");
	            System.out.println("4. Division");
	            System.out.println("5. Modulus");
	            System.out.println("6. Square Root");
	            System.out.println("7. Power");
	            System.out.println("8. M+ (Add to Memory)");
	            System.out.println("9. M- (Subtract from Memory)");
	            System.out.println("10. MR (Memory Recall)");
	            System.out.print("Enter your choice: ");

	            if (!sc.hasNextInt()) {
	            	System.out.println("Invalid input! Pleae enter a number.");
	            	sc.next();
	            	continue;
	            }
	            choice = sc.nextInt();
	        
	            double num1, num2, result = 0;

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter first number: ");
	                    num1 = sc.nextDouble();
	                    System.out.print("Enter second number: ");
	                    num2 = sc.nextDouble();
	                    result = add(num1, num2);
	                    System.out.println("Result = " + result);
	                    break;

	                case 2:
	                    System.out.print("Enter first number: ");
	                    num1 = sc.nextDouble();
	                    System.out.print("Enter second number: ");
	                    num2 = sc.nextDouble();
	                    result = subtract(num1, num2);
	                    System.out.println("Result = " + result);
	                    break;

	                case 3:
	                    System.out.print("Enter first number: ");
	                    num1 = sc.nextDouble();
	                    System.out.print("Enter second number: ");
	                    num2 = sc.nextDouble();
	                    result = multiply(num1, num2);
	                    System.out.println("Result = " + result);
	                    break;

	                case 4:
	                    System.out.print("Enter first number: ");
	                    num1 = sc.nextDouble();
	                    System.out.print("Enter second number: ");
	                    num2 = sc.nextDouble();
	                    result = divide(num1, num2);
	                    break;

	                case 5:
	                    System.out.print("Enter first number: ");
	                    num1 = sc.nextDouble();
	                    System.out.print("Enter second number: ");
	                    num2 = sc.nextDouble();
	                    result = modulus(num1, num2);
	                    System.out.println("Result = " + result);
	                    break;

	                case 6:
	                    System.out.print("Enter number: ");
	                    num1 = sc.nextDouble();
	                    result = squareRoot(num1);
	                    break;

	                case 7:
	                    System.out.print("Enter base: ");
	                    num1 = sc.nextDouble();
	                    System.out.print("Enter power: ");
	                    num2 = sc.nextDouble();
	                    result = power(num1, num2);
	                    System.out.println("Result = " + result);
	                    break;

	                case 8:
	                    System.out.print("Enter value to add to memory: ");
	                    memory += sc.nextDouble();
	                    System.out.println("Memory = " + memory);
	                    break;

	                case 9:
	                    System.out.print("Enter value to subtract from memory: ");
	                    memory -= sc.nextDouble();
	                    System.out.println("Memory = " + memory);
	                    break;

	                case 10:
	                    System.out.println("Memory = " + memory);
	                    break;

	                default:
	                    System.out.println("Invalid Choice!");
	            }

	            System.out.print("\nDo you want to continue? (Y/N): ");
	            again = sc.next().charAt(0);

	        } while (again == 'Y' || again == 'y');

	        System.out.println("Calculator Closed.");
	        sc.close();
	    }

	    public static double add(double a, double b) {
	        return a + b;
	    }

	    public static double subtract(double a, double b) {
	        return a - b;
	    }

	    public static double multiply(double a, double b) {
	        return a * b;
	    }

	    public static double divide(double a, double b) {
	        if (b == 0) {
	            System.out.println("Cannot divide by zero.");
	            return 0;
	        }
	        double result = a / b;
	        System.out.println("Result = " + result);
	        return result;
	    }
	    public static double modulus(double a, double b) {
	        return a % b;
	    }

	    public static double squareRoot(double a) {
	        if (a < 0) {
	            System.out.println("Square root of negative number is not possible.");
	            return 0;
	        }
	        double result = Math.sqrt(a);
	        System.out.println("Result = " + result);
	        return result;
	    }
	    public static double power(double a, double b) {
	        return Math.pow(a, b);
	    }
	
	        

	        
	    }
	
	



