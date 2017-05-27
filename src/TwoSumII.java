
public class TwoSumII {

	public int[] twoSum(int[] numbers, int target){
	int[] answer = new int[2];
	
    for (int i = 0; i < numbers.length; i++){
        
    for (int j = i+1; j < numbers.length; j++){
        
        if (numbers[i] + numbers[j] == target){
            
         answer[0] = i +1;
         answer[1] = j+ 1;
         
         return answer;
        	
        }
        
        if(numbers[i] + numbers[j] > target){
        	//stop looking
        	break;
        	
        	
        }
        
    }
        

    }
  return null;
  //not in the array
}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = new int[4];
		
		
		
		
		
	}

}
