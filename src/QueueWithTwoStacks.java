import java.util.Stack;

public class QueueWithTwoStacks<T> {
	
	private Stack<T> stackNewestOnTop = new Stack<T>();
	private Stack<T> stackOldestOnTop = new Stack<T>();
	
	public void enqueue(T value) {
		stackNewestOnTop.push(value);
	}
	
	private void shiftStacks() {
		if(stackOldestOnTop.isEmpty()) {
			while(!stackNewestOnTop.isEmpty()) {
				stackOldestOnTop.push(stackNewestOnTop.pop());
			}
		}
	}
	
	public T peek() {
		shiftStacks();
		return stackOldestOnTop.peek();
	}
	
	public T dequeue() {
		shiftStacks();
		return stackOldestOnTop.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
