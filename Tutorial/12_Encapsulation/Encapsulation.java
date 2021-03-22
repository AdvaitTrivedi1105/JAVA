class Car{
	
	public static final int speed = 150;
	private String type;
	
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	
	public String getRevenueData() {
		String data = "Revenue: " + calculateRevenue();
		return data;
	}
	private int calculateRevenue() {
		return 12000;
	}
	
}


public class Encapsulation {
	public static void main(String[] args) {
		
		Car c1 = new Car();	
		
		c1.setType("Type setter and getter");
		System.out.println(c1.getType());
		
		System.out.println(c1.getRevenueData());	
		
	}
}