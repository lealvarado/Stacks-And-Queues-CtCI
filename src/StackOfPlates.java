import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;

public class StackOfPlates {
	
	//keeps track of the height of plates
	//how many stacks do we have in our array
	int numOfStacks = 0;
	//the capacity of our array
	int capacity = 20; 
	//our array of Stacks
	Stack[] myStackArray = new Stack[20];
	//current stack
	Stack<Integer> firstStack = new Stack<Integer>();
	
	
	public void push(int data) {
		if(firstStack.size() >= 20) {
			ensureExtraCapacity();
			myStackArray[numOfStacks] = firstStack;
			numOfStacks++;
			firstStack = new Stack<Integer>();
			firstStack.push(data);
		}
		firstStack.push(data);
	}
	
	public int pop() {
		if(firstStack.isEmpty()) {
			firstStack = myStackArray[numOfStacks - 1];
			numOfStacks--;
			return firstStack.pop();
		}else {
			return firstStack.pop();
		}
	}
	
	public int popAt(int index) {
		if(myStackArray[index] == null || myStackArray[index].isEmpty()) {
			throw new EmptyStackException();
		}else {
			Stack<Integer> stack = myStackArray[index];
			return stack.pop();
		}
	}
	
	private void ensureExtraCapacity() {
		if(numOfStacks == capacity) {
			myStackArray = Arrays.copyOf(myStackArray, capacity * 2);
			capacity*=2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
