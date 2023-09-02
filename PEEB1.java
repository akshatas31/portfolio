/*Program to calculate the radiant power density B for a given
wavelength and temperature.*/ 
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class PEEB1
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    // declare variables
		double numerator;
		double denominator;
		double h = 6.626068 * Math.pow(10, -34);
		double c = 299792500;
		double k = 1.38066 * Math.pow(10, -23);
		double t;
		double B;
		double lambda;
		// print out the statements followed by the specific calculations needed
		System.out.println("Radiant photon flux at a given wavelength");
		lambda = sc.nextDouble()/1000000;
		System.out.println("and temperature using Planck's Law.");
		t = sc.nextDouble();
		numerator = 2 * h * Math.pow(c,2) * Math.pow(lambda, -5);
		denominator = Math.pow(java.lang.Math.exp(1), (h*c)/(lambda * k * t)) - 1;
		B = numerator / denominator;
		DecimalFormat df1 = new DecimalFormat("0.00E00");
		System.out.println("wavelength in microns: temperature in degrees Kelvin: radiant flux B = " + df1.format(B).toUpperCase() + " Wm-3steradian-1");
		
	}
}
