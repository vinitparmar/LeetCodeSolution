package Array;

public class ContainsDuplicate2 {
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        
        for(int left_ptr = 0 ; left_ptr < nums.length-1 ; left_ptr++){
             
           for(int right_ptr = left_ptr+1 ; right_ptr < nums.length ; right_ptr++){
            
                if(nums[left_ptr] == nums[right_ptr]  && Math.abs(left_ptr - right_ptr)<=k){
                    
                    return true;
                }
                
            }
            
        }
        
       return false; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,1};
			
		int k =	3;
			
		System.out.println(containsNearbyDuplicate(arr, k));
	}

}
