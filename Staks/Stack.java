package Staks;

public class Stack {
	
	private int maxSize;
	private char[] myArray;
	private int top;
	
	public Stack(int s) {
		maxSize = s;
		myArray = new char[maxSize];
		top = -1;
	}
	
	public void push(char a) {
		top++;
		myArray[top] = a;
		
	}
	
	public char pop() {
		return myArray[top--];
		
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize -1);
	}
	

}
