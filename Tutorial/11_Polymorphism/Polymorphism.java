/*
 * Polymorphism is a greek word meaning 'many shapes'.
 
 * Here, Polymorphism means that if you have any sub - class (Car)
 * of any super - class (Vehicle) then you 'CAN' use sub - class (Car) 
 * where you would generally use super - class (Vehicle).
 */

public class Polymorphism {
	
	public static void main(String[] args) {
		Car car1 = new Car();
		Vehicle vehicle1 = car1;	// This is Polymorphism, it will use Car class.
		
		vehicle1.design();
		car1.ride();
		
		createDesign(car1);
	}
	
	public static void createDesign(Vehicle vehicle) {
		vehicle.design();
	}
	
}