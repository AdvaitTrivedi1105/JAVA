
public class Variables {

	public static void main(String[] args) {
		
		// Variables in Java must be in camelCase, 	i.e;	myVar
		
		// 1) int - 32 bit value
		// 2) short - 16 bit value
		// 3) long - 64 bit value
		// 4) double - precise decimal numbers
		// 5) float - must take an f at the end of number,	i.e;	3.168f
		// 6) char - Unicode character using single quotes,	i.e;	'a'
		// 7) boolean - true or false,	i.e;	a = true / a = false
		// 8) byte - 6 bit data,	i.e;	numbers in range from -128 to 127 
		
		int aInt = 42;		
		short aShort = 93;
		long aLong = 8304;
		double aDouble = 3.4553;
		float aFloat = 5.234f;
		char aChar = 'b';
		boolean aBoolean = true;
		byte aByte = 127;
		
		System.out.println("int: " + aInt);
		System.out.println("short: " + aShort);
		System.out.println("long: " + aLong);
		System.out.println("double: " + aDouble);
		System.out.println("float: " + aFloat);
		System.out.println("char: " + aChar);
		System.out.println("boolean: " + aBoolean);
		System.out.println("byte: " + aByte);
		
	}

}
