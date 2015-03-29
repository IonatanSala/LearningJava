package BinaryTree;

public class BinaryTree {
	
	Node root;		// this is our root node in our binary tree
	
	
	// this method adds a new node into our binary tree.
	public void addNode(int key, String name) {
		
		Node newNode = new Node(key, name); // The new node that your going to add to your tree
		
		// if there are no values in your tree, set the newNode to be the root
		if(root == null) {
			
			root = newNode; // Your root is now your newNode
			
		} else { 	// else if your tree is not empty this code will execute
			
			Node focusNode = root;		// this is the node we are going to focus on
			
			Node parent;	// this is going to be our parent 
			
			while(true) {
				
				parent = focusNode;   // our parent will update every time we go through the while loop
				
				// if our key is less than the focusNode.key we want to move left
				if(key < focusNode.key) {
					
					focusNode = focusNode.leftChild;	// so we set our focusNode to be our focusNode.leftChild
					
					// So know if our focusNode.leftChild is null then we put in our new node at that position
					// if it's not null we keep looping through until it's null and then put it in that position
					if(focusNode == null) {
						
						parent.leftChild = newNode;
						return;
					}
					
				} else {   // else if our key is greater than the focusNode we want to be moving right in our tree
					
					// so we set our focusNode to be the rightChild
					focusNode = focusNode.rightChild;
					
					// So know if our focusNode.rightChild is null then we put in our new node at that position
					// if it's not null we keep looping through until it's null and then put it in that position
					if(focusNode == null) {
						
						parent.rightChild = newNode;
						return;
					}
					
					
				}
			}
			
		}
	}
	
	// inOrder traversal, so this method prints out the values of your tree from smallest to highest.
	// it is a recursive method
	public void inOrderTraverseTree(Node focusNode) {
		
		
		if(focusNode != null) {
			
			inOrderTraverseTree(focusNode.leftChild);
			System.out.println(focusNode.toString());
			inOrderTraverseTree(focusNode.rightChild);
			
		}
	}
	
	
	// preOrder traversal tree
	public void preOrderTraverseTree(Node focusNode) {
		
		if(focusNode != null) {
			
			System.out.println(focusNode.toString());
			
			preOrderTraverseTree(focusNode.leftChild);
			
			preOrderTraverseTree(focusNode.rightChild);
			
		}
		
	}
	
	// postOrder traversal tree
	public void postOrderTraverseTree(Node focusNode) {
		
		if(focusNode != null) {
			
			
			postOrderTraverseTree(focusNode.leftChild);
			
			postOrderTraverseTree(focusNode.rightChild);
			
			System.out.println(focusNode.toString());
			
		}
		
	}
	
	public Node findNode(int key) {
		
		Node focusNode = root;
		
		while(focusNode.key != key) {
			
			if(key < focusNode.key) {
				
				focusNode = focusNode.leftChild;
				
			} else {
				
				focusNode = focusNode.rightChild;
			}
			
			if(focusNode == null) {
				
				return null;
				
			}
		}
		
		return focusNode;
		
		
	}
	
	public static void main(String[] args) {
		
		BinaryTree theTree = new BinaryTree();
		
		theTree.addNode(50, "Jonatan");
		theTree.addNode(25, "Solomon");
		theTree.addNode(15, "Estera");
		theTree.addNode(30, "Sarah");
		theTree.addNode(75, "Naomi");
		theTree.addNode(85, "Elizabeth");
		
		theTree.inOrderTraverseTree(theTree.root);
		theTree.postOrderTraverseTree(theTree.root);
		theTree.preOrderTraverseTree(theTree.root);
		
		System.out.println("Search for 30");
		
		System.out.println(theTree.findNode(30).toString());
		
		
	}

}
