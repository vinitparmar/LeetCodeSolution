package Array;

public class BuyAndSellStock {
	
	 public static int maxProfit(int[] prices) {
	        
	        int max_profit = 0;
	        
	        int min_price = Integer.MAX_VALUE;
	        
	        for(int i = 0 ; i  <  prices.length ; i++){
	            
	            if(prices[i] < min_price){
	                
	                min_price = prices[i];
	                
	            }else{
	                
	                max_profit = Math.max(max_profit,prices[i] - min_price);
	            }
	            
	        }
	        return max_profit;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {7,1,5,3,6,4};
		
		System.out.println(maxProfit(arr));

	}

}
