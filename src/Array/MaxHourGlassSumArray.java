package Array;

public class MaxHourGlassSumArray {

	static int hourGlass(int[][] matrix) {
		
		int max_sum = Integer.MIN_VALUE;
		
		for (int i = 0; i < matrix[0].length-2 ; i++) {
			
			for (int j = 0; j < matrix.length-2; j++) {
				
				int sum = matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]+
						matrix[i+1][j+1]+
						matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2];
				
				
				max_sum = Math.max(sum,max_sum);
						
				
			}
			
		}
		
		return max_sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]mat = {{1, 2, 3, 0, 0}, 
                {0, 0, 0, 0, 0}, 
                {2, 1, 4, 0, 0}, 
                {0, 0, 0, 0, 0}, 
                {1, 1, 0, 1, 0}};
		
		System.out.println(hourGlass(mat));

		


	}

}
