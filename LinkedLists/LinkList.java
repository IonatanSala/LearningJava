package LinkedLists;

public class LinkList {
	
	private Link first; // reference to first link on list
	
	public LinkList() {	// constructor
		
		first = null;	// no items on list yet
	}
	
	public boolean isEmpty() {	// true if list is empty
		
		return (first == null);
	}
	
	
	// insert at start of list
	public void insertFirst(int id, double dd) {
		
		Link newLink = new Link(id, dd);	// make new link
		newLink.next = first;				// newLink --> old first
		first = newLink;					// first --> newLink
	}
	
	
	public Link deleteFirst() { 	// delete first item (assumes list not empty)
		
		Link temp = first;	// save reference to link
		first = first.next;	// delete it: first-->old next
		return temp;	// return deleted link
	}
	
	
	public void displayList() {
		System.out.print("List (first-->last); ");
		Link current = first;
		
		while(current != null) {
			current.displayLink();
			current = current.next;		// move to next link
		}
		System.out.println("");
	}
} // end class LinkList











