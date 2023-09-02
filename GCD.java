import java.util.Scanner;
public class GCD {
	
   public static void main(String[] args) {
	   
      Scanner console = new Scanner(System.in);
      
      System.out.print("Enter an integer: ");
      int n1 = console.nextInt();
      System.out.print("Enter an integer: ");
      int n2 = console.nextInt();
      
      System.out.println("GCD = " + gcd(n1, n2));
   }

   public static int gcd(int n1, int n2) {
      if (n2 != 0){
         return gcd(n2, n1 % n2);
      } else{
         return n1;
      }
   }
}