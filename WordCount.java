import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.print("Enter name of text file, e.g. Iliad.txt: Total words = ");
		
		Scanner console = new Scanner(System.in);
		String str= console.next();	
		Scanner words = new Scanner(new File(str));
		
		  int wordcount = 0;
		 while (words.hasNext()) {
			 
		 String w = words.next();
		  wordcount++;
		  
		 }
		 System.out.println(wordcount);
		}
		  
}
