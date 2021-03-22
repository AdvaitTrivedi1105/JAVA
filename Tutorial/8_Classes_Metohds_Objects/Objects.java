class Methods{
	// Methods is a class
	
	String animal;
	int age;
	
	// info is a method
	void info() {
		System.out.println("My " + animal + " is " + age + " years old.");
	}
}

public class Objects {
	public static void main(String[] args) {
		
		Methods obj = new Methods();
		// obj is an object of Methods class
		
		obj.animal = "Cat";
		obj.age = 2;
		obj.info();
		
		obj.animal = "Dog";
		obj.age = 4;
		obj.info();
	}
}