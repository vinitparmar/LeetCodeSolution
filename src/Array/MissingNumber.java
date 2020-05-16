package Array;

public class MissingNumber {
	
	public static int missingNumber(int[] nums) {
        
        int xor_val1 = 0;
        
        int xor_val2 = 0;
        
        for(int i = 0 ; i <= nums.length ; i++){
            
           xor_val1 = xor_val1 ^ i;          
            
        }
        
         for(int i = 0 ; i < nums.length ; i++){
            
           xor_val2 = xor_val2 ^ nums[i];          
            
        }
        
        return xor_val1 ^ xor_val2;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,0,1};
		
		System.out.println(missingNumber(arr));

	}

}
