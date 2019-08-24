
public class MainProgram {

    public static void main(String[] args){

        
    BestBuyTwo bbtwo = new BestBuyTwo();
    int[] input1 = {7,1,5,3,6,4};

    System.out.println(bbtwo.calculateBestBuyTwo(input1));


    RainWater rainWater = new RainWater();

    int[] rainInput = {0,1,0,2,1,0,1,3,2,1,2,1};

    System.out.println(rainWater.calculateRainWater(rainInput)); // should be 6


    LongestValidParenthesis parenthesis = new LongestValidParenthesis();

    String input3 = ")()())";


    System.out.println(parenthesis.findLongestValidParenthesis(input3));

    int[][] matrix = { 
    {1,   1}
    };


    SearchMatrix smatrix = new SearchMatrix();

    System.out.println(smatrix.findTheNumber(matrix, 0));


    LCA lca =  new LCA();
    System.out.println("Lca main: " + lca.main());

    }

}
