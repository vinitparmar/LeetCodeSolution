package BinarySearch;

public class BinarySearch {
	
	 public static int search(int[] nums, int target) {
	        
	        int leftPtr = 0;
	        int rightPtr = nums.length-1;
	        
	        while(leftPtr <= rightPtr){
	        int mid = (leftPtr+rightPtr)/2;
	             if(nums[mid] == target){
	                 return mid;
	             }else if(nums[mid] < target){
	                 leftPtr = mid+1;
	             }else{
	                 rightPtr = mid-1;
	             }
	            
	        }
	        return -1;  
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {-1,0,3,5,9,12};
		int target = 9;
		
		System.out.println(search(arr, target));

	}

}
