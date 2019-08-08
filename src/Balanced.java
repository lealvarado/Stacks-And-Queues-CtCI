import java.util.Stack;

public class Balanced {
	
	public static Character[][] TOKENS = {{'{','}'}, {'[',']'}, {'(', ')'}};
	
	public static boolean openTerm(Character term) {
		for(Character[] array : TOKENS) {
			if(array[0] == term) { //.equals(term)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean matches(Character top, Character term) {
		for(Character[] array : TOKENS) {
			if(array[0] == top) {
				return array[1] == term;
			}
		}
		
		return false;

	}
	
	
	public static boolean isBalanced(String expression) {
		Stack<Character> myStack = new Stack<Character>();

		
		for(char c : expression.toCharArray()) {
			if(openTerm(c)) {
				myStack.push(c);
			}else if(myStack.isEmpty() || !matches(myStack.pop(), c)) {
					return false;
				}
			}
		
		
		
		return myStack.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}
