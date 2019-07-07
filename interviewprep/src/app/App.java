package app;

public class App {
    public static void main(String[] args) throws Exception {

        BuyAndSellStock stockProblem = new BuyAndSellStock();

        int[] buyAndSellStockInput = {7,1,5,3,6,4};
        int[] input2 = {7,6,4,3,1};

        System.out.println(stockProblem.BuyAndSellStockStart(buyAndSellStockInput));
        System.out.println(stockProblem.BuyAndSellStockStart(input2));

    }
}