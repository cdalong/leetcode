package app;

public class BuyAndSellStock{


public int BuyAndSellStockStart(int[] prices){

    //output is the profit margin of your two operations
    //input is an array of numbers listing price for the day

    //the "easy way" is to take the difference of each forward trasaction
    //ie n - n-1 n-2 input speed.

    //how can we improve the runetime of this algo?

    //min/max per pass.
    // THE best way to do this is a comparison of numbers ahead of the current one.
    //taking the maximum of the current max without the tweo arrays

    if (prices.length == 0){

        return 0;

    }

    int max = 0;
    int runningminimum = prices[0];

    for (int i = 0; i < prices.length ; i ++){

        //if the price is bigger than the current leftside minimum, it's a valid sell
        if (prices[i] > runningminimum)
        
        {

            max = Math.max(max, prices[i] - runningminimum);


        }

        else{
            //else, the number is less so it's a new minimum

            runningminimum = prices[i];
        }

    }

    return max;
}


}