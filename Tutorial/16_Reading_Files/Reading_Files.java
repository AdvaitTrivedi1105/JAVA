import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading_Files {

	public static void main(String[] args) throws FileNotFoundException {
		
		String myFile = "For_Java.txt";
		File file = new File(myFile);
		
		Scanner text = new Scanner(file);
		
		int value = text.nextInt();
		System.out.println("Value is: "+value);
		
		while(text.hasNextLine()) {
			String Line = text.nextLine();
			System.out.println(Line);
		}
		
		text.close();
		
	}
}
