import java.util.Scanner;

public class User_Input {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		// input is an Object of Scanner class
		
		System.out.println("Enter a text line: ");
		String text = input.nextLine();
		System.out.println("Your line is '" + text + "'\n\n");
		
		
		System.out.println("Enter a number: ");
		int aInt = input.nextInt();
		System.out.println("Your number is: " + aInt + "\n\n");
		
		
		System.out.println("Enter a decimal value: ");
		double aDouble = input.nextDouble();
		System.out.println("Your decimal value is: " + aDouble);
		
	}
}