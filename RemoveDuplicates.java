import java.util.ArrayList;
import java.util.Scanner;
public class RemoveDuplicates {

	public static void main(String[] args) {
		
		Scanner console = new Scanner (System.in);
		System.out.println();
		System.out.println("Please enter an alphabetical sequence of strings separated");
		System.out.println("by spaces. The end of the sequence must be signified using");
		System.out.println("the sentinel value lastString, followed by a return.");
		System.out.println();
		System.out.println();
		
		String str= console.next();
		ArrayList<String> original_list = new ArrayList<String>();
		ArrayList<String> revised_list = new ArrayList<String>();
		ArrayList<String> temp = new ArrayList<String>();
		if (!str.equalsIgnoreCase("lastString")) {
		original_list.add(str);
		revised_list.add(str);
		}
		int i =0;
		
		while (!str.equalsIgnoreCase("lastString")) {
			i++;
			str= console.next();
			if (!str.equalsIgnoreCase("lastString")) {
				original_list.add(str);
				String one = original_list.get(i-1);
				String two = original_list.get(i);
				
				String str1= str.toLowerCase();
				
				if (!(temp.contains(str1) || one.equalsIgnoreCase(two))) {
				revised_list.add(str);
				}
				
				temp.add(str1);
			}
		 }
		
	   System.out.println("Your original list: "+ original_list);
	   System.out.println();
	   System.out.println("Your list with duplicates removed: "+ revised_list);
	   System.out.println();
	   
	   console.close();
		
	}

}
