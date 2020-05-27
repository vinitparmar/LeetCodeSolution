package Array;

public class SortByPairity {

public static int[] sortArrayByParity(int[] A) {
        
        int[] arr =  new int[A.length];
        int z=0;
            
        for(int i = 0 ; i < A.length ; i++){
            
            if(A[i]%2 ==0){
                
                arr[z++] = A[i];
            }
            
        }
        for(int i = 0 ; i < A.length ; i++){
            
            if(A[i]%2 !=0){
                
                arr[z++] = A[i];
            }
            
        }
        
        return arr;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,1,2,4};
		
		for(int i : sortArrayByParity(arr)) {
		System.out.print(i+" ");
		}
	}

}
