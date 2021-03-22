// This is separate class file for Inheritance, we will call methods of Factory in our Inheritance code

public class Factory {
	
	public void design() {
		System.out.println("Design from Factory class inherited.");
	}
		
	public void build() {
		System.out.println("Build from Factory class inherited.");
	}
	
	public void common() {
		System.out.println("Printing from common method present only in Factory class");
	}
}