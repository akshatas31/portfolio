import java.util.Scanner;
public class Strmax {
	public static void main(String[] args) {
		System.out.print("Enter string: ");
		Scanner console= new Scanner(System.in);
		String str = console.next();
		
		System.out.print("max char:     "+ maxchar(str) +"\n");
		System.out.println("in order:     " + order(str));
	
		console.close();
	}
	
	public static char maxchar(String str) {
		
        int len = str.length();
        char one = 'A';
        for (int i=0; i<len ; i++) {
        	
            if (str.charAt(i) > one) {
               one = str.charAt(i);
            }
        }
       return one;
        	
	}
	
	public static String order (String str) {
		
		int len = str.length();
		String str1 = "";
		for(int i = 0; i < len; i++){
			
			char a = str.charAt(i);
			
			int len1 = str1.length();
			
			int aIndex = 0;
			for(int j = 0; j < len1; j++){
				
				char x = str1.charAt(j);
				
				if(a > x) {
					aIndex = j + 1;
				}
				
			}
			
			str1 = str1.substring(0, aIndex) + a + str1.substring(aIndex);
		}
		return str1;
	}
}




