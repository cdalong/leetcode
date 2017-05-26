import java.util.HashMap;

public class LongestSubstring {

	 public static int lengthOfLongestSubstring(String s) {
		 

		 int biggest = 0;
		 int current = 0;
		
		 HashMap<Character, Integer> alphabet = new HashMap<Character, Integer>();
		 
		 HashMap<Integer, Character> sstring = new HashMap<Integer, Character>();
		 
		 
		 for (int i = 0; i <= 25; i++) { 
		        //alphabet.put((char) ('a' + i), i); 
		        
		       // System.out.println((char) ('a' + i) + " " +  i);
		    } // load hashmap
		 
	        
		 for (int i = 0; i < s.length(); i++){
			    char c = s.charAt(i);        
			    //Process char
			    
			    System.out.print(c);
			    
			
			 
			 if (!sstring.containsKey(alphabet.get(c))){
				
				 
				 
				 
				 sstring.put(alphabet.get(c), c); 
				 System.out.println(sstring.entrySet());
				 
				 System.out.println(sstring.size());
				   if (sstring.size() > biggest){
						 
						 biggest = sstring.size();
					 }
				
			 }
			    
			 
			
			 
			 else{ 
				 
				 
             if (sstring.size() - 1 == 0){
            	 
            	i = i - 1; 
            	sstring.clear();
    			current = 0;
             } 
             else{
			 i = i - (sstring.size()-1);      
			 sstring.clear();
			 current = 0;
			 
             }
			
			 }
			 
		
			    
			}
		 
		 
		 return biggest;
	    }
	 
	 
	 
	 public static void main(String[] args){
{
		 
		 String s = "dvdf";
		 
		 System.out.println(lengthOfLongestSubstring(s));
		 
	 }
	
	
}
}



