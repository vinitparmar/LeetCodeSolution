package Array;

public class BuyAndSellStock2 {
	
public static int maxProfit(int[] prices) {
        
        int max_profit = 0;
        
        int min_sell_price = Integer.MAX_VALUE;
        
        for(int i = 0 ; i < prices.length ; i++ ){
            
            if(prices[i] < min_sell_price){
                
                min_sell_price = prices[i];
                
            }else{
                
                max_profit = max_profit + (prices[i] - min_sell_price);
                
                min_sell_price = prices[i];
                
            }
            
        }
        
        return max_profit;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,1,5,3,6,4};
		
		System.out.print(maxProfit(arr));
	}

}
