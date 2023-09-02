import java.util.Scanner;
public class roman {

	public static void main(String[] args) {
		
		Scanner console= new Scanner(System.in);
		System.out.print("enter two positive integers, smaller followed by larger: ");
		int start = console.nextInt();
		int end = console.nextInt();
		
		ten(start,end);
		afterten(start,end);
		fiftyto100(start,end);
		hundredto500(start,end);
		fivehundredup(start,end);
		thousandup(start,end);
			
		}

	
	public static void ten(int start, int end) {
		
		for(int i=start; i<= end; i++) {
			if (i==0) {
				System.out.println();
			}
			
			if (i>=1 && i<4) {
				
				for(int k=1;k<=i;k++) {
					System.out.print("I");
				}
				System.out.println();
				
			}else if (i==4) {
				
				System.out.println("IV");
				
			}else if (i>=5 && i<9) {
				
				System.out.print("V");
				
				for(int k=1;k<=i-5;k++) {
					System.out.print("I");
					
				}
				System.out.println();
				
			}else if (i==9) {
				
				System.out.println("IX");
		
			}
		
	     }
	
	  }
	
	public static void afterten(int start, int end) {
		
		for (int i=start; i<= end; i++) {
			
			if (i>=10 &&i<40) {
				
				for(int k=1;k<= (int) i/10 ;k++) {
					System.out.print("X");	
				}
				int a =(i%10);
					ten(a,a);
			} else if (i>=40 && i<50) {
				System.out.print("XL");
				int a =(i%10);
				ten(a,a);
			}
			
		}
		
	}
	public static void fiftyto100 (int start, int end) {
		
		for (int i=start; i<= end; i++) {
			
			int a =i-50;
			
				if(a>=0 && a<10) {
					System.out.print("L");
					int b =(i%10);
					ten(b,b);
				}else if(a>=10 && a<40) {
					System.out.print("L");
					
					afterten(a,a);
					
					
				}else if (a>=40 && a<50) {
					System.out.print("XC");
					int b =(a%10);
					ten(b,b);
				}
			
			
		}
		
	}
	
	public static void hundredto500(int start, int end) {
		for (int i=start; i<= end; i++) {
			
			int a= i/100;
			
			if (i>=100 && i<400) {
				for (int k=1; k<=a;k++) {
					System.out.print("C");	
				}
				int b= i%100;
			  if (b>=0 && b<10) {
				ten(b,b);
			}else if (b>=10 && b<50) {
				afterten(b,b);
			}else if (b>=50 && b<100) {
				fiftyto100(b,b);
			
			}
			
		   }
			if (i>=400 && i<500) {
				System.out.print("CD");
				int b= i%100;
				if (b>=0 && b<10) {
					ten(b,b);
				}else if (b>=10 && b<50) {
					afterten(b,b);
				}else if (b>=50 && b<100) {
					fiftyto100(b,b);
				
				}
				
			}
			
		}
		
		
		
	}
	public static void fivehundredup(int start, int end) {
		for (int i=start; i<= end; i++) {
			int a= i-500;
			if (a>=0 && a<400) {
				hundredto500(a,a);
			}else if (a>=400 && a<500) {
				System.out.print("CM");
				int b= i%100;
				if (b>=0 && b<10) {
					ten(b,b);
				}else if (b>=10 && b<50) {
					afterten(b,b);
				}else if (b>=50 && b<100) {
					fiftyto100(b,b);
				}
				
			}
			
		}
		
	}
	public static void thousandup(int start, int end) {
		for (int i=start; i<= end; i++) {
			int a = i/1000;
			for (int k=1;k<=a;k++) {
				System.out.print("M");	
			}
			int b=i%1000;
			if (i>=1000 && i<4000) {
			if (b>=0 && b<10) {
				ten(b,b);
			}else if (b>=10 && b<50) {
				afterten(b,b);
			}else if (b>=50 && b<100) {
				fiftyto100(b,b);
			}else if(b>=100 && b<500) {
				hundredto500(b,b);
			}else if(b>=500 && b<1000) {
				fivehundredup(b,b);
			}
			}
			
			
		}
		
	}
		
	

	
}
