

public class ValidParenthesis {
	
public static boolean isValid(String s) {
        
	
	// left brackets add one, right brackets subtract
	
	int round = 0;
	
	int square = 0;
	
	int squiggle = 0;
	
	
	for (int i = 0 ; i <s.length(); i++){
		
		
		char c = s.charAt(i);
		
		switch (c){
		
		case '(':
			if(square > 0 || squiggle > 0)
				return false;
			round++;
			break;
		case ')':
			if(square > 0 || squiggle > 0)
				return false;
			round--;
			break;
		case '[':
			if(round > 0 || squiggle > 0)
				return false;
			square++;
			break;
		case ']':
			if(round > 0 || squiggle > 0)
				return false;
			square--;
			break;
		case '{':
			if(square > 0 || round > 0)
				return false;
			squiggle++;
			break;
		case '}':
			if(square > 0 || round > 0)
				return false;
			squiggle --;
			break;
		
		}
		
		
	
		
	}
	
	if(square == 0 && squiggle == 0 && round == 0){
		
		
		return true;
	}
	
	return false;
    }

public static void main(String[] args) {
	// TODO Auto-generated method stub

	String s = "()[()}{()}({)}{(}()}){())]{}";
	
	
	System.out.println(isValid(s));
	
	
}

}
