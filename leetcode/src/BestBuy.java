
public class BestBuy {

	 public static int maxProfit(int[] prices) {
	     
		 if (prices.length == 0){
			 
			 return 0;
		 }
		 
		 int max = 0;
		 int runningminimum = prices[0];
		 
		 for (int i = 0; i <prices.length; i++){
			 
			 if (prices[i] > runningminimum){
				 
				 max = Math.max(max, prices[i] - runningminimum);
				 
			 }
			 
			 else{
				 
				 runningminimum = prices[i];				 
			 }
			 
			 
		 }
		 return max;
		 
	    }


}
