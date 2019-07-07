import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {
	
	
public static List<Integer> findAnagrams(String s, String p) {
     	
	int psize = p.length();
	int[] pfreq = new int[26];
	
	List<Integer> answer = new ArrayList<Integer>();
	
	for (int i = 0 ; i < psize ; i++){
		
		pfreq[p.charAt(i) - 'a'] ++;
		
		//increment the pfreq. we're gonna use this to compare to a lot
	}
	
	//we're going to split the big string into pieces the size of the p string
	
	for (int j =0 ; j < (s.length() - psize + 1); j ++){
		
		int[] sfreq = new int[26];
		
		for (int k = j; k < (psize + j); k++){
			
			
			sfreq[s.charAt(k) -'a']++;
			
		}
		
		if (Arrays.equals(sfreq, pfreq)){
			
			answer.add(j); // add the start of the anagram
		
		}
		
		
	}
	
	return answer; 
    }

}
