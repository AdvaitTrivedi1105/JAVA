import java.util.Scanner;
public class Do_While_Loop {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n;
		do {
			System.out.println("Enter a Number: ");
			n = input.nextInt();
		}while(n != 9);
		
		System.out.println("You got " + n);
	}
}