package Array;

public class MergeSortedArray {
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        
	     int count = m+n-1;
	        int end1 = m -1;
	        int end2 = n -1;

	        while(end2 >= 0){
	            if(end1 >=0){
	                nums1[count--] = nums1[end1] > nums2[end2] ? nums1[end1--] : nums2[end2--];
	            }else{
	                nums1[count--] = nums2[end2--];
	            }
	        }

	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,0,0,0};
		 int m	=	3;
		 int[] arr2 = {2,5,6};
		 int n = 3;
		 merge(arr1, m, arr2, n);

	}

}
