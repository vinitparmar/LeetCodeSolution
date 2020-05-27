package Array;

public class FlipImage {
	
	 public static  int[][] flipAndInvertImage(int[][] A) {
	        
	        int[][] res = new int[A[0].length][A.length];
	        
	        for(int i =A[0].length-1 ; i >= 0 ; i--){
	           for(int j = 0 ; j < A.length ; j++){
	               
	                res[j][(A[0].length-1)-i] = A[j][i];
	             }
	            
	        }
	        
	         for(int i =0 ; i < A[0].length ; i++){
	           for(int j = 0 ; j < A.length ; j++){
	               
	               if(res[i][j] == 0){
	                   res[i][j] = 1;
	               }else{
	                   res[i][j] = 0;
	               }
	                
	             }
	            
	        }
	        return res;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]mat = {{1, 1, 1, 0, 0}, 
                {0, 0, 0, 0, 0}, 
                {1, 1, 1, 0, 0}, 
                {0, 0, 0, 0, 0}, 
                {1, 1, 0, 1, 0}}; 
		
			int [][] A =  flipAndInvertImage(mat);
			
			 for(int i =0 ; i < A[0].length ; i++){
		           for(int j = 0 ; j < A.length ; j++){
		               
		              System.out.print(A[i][j]+" ");
		                
		             }
		            System.out.println();
		        }
		
	}

}
