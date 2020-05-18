package Array;

public class FibonacciNumber {
	
	   public static int fib(int N) {
	        int ans = 0;
	        
	        int n1 = 1;
	        
	        int n2 = 1;
	         
	        if(N<=1){
	            
	            return N;
	        }
	        
	         if(N==2){
	            
	            return 1;
	        }
	        
	        for (int i = 3 ; i <= N ; i++){
	             ans = n1+n2;
	             n2 = n1;
	             n1 = ans;  
	        }
	       return ans; 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 6;
		
		System.out.println(fib(n));

	}

}
