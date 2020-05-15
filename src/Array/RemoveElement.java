package Array;

public class RemoveElement {
	
	public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++ ){
            
            if(val != nums[i]){
                nums[count]= nums[i];
                count++;
                
            }
        }
        
        return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,2,3};
		int val = 3;
		
		System.out.println(removeElement(arr, val));
	}

}
