
public class isPalindrome {


	/*
	 * Determine whether or not an integer is a palindrome
	 * 
	 * Do this without extra Space
	 * 
	 * 
	 * Cannot reverse integer
	 * cannot convert to string
	 * 
	 * how do we do this generically?
	 * 
	 */
	
	
	public boolean Palindrome(int x) {
		
		int n = x;
		
		int reverse = 0;
		
		while(x > 0){
			
			int digit = x % 10; //take each digit of the number
			reverse = reverse * 10 + digit; //add the digit to the reverse
			x = x/10; // move onto the next
			
			
		}
		
        if (n == reverse){
        	
        	//if the number equals reverse, you're good
        	
        	return true;
        }
		
		return false;
    }


}
