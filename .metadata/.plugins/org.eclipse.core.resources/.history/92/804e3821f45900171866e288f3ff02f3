import java.util.Stack;

public class ValidParenthesis {
	
public static boolean isValid(String s) {
        

	Stack<Character> stack = new Stack<Character>();
	
	
	
	for (char c : s.toCharArray()){
		
		if ( c == '(')
			stack.push(')');
		else if (c == '[')
			stack.push(']');
		else if ( c == '{')
			stack.push('}');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
		
		
		
		
		
	}
	
	return stack.isEmpty();
	
}

public static void main(String[] args) {
	// TODO Auto-generated method stub

	String s = "()[()}{()}({)}{(}()}){())]{}";
	
	
	System.out.println(isValid(s));
	
	
}

}
