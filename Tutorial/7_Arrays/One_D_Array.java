
public class One_D_Array {
	public static void main(String[] args) {
		
		int number = 10;
		
//		int[] numbers = {15,20,25,30,35};	will create an array of declared numbers.
		
		int[] numbers = new int[5];
		numbers[0] = 15;
		numbers[1] = 20;
		numbers[2] = 25;
		numbers[3] = 30;
		numbers[4] = 35;
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}