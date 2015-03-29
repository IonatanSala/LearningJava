package ImplementsInterface;

public class Travis implements CharacterInterface {

	public String getHit() {
		// TODO Auto-generated method stub
		String travisGotHit = "That tickled a bit";
		return travisGotHit;
	}

	public int damage(int cureHealth, int damage) {
		// TODO Auto-generated method stub
		int newHealth = cureHealth - damage;
		if(newHealth > 0) {
			return newHealth;
		} else {
			return 0;
		}
		
	}

}
