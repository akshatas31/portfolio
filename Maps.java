import java.util.*;
public class Maps {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		long n1= console.nextInt();
		long n2= console.nextInt();
	    long n3= console.nextInt();
	    long sum=0;
	    
	    Map<String, Long> Map1 = new TreeMap<String, Long>();
	    Map<String, Long> Map2 = new TreeMap<String, Long>();
	    ArrayList <String> list = new ArrayList<>();
	    
	    for (long i =0; i<n1;i++ ) {
	    	String str = console.next();
	    	long n= console.nextInt();
	    	Map1.put(str,n);
	    }
	    for (long i =0; i<n2;i++ ) {
	    	String str = console.next();
	    	long n= console.nextInt();
	    	Map2.put(str,n);
	    }
	    for (long i =0; i<n3;i++ ) {
	    	String str = console.next();
	    	list.add(str); 
	    	if (Map1.containsKey(str)) {
	    		sum += Map1.get(str);
	    	}
	    	if (Map2.containsKey(str)) {
	    		sum += Map2.get(str);
	    	}
	    	
	    	
	    }
	    System.out.println(sum %(1000000007));
	    

	}

}
