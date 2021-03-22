/*
 * Anonymous class are used to basically create a sub - class 
 * without extending to any new class but instead creating it
 * at the time of creating any object.
 * i.e;

   Computer computer1 = new Computer(){
   @Override
   [method to be overridden(changed) temporarily for this object]
   };
   
 */


class Computer{
	
	public void shutDown() {
		System.out.println("Computer is shutting down.");
	}
	
}


interface Phone{
	
	public void call();
	
}


public class Anonymous_Class {
	
	public static void main(String[] args) {
		
		
		
		// Creating an object of Computer class and Anonymous class is also created within {};
		
		Computer computer1 = new Computer() {		
			
			@Override
			public void shutDown() {
				System.out.println("MacBook is shutting down.");
			}
			
		};
		
		
		computer1.shutDown();
		
				
		Phone phone1 = new Phone() {
			
			@Override
			public void call() {
					System.out.println("Calling...");
			}
			
		};
		
		
		phone1.call();
		
	}
}