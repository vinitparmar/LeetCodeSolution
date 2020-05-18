package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SumTriplet {
    public static List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> res =  new ArrayList<>();
        HashSet<List<Integer>> hs =  new HashSet<>();
        Arrays.sort(nums);
        
        int target = 0;
        int leftPtr = 0 ;
        int rightPtr = nums.length-1;
       
       // for(int i  = leftPtr ; i < nums.length-2 ; i++){
            
            while(leftPtr+1 < rightPtr){
                
                int sum = nums[leftPtr]+nums[leftPtr+1]+nums[rightPtr];
                
                if (sum == target){
                    List<Integer> temp = new ArrayList<>();
                     temp.add(nums[leftPtr]);
                     temp.add(nums[leftPtr+1]);
                     temp.add(nums[rightPtr]);
                     
                     if(!hs.contains(temp)) {
                    	 res.add(temp);
                     }
                    
                     hs.add(temp);
//                     leftPtr++;
                     rightPtr--;
                     
                     //break;
                }else if(sum < target){
                    
                    leftPtr++;
                    
                }else{
            
                    rightPtr--;
                    
                }  
                
            }  
           
        return res;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {-2,0,1,1,2};
		
		System.out.println(threeSum(arr));
		
		}
}


