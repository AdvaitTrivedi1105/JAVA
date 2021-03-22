// Car is also a separate class file for Inheritance.
// Car extends Factory means Car is now a sub-class of Factory class.
// So, Factory is now super-class of Car class.

public class Car extends Factory{
	@Override
	public void design() {
		System.out.println("Design from Car sub-class extended from Factory super-class inherited");
	}
	
	@Override
	public void build() {
		System.out.println("Build from Car sub-class extended from Factory super-class inherited");
	}
	
	public void brand() {
		System.out.println("Tesla");
	}
}