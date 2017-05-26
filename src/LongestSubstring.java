import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	 public static int lengthOfLongestSubstring(String s) {
		 

	      int n = s.length();
	        Set<Character> set = new HashSet<>();
	        int ans = 0, i = 0, j = 0;
	        while (i < n && j < n) {
	            // try to extend the range [i, j]
	            if (!set.contains(s.charAt(j))){
	                set.add(s.charAt(j++));
	             
	                System.out.println(set.toString());
	                
	                
	                ans = Math.max(ans, j - i);
	                
	                System.out.println("Ans: " + ans);
	            }
	            else {
	                set.remove(s.charAt(i++));
	                
	                System.out.println(set.toString());
	                
	            }
	        }
	        return ans;
	    }
	 
	 
	 
	 public static void main(String[] args){
{
		 
		 String s = "dvdf";
		 
		 System.out.println(lengthOfLongestSubstring(s));
		 
	 }
	
	
}
}



