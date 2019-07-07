
public class MainProgram {

    public static void main(String[] args){

        
    BestBuyTwo bbtwo = new BestBuyTwo();
    int[] input1 = {7,1,5,3,6,4};

    System.out.println(bbtwo.calculateBestBuyTwo(input1));


    RainWater rainWater = new RainWater();

    int[] rainInput = {0,1,0,2,1,0,1,3,2,1,2,1};

    System.out.println(rainWater.calculateRainWater(rainInput)); // should be 6
    }

}
