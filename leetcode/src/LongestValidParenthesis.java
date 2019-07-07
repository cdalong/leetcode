import java.util.Stack;

public class LongestValidParenthesis
{


    public int findLongestValidParenthesis(String s){


        Stack<Integer> parenthesisStack = new Stack<Integer>();
        parenthesisStack.push(-1);
        
        //if this string is valid, the stack counter will be zero.
        //push the left parenthesis, pop the right ones
        int longestValid = 0;
        for (int i = 0; i < s.length(); i ++){


            if(s.charAt(i) == '(')
            {

                parenthesisStack.push(i);



            } //defo hardcoded :(

            else if ( s.charAt(i) == ')')
            {
            parenthesisStack.pop(); //discarding the output

            if(!parenthesisStack.empty()){

               if(longestValid < (i - parenthesisStack.peek())){

                longestValid = i - parenthesisStack.peek();


               }
            }
            else {

                parenthesisStack.push(i);
            }


        }
    }

        return longestValid;

    }


    
}