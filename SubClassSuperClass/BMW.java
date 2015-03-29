package SubClassSuperClass;

public class BMW extends Car {
	
	public BMW() {
		super.printMessage();
		this.printMessage();
	}
	
	public void printMessage() {
		System.out.println("Hellow from the BMW class");
	}
	
	public static void main(String[] args) {
		
		new BMW();
		
	}
	
}
