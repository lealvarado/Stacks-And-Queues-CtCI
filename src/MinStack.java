import java.util.Stack;

public class MinStack {
	
	Stack<Integer> sort(Stack<Integer> myStack){
		Stack<Integer> sorted = new Stack<Integer>();
		while(!myStack.isEmpty()) {
			int tmp = myStack.pop();
			while(!sorted.isEmpty() && sorted.peek() > tmp) {
				myStack.push(sorted.pop());
			}
			sorted.push(tmp);
		}
		return sorted;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
