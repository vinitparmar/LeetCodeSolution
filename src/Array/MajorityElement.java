package Array;

import java.util.HashMap;

public class MajorityElement {
	
	  public static int majorityElement(int[] nums) {
	        
	        if(nums.length == 1){
	            
	            return nums[0];
	        }
	        
	        int cond = nums.length/2;
	        
	        HashMap<Integer,Integer> hm = new HashMap<>();
	        
	        for(int i = 0 ; i < nums.length ; i++){
	            
	            if(hm.containsKey(nums[i])){
	                
	                hm.put(nums[i] , hm.get(nums[i])+1);
	                
	                if(hm.get(nums[i]) > cond){
	                    
	                    return nums[i];
	                }
	                
	            }else{
	                
	                  hm.put(nums[i] , 1);
	            }  
	        }
	        
	        return 0;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,2,3};
		
		System.out.println(majorityElement(arr));

	}

}
