import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

public class CtCIStackOfPlates {
	
	ArrayList<Stack<Integer>> stacks = new ArrayList<Stack<Integer>>();
	
	public void push(int v) {
		Stack<Integer> last = getLastStack();
		if(last != null && !(last.size() >= 20)) {
			last.push(v);	
		}else {
			Stack<Integer> stack = new Stack<Integer>();
			stack.push(v);
			stacks.add(stack);
		}
	}
	
	public int pop() {
		Stack<Integer> last = getLastStack();
		if(last == null) {
			throw new EmptyStackException();
		}
		int v = last.pop();
		if(last.size() == 0) {
			stacks.remove(stacks.size() - 1);
		}
		return v;
	}
	
	private Stack<Integer> getLastStack() {
		if(stacks.size() == 0) {
			return null;
		}else {
			return stacks.get(stacks.size() - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
