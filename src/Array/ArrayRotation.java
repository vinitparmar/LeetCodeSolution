package Array;

public class ArrayRotation {
	
	public static void rotate(int[] nums, int k) {
        
	    int[] res = new int[nums.length] ; 
	        
	        for(int i = 0 ; i < nums.length ; i++){

	            res[(k+i) % nums.length] = nums[i];
	               
	        }
	        
	        for(int i = 0 ; i < nums.length ; i++){

	            //nums[i] = res[i];
	        	System.out.print(res[i]+" ");
	             
	        }
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7};
		int target = 3;
		
		rotate(arr, target);

	}

}
