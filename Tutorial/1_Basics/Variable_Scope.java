
public class Variable_Scope {
	public static void main(String[] args) {
				
		String global = "This is global";		// Global scope, can be accessed anywhere
		
		
		for(int local=0; local<10; local++) {
			if(local == 5) {
				global = "Global changed in for loop";
			}
			System.out.println("Current Local = " + local);
			System.out.println("Current Global = " + global + "\n");
		}
			/*
			 * Here, 
			 * i can be accessed only in this for loop,
			 * and not outside.
			 */
	}
}