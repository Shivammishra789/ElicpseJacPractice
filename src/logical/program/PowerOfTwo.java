package logical.program;

public class PowerOfTwo {
	
	static int power=1;
	
	public static void main(String[] args) {
		
		int n=Integer.parseInt(args[0]);
		if(n==0) {
			 System.out.println("2^0=1");
			}
		
		for (int i=1; i<=n; i++) {
			
			  power=2*power;
			 System.out.println("2^"+i+"="+power);
			
			
			
		}
	}

}
