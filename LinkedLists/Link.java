package LinkedLists;

public class Link {
	
	public int iData; // data item
	public double dData; // data item
	public Link next; // next link in list
	
	public Link(int id, double dd) { 		// constructor
		// initialize data
		iData = id;
		dData = dd;
		// 'next' is automatically set to null
	}
	
	public void displayLink() {  			// display ourself
		System.out.println("{" + iData + ", " + dData +"}");
	}
	
} // end class Link
