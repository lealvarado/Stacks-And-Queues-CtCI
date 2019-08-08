import java.util.Stack;

public class QueueTwoStacks {
	
	private Stack<Integer> newestOnTop = new Stack<Integer>();
	private Stack<Integer> oldestOnTop = new Stack<Integer>();
	
	public int pop() {
			shiftStacks();
			return oldestOnTop.pop();
		
	}
	
	public int peek() {
			shiftStacks();
			return oldestOnTop.peek();
	}
	
	public void push(int value) {
		newestOnTop.push(value);
	}
	
	private void shiftStacks() {
		if(oldestOnTop.isEmpty()) {
			while(!newestOnTop.isEmpty()) {
				oldestOnTop.push(newestOnTop.pop());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
