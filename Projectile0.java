import java.awt.*;
import java.util.Scanner;

/*For this program, the user specifies an 
 *  initial angle, final angle, and increment angle.
 *  The program will then display the  
 *   trajectories for a given set of angles
 *   in the DrawingPanel
 */

public class Projectile0 {
	
     public static final double ACCELERATION = -9.81;
    

  	 public static void main(String[] args) {
  		
  		    DrawingPanel panel= new DrawingPanel (1000, 600);
  		    Scanner console = new Scanner(System.in);
  		    Graphics g = panel.getGraphics();
  		    //asks user for input values
  		    System.out.print("Please enter the start angle in degrees: ");
  		    int angle_1 = console.nextInt();
  		    System.out.print("Please enter the final angle in degrees: ");
  		    int angle_2 = console.nextInt();
  		    System.out.print("Please enter the step size in degrees: ");
  		    int step_size = console.nextInt();
  		    System.out.println();
  		   
  		    
  		    graph(g, 30,angle_1,angle_2,step_size);
  		    
  	}

  
  	public static void graph(Graphics g, int v0, int angle_1, int angle_2, int steps) {
  	    for(int k=angle_1; k<=angle_2; k+=steps) {
  	      double yVelocity = v0 * Math.sin(Math.toRadians(k));
  	      double xVelocity = v0 * Math.cos(Math.toRadians(k));
  	      double totalTime = -2 * yVelocity / ACCELERATION;
  	      double timeIncrement = totalTime / 300;
  	      //System.out.println("step\tx\ty\ttime");
  	      int xtemp = 0;
  	      for (int i = 0; i <= 300; i++) {
  	        double t = i * timeIncrement;
  	        double x = xVelocity * t;
  	        double y = displacement(yVelocity, ACCELERATION, t);
  	        int intx = 12*(int) x-11;;
  	        int inty = (int) (( 600 - 12*y));
  	        if(intx != xtemp) {
  	            g.drawOval(intx, inty, 2, 2);
  	            
  	        }
  	        xtemp = 11*(int) x;
  	      }
  	      System.out.println();
  	    }
  	  }
    	    
    	  
         
    

      	public static double displacement(double v0, double a, double t) {
      		
      			return (v0 * t + 0.5 * a * Math.pow(t, 2));
      			
      	}
  
	}

