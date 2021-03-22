import java.util.Scanner;
class MyMethod{
	
	int add(int a, int b) {
		return a+b;
	}
	
	void speak(String text) {
		System.out.println(text);
	}
}

public class Return_Methods {
	public static void main(String[] args) {
		
		MyMethod obj = new MyMethod();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		System.out.println(a+" + "+b+" = "+obj.add(a, b));
		
		obj.speak("\nHi, there!");
	}
}
