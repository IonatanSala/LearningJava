package SomeUsefulCode;

public class IfElseShortcut {

	public static void main(String[] args) {
		
		boolean alive = true;
		int x;
		
//		if(alive) {
//			x = 1;
//		} else {
//			x = 0;
//		}
		
		x = ((alive) ? 1 : 0); // This is the same thing as above.
		// someVariable = (boolean-expression) ? true-part executed : false-part executed
		// if expression specified before ? is true then someVariable is assigned to the true-part
		// if expression is false then someVariable is assigned to the false-part
		
		System.out.println(x);
		
		int y;
		
		y = ((x == 0) ? 1: 0);
		
		System.out.println(y);
	}
}
