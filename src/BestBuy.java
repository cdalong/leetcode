
public class BestBuy {

	 public static int maxProfit(int[] prices) {
	     
		 
		 int buy;
		 int sell;
		 int biggest = Integer.MIN_VALUE;
		 for (int i =0 ; i < prices.length ; i++){
			 
			 for (int j = i + 1; j < prices.length ;  j++){
				 
				 
               buy = prices[i];
               sell = prices[j];
               
               System.out.println(sell - buy);
               
               
               if (sell - buy > biggest){
            	   biggest = sell - buy;
            	
            	   
            	   
               }
				 
			 }
			 
			 
		 }
		 
		 
		 
		 if (biggest > 0){
			 return biggest;
		 }
		 return 0;
	    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] test = {2,1,4};
		
		
		maxProfit(test);
		
	}

}