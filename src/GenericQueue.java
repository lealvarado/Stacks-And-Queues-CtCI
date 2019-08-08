import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;

public class GenericQueue <T> {
	
	Node<T> head; //remove from the head
	Node<T> tail; //add to the tail
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public T peek() {
		if(head == null) {
			throw new EmptyStackException();
			}
		
		return head.data;
	}
	
	public void add(T data) {
		Node<T> node = new Node<T>(data);
		
		if(tail != null) {
			tail.next = node;
		}
		tail = node;
		if(head == null) {
			head = node;
		}
		
	}
	
	public T remove() {
		if(head == null) {
			throw new EmptyStackException();
		}
		T headData = head.data;
		head = head.next;
		return headData;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericQueue<Integer> myQ = new GenericQueue<Integer>();

	}

}
