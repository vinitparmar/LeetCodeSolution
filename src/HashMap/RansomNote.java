package HashMap;

import java.util.HashMap;

public class RansomNote {
	
	 public static  boolean canConstruct(String ransomNote, String magazine) {
	        
	        char[] magzineArr = magazine.toCharArray();
	        HashMap<Character,Integer> magzineMap = new HashMap<>();
	        for(int i = 0 ; i < magzineArr.length ;i++){
	           
	                magzineMap.put(magzineArr[i],magzineMap.getOrDefault(magzineArr[i], 0)+1);
	           
	        }
	        
	        char[] words = ransomNote.toCharArray();
	        
	        for (int i = 0; i < words.length; i++){
	            if(!magzineMap.containsKey(words[i]) || magzineMap.get(words[i]) <=0){
	            	
	            	return false;
	            }
	            	
	            magzineMap.put(words[i], magzineMap.get(words[i])-1);
	            
	        }
	        
	        return true;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "aa";
		
		String s2 = "aab";
		
		System.out.println(canConstruct(s1, s2));

	}

}
