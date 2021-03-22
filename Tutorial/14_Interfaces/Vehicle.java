// Class can extend only one class. i.e; Vehicle extends Computer.
// But, class can implement multiple interfaces. i.e; Vehicle implements Information, Data.
public class Vehicle implements Information{

	private String type;
	
	public void drive() {
		System.out.println("Driving the vehicle.");
	}
	
	public Vehicle(String type){
		this.type = type;
	}
	
	@Override
	public void displayInformation() {
		System.out.println("Vehicle type is: "+type);
	}
}
