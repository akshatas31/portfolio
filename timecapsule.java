
	import java.util.Scanner;

	public class timecapsule {
		public static int HEIGHT;
		public static void main (String[] args) {
			Scanner console = new Scanner(System.in);
			System.out.print("enter HEIGHT: "); 	
			HEIGHT = console.nextInt();				
			System.out.println();	
			top();
			box();
			bottom();
			
		}
		public static void top() {
			
			for (int i=1; i<=(HEIGHT);i++) {
				System.out.print(" ");
			}
			System.out.println ("*");
			for(int i=1;i<=HEIGHT;i++ ){
				for(int k=1;k<=(HEIGHT-i); k++) {
					System.out.print(" ");
				
				}
				System.out.print("/");
				for (int k=1; k<=(2*i-1);k++) {
					System.out.print("o");	
					
				}
				System.out.print("\\");
				System.out.println();
		}
			
				
			}
		public static void box() {
			line();
			Inner();
			line();
			
		}	
		
		public static void Inner() {
			for (int i=1;i<=HEIGHT*2-3; i++) {
				
				System.out.print("|@");
			
				for(int k=1; k<=(2*HEIGHT-3); k++) {
					System.out.print(" ");
				
				}
				System.out.print("@|");
				System.out.println();
			}
		}
			
			public static void line() {	
				
				System.out.print("|");
				for (int i=1; i<=HEIGHT*2-1; i++) {
				System.out.print("@");
				}
				System.out.print("|");
				System.out.println();
						
		}
			public static void bottom() {
				for(int i=1;i<=HEIGHT; i++) {
					for(int k=1; k<=i-1; k++) {
						System.out.print(" ");
						
					}
					System.out.print("\\");
					for(int k=1;k<=((2*HEIGHT-1)-2*i+2);k++) {
						System.out.print("o");	
					}
					System.out.print("/");
					System.out.println();
					
				}
				for (int i=1; i<=(HEIGHT);i++) {
					System.out.print(" ");
				}
				System.out.println ("*");
				
			}

}
