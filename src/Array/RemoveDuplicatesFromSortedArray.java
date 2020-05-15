package Array;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {

// this functions returns the size of the array
public static int removeDuplicates(int[] nums) {

	if(nums.length == 0){
            return 0;
        }
        int k = 0;
        HashSet<Integer> hs =  new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
                nums[k] = nums[i];
                k++;
            }
            
        }
        
       return hs.size();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3,3,3,4,4,4,5,5};
		int res = removeDuplicates(nums);
		System.out.println(res);
		
	}

}
