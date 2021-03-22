
public class If_Statement {
	public static void main(String[] args) {
		
		int amount = 0;
		while(true) {
			System.out.println("In the loop for amount " + amount);
			if(amount == 6) {
				break;
			}
			amount++;
			System.out.println("Out of the loop for amount " + amount);
		}
	}
}
