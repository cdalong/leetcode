import java.util.Arrays;

public class ValidAnagram {

	
	
	public boolean isAnagram(String s, String t) {
    
		int[] alphabet = new int[26];
		int[] alphabet2 = new int[26];
		
		
		System.out.println(alphabet);
		
		System.out.println(alphabet2);

		
		
		if (s.length() != t.length()){
			
			return false;
			
		}
		
		else{
			
			for (int i = 0; i <s.length(); i++){
				
				alphabet[s.charAt(i) - 'a'] ++;
				alphabet2[t.charAt(i) - 'a'] ++;
				
			}
				
			if (Arrays.equals(alphabet, alphabet2)){
				
				return true;
				
				
			}
				return false;
			}
		
	}
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
