package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ThirdLargestArray {
	
	static Set element(int[] arr) {
		Arrays.sort(arr);
		
		HashSet<Integer> hs =  new HashSet();
		
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		
		
		return hs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,2,2,3,4,5,5,5};
		
		ArrayList l = new ArrayList<>(element(arr));
		System.out.println(l.get(element(arr).size()-3));
	}

}
