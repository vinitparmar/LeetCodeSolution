package Array;

import java.util.HashMap;

public class TwoSum {
	
	    public static int[] twoSum(int[] nums, int target) {
	        
	        
	        HashMap<Integer,Integer> hm = new HashMap<>();
	        
	        for(int i = 0 ; i <= nums.length-1 ; i++){
	            
	            int temp  =  target-nums[i];
	            
	            if(hm.containsKey(temp)){
	                return new int[] {hm.get(temp),i};
	                
	            }
	            
	            hm.put(nums[i],i);
	        }
	        
	        return new int[]{};
	    }  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1,3,5,8};
		int target = 6;
		int[] res = twoSum(nums, target);
		
		System.out.println("index are..");
		for (int i : res) {
			System.out.print(i+" ");
		}
	
	}

}
