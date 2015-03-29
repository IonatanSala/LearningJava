package LinkedLists;

public class LinkListApp {
	
	public static void main(String[] args) {
		
		LinkList theList = new LinkList(); // make a new list
		// insert four items
		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 4.00);
		theList.insertFirst(66, 6.00);
		theList.insertFirst(88, 8.00);
		theList.displayList();	// display list
		
//		while(!theList.isEmpty()) {
//			
//			Link aLink = theList.deleteFirst();
//			System.out.print("Deleted ");
//			aLink.displayLink();
//			System.out.println("");
//		}
//		
//		theList.displayList();
		
		
		
	}
}

