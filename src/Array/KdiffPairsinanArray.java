package Array;

import java.util.HashSet;

public class KdiffPairsinanArray {
	
public static int findPairs(int[] nums, int k) {
        
        int counter = 0;
        
        if(k< 0){
            
            return counter;
        }
        
        HashSet hsLeft = new HashSet();
        HashSet hsRight = new HashSet();
        
        for(int i = 0 ; i < nums.length ; i++){
            
             for(int j = 0 ; j < nums.length ; j++){
                 
                
                 if(nums[i]-nums[j] == k & i != j){
                 
                     if(!hsLeft.contains(nums[i]) || !hsRight.contains(nums[j])){ 
                     
                     counter++;
                     
                     }
                
                     hsLeft.add(nums[i]);
                     hsRight.add(nums[j]);
                    
                }
                     
              }
            
            }
        
        return counter;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4, 5}; 
		int k = 1;
		
		System.out.println(findPairs(arr, k));

	}

}
