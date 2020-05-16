package Array;

public class MovesZeros {
	
public static  void moveZeroes(int[] nums) {
        
        int k = 0;
        
        for(int i = 0 ; i < nums.length ; i++){
            
            if(nums[i] != 0){
                
                nums[k] = nums[i];
                
                k++;
                
            }
        }
        
        while(k < nums.length){
            
            nums[k] = 0;
            
            k++;
            
        }
        
        for (int i = 0; i < nums.length; i++) {
			
        	System.out.print(nums[i]+" ");
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {0,1,0,3,12};
		
		moveZeroes(arr);

	}

}
