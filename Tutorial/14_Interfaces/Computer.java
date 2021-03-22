/*
 *  Computer implements Information means that 
 *  Computer class will implement every methods defined 
 *  in Information interface (class basically).
 */
public class Computer implements Information {
	private int serialNumber = 8035;
	
	public void start() {
		System.out.println("Computer started!");
	}
	
	@Override
	public void displayInformation() {
		System.out.println("Computer serial number is: "+serialNumber);
	}
}
