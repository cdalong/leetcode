import java.util.Arrays;


public class ArrayPartitionI {

	/**
	 * 
	 * Input: [1,4,3,2]
	 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

	 * @param args
	 */
	
	
	
	
	public int arrayPartition(int[] nums){
		
		
		
	    Arrays.sort(nums);	
	    
	    int sum = 0;
	    
	    for (int i =0; i < nums.length; i+=2){
	    	
	    	
	    	sum += nums[i];
	    	
	    	
	    }
		
		
		return sum;
	
		
		
	}
}
