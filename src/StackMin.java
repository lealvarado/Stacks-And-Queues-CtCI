import java.util.EmptyStackException;

public class StackMin {
	
	NodeInt top;
	NodeInt min;
	
	public boolean isEmpty() {
		return top == null; 
		
	}
	
	public int peek() {
		if(top == null) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	public void push(int data) {
		NodeInt node = new NodeInt(data);
		node.next = top;
		if(top == null) {
			node.minStack = node;
		}
		node.minStack = min;
		top = node.next;
	}
	
	
	public int pop() {
		if(top == null) {
			throw new EmptyStackException();
		}
		int topData = top.data;
		top = top.next;
		return topData;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
