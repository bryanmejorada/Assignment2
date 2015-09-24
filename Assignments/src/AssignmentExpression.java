import java.util.Scanner;

public class AssignmentExpression {

	public static void main(String[] args) {
		
		int exp1 = 0;
		double exp2 = 0.0;
		double exp3 = 0.0;
		int exp4 = 0;
		double exp6 = 0.0;
		double exp7 = 0.0;
		double exp8 = 0.0;
				
		Scanner input = new Scanner(System.in);
		
		System.out.println("Which expression would you like?");
		input.next();
		
		int Expression1 = (1/2);
		
		System.out.println("" + Expression1 +"");
		
		System.out.println("Which expression would you like?");
		input.next();
		
		double Expression2 = (1%2);
		
		System.out.println("" + Expression2 +"");
		
		System.out.println("Which expression would you like?");
		input.next();
		
		double Expression3 = (1.0/2);
		
		System.out.println("" + Expression3 +"");
		
		System.out.println("Which expression would you like?");
		input.next();
		
		int Expression4 = (5 + 7 / 2);
		
		System.out.println("" + Expression4 +"");
		
		System.out.println("Which expression would you like?");
		input.next();
		
		double Expression6 = (6 + 13 / 5 - 35 % 3);
		
		System.out.println("" + Expression6 +"");
		
		System.out.println("Which expression would you like?");
		input.next();
		
		double Expression7 = (3.5 * (5/4));
		
		System.out.println("" + Expression7 +"");
		
		System.out.println("Which expression would you like?");
		input.next();
		
		double Expression8 = (3.5 * 5) /4;
		
		System.out.println("" + Expression8 +"");
		
		
		
		
		
		
		
		
	}

}
