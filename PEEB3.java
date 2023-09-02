
public class PEEB3 {
	
	public static final double ATPRESSURE = 14.7;
	public static final int EARTH_RADIUS = 3949;
	public static final int MILES1 = 5280;
	public static final int FEET2 = 12;
	public static final int CONCENTRATION = 12;
	
	public static void main (String[] args) {
	System.out.print(planetsurfaceareainsqmi(EARTH_RADIUS ));
	System.out.print(planetsurfaceareaininches(EARTH_RADIUS *MILES1 *FEET2));
	}
	
	public static double planetsurfaceareainsqmi(double radius) {
		return 4 *Math.PI *radius *radius;
	}
	public static double planetsurfaceareaininches(double radius) {
		return 4 *Math.PI *radius *radius;
	}
}
