import java.util.Stack;

public class ValidParentheses20 {

	public static void main(String[] args) {
		// debugging the code
		String[] inputs = {"()","()[]{}","(]","([])","([)]",")"};
		for (int i = 0; i < inputs.length; i++) {
			boolean output = Solution.isValid(inputs[i]);
			System.out.println("input" + i + " resulted in the output: " + output);
		}

	}
	
	class Solution {
	    public static boolean isValid(String s) {
	    	boolean isValid = true;
	    	char openBrackets = '(';
	    	char closeBrackets = ')';
	    	char openCurly = '{';
	    	char closeCurly = '}';
	    	char openSquare = '[';
	    	char closeSquare = ']';
	    	
	    	Stack<Character> stack = new Stack<>();
	    	int openBracketsCounter = 0;
	    	
	    	for (int i = 0; i < s.length(); i++) {
	    		char tempChar = s.charAt(i);
	    		if (tempChar == openBrackets || tempChar == openCurly || tempChar == openSquare) {
	    			openBracketsCounter++;
	    			stack.add(s.charAt(i));
	    		} else if (stack.empty() && (tempChar == closeBrackets || tempChar == closeCurly || tempChar == closeSquare)) {
	    			return false;
	    		} else if (tempChar == closeBrackets) {
	    			if (stack.peek() == openBrackets) {
	    				stack.pop();
						openBracketsCounter--;
	    			} else return false;
	    		} else if (tempChar == closeCurly) {
	    			if (stack.peek() == openCurly) {
	    				stack.pop();
						openBracketsCounter--;
	    			} else return false;
	    		} else if (tempChar == closeSquare ) {
	    			if (stack.peek() == openSquare) {
	    				stack.pop();
						openBracketsCounter--;
	    			} else return false;
	    		}
	    	}
	    	return isValid && openBracketsCounter == 0;
	        
	    }
	}

}
