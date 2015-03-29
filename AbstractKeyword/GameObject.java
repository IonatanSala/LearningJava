// If you need to refresh your memory Jonatan :P go to this place https://www.youtube.com/watch?v=pt1S11yX-7k

package AbstractKeyword;

// You don't just have to have abstract methods in your class
// You can have everything you would have in a normal class
public abstract class GameObject {
	
	public abstract void draw();
	// This means that every class that extends this GameObject class, has to implement the draw() method
	
	public static void main(String[] args) {
		
//		Player player1 = new Player();
//		player1.draw();
//		Menu menu = new Menu();
//		menu.draw();
		
		GameObject player = new Player();
		// player.draw(); < This is called in the object for loop
		GameObject menu = new Menu();
		// menu.draw(); < This is called in the object for loop
		// This is the same as the above code
		// Look at the link if forgot at minute 8:30
		
		GameObject[] gameObjects = new GameObject[2];
		gameObjects[0] = player;
		gameObjects[1] = menu;
		
		for(GameObject obj : gameObjects) {
			obj.draw();
		}
		

		// GameObject gameObj = new GameObject();
		// abstract classes exist to be extended, they cannot be instantiated
		// if we didn't have the "abstract" keyword in our class then the above GameObject would work.
	}
}
