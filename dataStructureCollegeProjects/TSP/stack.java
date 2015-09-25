import java.util.*;



public class stack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>(); // Default Java Implementation
		for(int i = 1; i<11; i++) {
			stack.push(i);
		}
		stack.pop();
		for(int i : stack) {
			System.out.println(i + " ");
		}
	}
}