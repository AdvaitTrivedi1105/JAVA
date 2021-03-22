class Program{
	// Constructor should have same name as the class
	
	int value;
	String text;
	
	public Program() {
		this(5);		// will call second constructor
		System.out.println("First constructor");
		value = 12;
	}
	
	public Program(int value) {
		this.value = value;
		System.out.println("Second constructor");
	}
	
	public Program(int value, String text) {
		this();			// will call first constructor
		this.value = value;
		this.text = text;
		System.out.println("Third constructor");
	}
}

public class Constructors {
	public static void main(String[] args) {
		Program myProgram = new Program();
		Program myProgram1 =  new Program(2);
		Program myProgram2 = new Program(5, "Hi");
	}
}