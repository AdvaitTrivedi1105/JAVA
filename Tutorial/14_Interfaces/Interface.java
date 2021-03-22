// Interface - Two class that are totally different from each other can have same methods.


public class Interface {
	
	public static void main(String[] args) {		
		
		Computer computer1 = new Computer();
		computer1.start();
		Vehicle vehicle1 = new Vehicle("Car");
		vehicle1.drive();
		
		// Interface objects
		Information info = new Computer();
		info.displayInformation();
		Information info1 = vehicle1;
		info1.displayInformation();
		
		System.out.println();
		
		showInformation(computer1);
		showInformation(vehicle1);
	}
	
	// Creating a  method and passing interface object as arguments.
	private static void showInformation(Information info) {
		info.displayInformation();
	}
	
}