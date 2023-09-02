import java.util.*;
import java.awt.*;
public class projectile{
	public static final double ACCELERATION = -9.81;
	public static void main (String[] args) {
		DrawingPanel panel= new DrawingPanel (1000, 600);
		Scanner console = new Scanner(System.in);
		
		System.out.print("Please enter the start angle in degrees: ");
		int angle_1 = console.nextInt();
		System.out.print("Please enter the final angle in degrees: ");
		int angle_2 = console.nextInt();
		System.out.print("Please enter the step size in degrees: ");
		int step_size = console.nextInt();
		System.out.println();
		graph(30,(double)angle_2,(double)angle_1,step_size);
		
	}
	
	public static void graph(double velocity,double angle_2, double angle_1, int step_size) {
		 	
		for(int k=1; angle_1 <= angle_2;k++ ) {
		
		         double x = 0.0;
		 		 double y = 0.0;
		 		 double t = 0.0;
		 		 
				 double xVelocity = velocity * Math.cos(Math.toRadians(angle_1+step_size));
				 double yVelocity = velocity * Math.sin(Math.toRadians(angle_1+step_size));
				 double totalTime = -2.0 * yVelocity / ACCELERATION;
				 double timeIncrement = totalTime / 10;
				 double xIncrement = xVelocity * timeIncrement;
				 angle_1 += step_size;
				
				 System.out.println("step\tx\ty\ttime");
				 System.out.println("0\t0.0\t0.0\t0.0");
				
			
		        
				 for (int i = 1; i <= 10; i++) {
				 t += timeIncrement;
				 x += xIncrement;
				 y = displacement(yVelocity, t, ACCELERATION);
				 System.out.println(i + "\t" + round2(x) + "\t" +
				 round2(y) + "\t" + round2(t));
				 }
			 }
	}
		
		public static double displacement(double v, double t, double a) {
			     return v * t + 0.5 * a * t * t;
			 }
			
			// rounds n to 2 digits after the decimal point
			 public static double round2(double n) {
			     return Math.round(n * 100.0) / 100.0;
			 }

	
}