package Array;

public class MaxSubArray {
	
	 public static int maxSubArray(int[] nums) {
	      
      int res = Integer.MIN_VALUE;
	        
	        if(nums.length == 0){
	            return 0;
	        }
	        
	       for(int i = 0 ; i < nums.length ; i++){
	        int maxSum = 0;
	           for(int j = i ; j < nums.length ; j++ ){
	               
	               maxSum = maxSum + nums[j];
	               
	               res = Math.max(maxSum,res);
	               
	               
	           }
	       }  
	    
	        return res;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(maxSubArray(nums));

	}

}
