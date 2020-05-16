package Array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	
    public static boolean containsDuplicate(int[] nums) {
        
        Set<Integer> hs = new HashSet<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            
            if(hs.contains(nums[i])){
                return true;
            }
            
            hs.add(nums[i]);
        }
        
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,2};
		
		System.out.println(containsDuplicate(arr));

	}

}
