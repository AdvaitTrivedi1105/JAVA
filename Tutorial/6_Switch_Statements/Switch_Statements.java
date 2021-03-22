import java.util.Scanner;

public class Switch_Statements {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// Switch supports only char, byte, short, int, String.
		
		System.out.println("Enter your instructions: ");
		String text = input.nextLine();
		
		switch(text) {
		case "start":
			System.out.println("Program has Started successfully!");
			break;
		case "run":
			System.out.println("Program is Running...");
			break;
		case "stop":
			System.out.println("Unfortunately, Program has stopped!");
			break;
		default:
			System.out.println("Instruction not recognized!");
		}
	}
}