public class RainWater{


    public int calculateRainWater (int[] height){

        //given an array of heights of columns, calculate the rainwater
        //let's define the rules of the rainwater

        //need to find the "poles" of the problem
        //initial thoughts -- compare the relative heights of next nearest columns

        //generate an array of relative heights of each position
        //obviously this has memory constraints
        int totalWater = 0;

        for (int i = 1; i < height.length - 1; i++)
        {

            int leftColumn = 0;
            int rightColumn = 0;
            int potentialWater = 0;
            // need to know the biggest column on the left and right
            //need to know the smallest of those two
            for (int leftLimit = i - 1; leftLimit >= 0 ; leftLimit --){

                if (height[leftLimit] > leftColumn ) // left is bigger
                {
                    
                    leftColumn =  height[leftLimit];

                } 


            }
        
            for (int rightLimit = i + 1; rightLimit < height.length; rightLimit ++){

                if (height[rightLimit] > rightColumn ) // left is bigger
                {
                    rightColumn =  height[rightLimit];

                } 


            }

            

            potentialWater = Math.min(rightColumn, leftColumn);
            if(potentialWater - height[i] > 0){
            totalWater += potentialWater - height[i];

            }
        }


        return totalWater;



    }


}