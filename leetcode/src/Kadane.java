public class Kadane{


    public int findSubarray(int[] array, int arrayIndex){

        
        //find the largest subarray for each index.
        //it's either the unit itself or the concat of the previous largest subarray
        int localMin = array[0];
        int globalMin = array[0];

        int localSum = 0;


        for (int i = 1; i < array.length - 1; i ++)
        {

            localMin = Math.min(array[i], globalMin + array[i]);

            if (globalMin < localMin){

                globalMin = localMin;
            }

        }

        return globalMin;


    }


}