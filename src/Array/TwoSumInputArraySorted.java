package Array;

import java.util.HashMap;

public class TwoSumInputArraySorted {
	
	 public static  int[] twoSum(int[] numbers, int target) {
	        
	        HashMap<Integer,Integer> hm = new HashMap<>();
	        
	        for(int i = 0 ; i < numbers.length ; i++){
	            
	            int val = target - numbers[i];
	            
	            if(!hm.containsKey(val)){
	                
	                hm.put(numbers[i],i);
	                
	            }else{
	                
	                return new int[] {hm.get(val)+1,i+1};
	                
	            }
	            
	        }
	        
	        return new int[] {};
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,7,11,15};
		
		int target = 9;
		
		
		for (int i : twoSum(arr, target)) {
			
			System.out.print(i+" ");
			
		}
		

	}

}
