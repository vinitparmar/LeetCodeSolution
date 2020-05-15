package Array;

import java.util.HashSet;

public class LongestSubStrWithoutRepeatingChar {
	
    public static int lengthOfLongestSubstring(String s) {
        
        
        int res = Integer.MIN_VALUE;
        
        
        if(s.length() == 0){
            return 0;
        }
        
        if(s.length() == 1){
            return 1;
        }
        
        int slowPtr = 0;
        int fastPtr = 0;
        int maxValue = Integer.MIN_VALUE;
        
        HashSet hs = new HashSet();
        
        while(fastPtr < s.length()){
            
            if(!hs.contains(s.charAt(fastPtr))){
                hs.add(s.charAt(fastPtr));
                fastPtr++;
                maxValue = Math.max(maxValue,hs.size());
            }else{
                hs.remove(s.charAt(slowPtr));
                slowPtr++;
            }   
            
        }     
        return maxValue;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "sadfasdfasdfa";
		
		System.out.println(lengthOfLongestSubstring(s));

	}

}
