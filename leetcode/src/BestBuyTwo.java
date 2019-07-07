public class BestBuyTwo{

    public int  calculateBestBuyTwo(int[] prices){

        //last time, we took a running minimum, and we'll do the same here
        // but this time, as soon as the price dips we sell.
        // how do we know that there is no better price
        //cannot buy twice

        if(prices == null || prices.length == 0){

            return 0;

        }

        int totalProfit  = 0;

        for (int i = 0; i < prices.length - 1; i ++)   
        
        {

            if (prices[i+1] > prices[i])

            {
                // the price is a valid trade
                totalProfit += prices[i + 1] - prices [i];
            }




        }



        return totalProfit;
    }



}