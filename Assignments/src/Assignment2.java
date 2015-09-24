import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {

		double num1 = 0.0;
		double num2 = 0.0;
		double num3 = 0.0;
		double num4 = 0.0;
		double num5 = 0.0;

		Scanner input = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter your first number");
		num1 = input.nextDouble();

		System.out.println("Enter your second number");
		num2 = input.nextDouble();

		System.out.println("Enter your third number");
		num3 = input.nextDouble();

		System.out.println("Enter your fourth number");
		num4 = input.nextDouble();

		System.out.println("Enter your fifth number");
		num5 = input.nextDouble();

		double sum = num1 + num2 + num3 + num4 + num5;
		double average = (num1 + num2 + num3 + num4 + num5) / 5;
		
		System.out.println("The sum is: " + sum + "\n" + "The average is: " + average + "");
			
		}
	}

