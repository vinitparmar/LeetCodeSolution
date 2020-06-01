package HashMap;

import java.util.HashMap;

public class SingleNumber {
	
	static int singleNumber(int[] nums) {
		HashMap hm =  new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			if(hm.containsKey(nums[i])) {
				hm.remove(nums[i]);
			}else {
				hm.put(nums[i], 1);
			}
		}
		
		for(int i : nums) {
			if(hm.containsKey(i)) {
				
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,1,2,3,4,4,3};
		
		System.out.println(singleNumber(arr));

	}

}
