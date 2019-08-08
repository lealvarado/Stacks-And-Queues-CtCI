import java.util.EmptyStackException;

public class GenericStack<T> {
	
	Node<T> top;
	
	public boolean isEmpty() {
		return top == null; 
		
	}
	
	public T peek() {
		if(top == null) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	public void push(T data) {
		Node<T> node = new Node<T>(data);
		node.next = top; 
		top = node.next;
	}
	
	public T pop() {
		if(top == null) {
			throw new EmptyStackException();
		}
		T topData = top.data;
		top = top.next;
		return topData;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
