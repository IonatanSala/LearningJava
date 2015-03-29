package TestingLinkedLists;

public class LinkedList {

	public Link firstLink;
	
	public LinkedList() {
		firstLink = null;
	}
	
	public boolean isEmpty() {
		return (firstLink == null);
	}
	
	public void insertLink(int data) {
		Link newLink = new Link(data);
		newLink.next = firstLink;
		firstLink = newLink;
		
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insertLink(20);
		list.insertLink(40);
		list.insertLink(60);
		
	}
}
