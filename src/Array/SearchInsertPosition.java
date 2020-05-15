package Array;

public class SearchInsertPosition {
	
	public static int searchInsert(int[] nums, int target) {
        
        for(int i = 0 ; i < nums.length ; i++){
            
            if(nums[i] == target){
                return i;
            }
            else if(target < nums[i]){
                return i;
            }
             else if(target > nums[nums.length-1]){
                return nums.length;
            }
        }
        return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,3,5,6};
		int target = 5;
		System.out.println(searchInsert(nums, target));
	}

}
