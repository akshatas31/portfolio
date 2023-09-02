
import java.util.Scanner;


public class Fibonacci {
	public static void main (String[] args) {
		long one = 0; 
		long two = 1;
		long sum;
		Scanner sc = new Scanner(System.in);
		int count;
		System.out.print("Enter number of terms: ");
		count = sc.nextInt();
		if(count <= 50) 
		{
			for (int i=1; i<=count; i++) 
			{
				System.out.println(one);
				sum= one+ two;
				one= two;
				two= sum;
			}
		}
		else
		{
			for (int i=1; i<=50; i++) 
			{
				System.out.println(one);
				sum=one+two;
				one=two;
				two=sum;
			}
		}
		}
	}

	

