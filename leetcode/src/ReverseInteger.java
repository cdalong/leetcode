
public class ReverseInteger {

	/*
	 * Reverse the digits of an integer
	 * Example1: x = 123, return 321
	   Example2: x = -123, return -321
	 * 
	 */
	
	 public static int reverse(int x){
	        long result =0;
	        while(x != 0)
	        {
	            result = (result*10) + (x%10);
	            if(result > Integer.MAX_VALUE) return 0;
	            if(result < Integer.MIN_VALUE) return 0;
	            x = x/10;
	        }
	        return (int)result;
	        
	        
	    }
	
}
