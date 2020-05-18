package Array;

public class MaxConsecutiveOnes {
	
public static int findMaxConsecutiveOnes(int[] nums) {
        
        int maxCount =  Integer.MIN_VALUE;
        
        int counter = 0;
        
        
        for(int  i = 0 ; i < nums.length ; i++){
            
            if(nums[i] == 1){
                
                counter++;
                
            }else{
                 maxCount = Math.max(counter,maxCount);
                counter = 0;
                
                
            }
            
             maxCount = Math.max(counter,maxCount);
            
        }  
        
        return maxCount;
    
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr =  {1,0,1,1,0,1};
		
		System.out.println(findMaxConsecutiveOnes(arr));
	}

}
