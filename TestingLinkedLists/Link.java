package TestingLinkedLists;

public class Link {
	
	public int data;
	public Link next;
	
	public Link(int data) {
		this.data = data;
	}
	
	public void displayData() {
		System.out.println("Your data is : " + data);
	}
}
