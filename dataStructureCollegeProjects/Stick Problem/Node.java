package Lab2;

public class Node {

	int key;
	String name;
	Node leftChild;
	Node rightChild;
	
	public Node(int key, String name) {
		this.key = key;
		this.name = name;
	}
	
	public String toString() {
		return name + " is the name at key " + key;
	}
}
