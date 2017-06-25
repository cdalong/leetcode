
public class HammingDistance {

	/**
	 * @param args
	 */
	
	
    public int hammingDistance(int x, int y) {
    	
    	
    	
    	
    	int count = 0;
    	
    	
    	for (int i = 0; i < 32; ++i)
    	{
    	  
    		
    		
    		
    	  // extract the i-th bit
    	  int a = ((x & 1<<i) >> i);
    	  // b will be 1 if i-th bit is set, 0 otherwise
    	  int b = ((y & 1<<i) >> i);
    	  // do whatever you want with b
    	  
    	  
    	  if (a!= b)
    		  count++;
    	  
    	  
    	}
   
    	return count;
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
