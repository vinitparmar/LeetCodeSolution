package Array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
	
	 public static List<Integer> getRow(int rowIndex) {
	        
	        List<List<Integer>>  res = new ArrayList();
	        
	        List<Integer> curr_Row = new ArrayList();
	        
	        curr_Row.add(1);
	        
	        res.add(curr_Row);
	             
	        if(rowIndex ==  0){
	            
	            return curr_Row;
	        }
	        
	        for(int i = 1; i < rowIndex+1 ; i++){
	             
	             curr_Row = new ArrayList();
	                
	             List<Integer> prev_row = res.get(i-1);
	            
	             curr_Row.add(1);
	            
	                for(int j = 1 ; j < i ; j++){
	                    
	                    curr_Row.add(prev_row.get(j-1) + prev_row.get(j));
	                    
	                }
	            
	            curr_Row.add(1);
	            
	            res.add(curr_Row);
	            
	        }
	        
	        return res.get(rowIndex);
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rowIndex = 3;
		
		System.out.println(getRow(rowIndex));

	}

}
