package Array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	
	 public  static List<List<Integer>> generate(int numRows) {
		 
		 if(numRows  == 0) {
			 
			 return null;
			 
		 }
	     
		 List<List<Integer>> triangle = new ArrayList();
		 
		 List<Integer> first_Row = new ArrayList<>();
		 
		 first_Row.add(1);
		 
		 triangle.add(first_Row);
		 
		 for (int i = 1; i < numRows ; i++) {
			List<Integer> prev_row = triangle.get(i-1);
			List<Integer> curr_row = new ArrayList<>();	
			
			curr_row.add(1);
			
			for (int j = 1; j < i; j++) {
				
				curr_row.add(prev_row.get(j-1)+prev_row.get(j));
				
			}
			
			curr_row.add(1);
			
			triangle.add(curr_row);
			
		}   
	     
	   return triangle;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		
		//System.out.print(generate(num));
		for (List i : generate(num)) {
			System.out.println(i);
		}
	}

}
