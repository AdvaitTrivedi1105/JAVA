package Example2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Handling_Exception_2 {

	public static void main(String[] args) {

		File file = new File("example.txt");
		
		try {
			Scanner readFile = new Scanner(file);
			
			while(readFile.hasNext()) {
				System.out.println(readFile.nextLine());
			}
			readFile.close();
		} 
		catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("File not found: "+file.toString());
		}		
		
		System.out.println("\nLine after try-catch block is executed.");
		
	}
}