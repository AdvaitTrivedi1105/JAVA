package Example1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Handling_Exception {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("example.txt");
		
		Scanner readFile = new Scanner(file);
		
		while(readFile.hasNext()) {
			System.out.println(readFile.nextLine());
		}
		
		readFile.close();
	}
}