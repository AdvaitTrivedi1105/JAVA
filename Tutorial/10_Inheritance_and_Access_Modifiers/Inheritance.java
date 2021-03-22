
public class Inheritance {
	public static void main(String[] args) {
		
		// Object is created by Inherited methods from class Factory
		System.out.println("Calls to Factory class:-");
		Factory factory1 = new Factory();
		factory1.design();
		factory1.build();
		factory1.common();
		
		// Object is created by Inherited methods from class Car
		System.out.println("\nCalls to Car class:-");
		Car car1 = new Car();
		car1.design();
		car1.build();
		car1.brand();
		car1.common();
		
	}
}