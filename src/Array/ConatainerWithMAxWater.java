package Array;

public class ConatainerWithMAxWater {
	
	public static  int maxArea(int[] height) {
        int leftPtr = 0 ;
        int rightPtr = height.length-1;
        int maxVolume = Integer.MIN_VALUE;
        
        while(leftPtr < rightPtr){
            
            int minHeight = Math.min(height[leftPtr],height[rightPtr]);
            
            maxVolume = Math.max(maxVolume,minHeight*(rightPtr-leftPtr));
            
            if(height[leftPtr] > height[rightPtr]){
                rightPtr--;
            }else{
                leftPtr++;
            }
              
        }
        
        return maxVolume;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}

}
