package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
	
public static List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> res = new ArrayList<>();
        
        HashSet hs = new HashSet();
        
        for(int i : nums){
            
            hs.add(i);
            
        }
        
        for(int i = 1 ; i <= nums.length ; i++){
            
            if(!hs.contains(i)){
                
                res.add(i);
            }
            
        }
        
        return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,3,2,7,8,2,3,1};
		
		System.out.println(findDisappearedNumbers(arr));

	}

}
