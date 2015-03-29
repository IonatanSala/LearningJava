package Staks;

public class MainStack {
	
	public static void main(String[] args) {
		
		Stack newStack = new Stack(4);
		newStack.push('d');
		newStack.push('b');
		newStack.push('b');
		newStack.push('a');
		
		while(!newStack.isEmpty()) {
			System.out.println(newStack.pop());
		}
		
		
	}
 
}
