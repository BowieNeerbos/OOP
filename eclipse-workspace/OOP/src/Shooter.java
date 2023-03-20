
public class Shooter extends Game {
	public int magazineCapacity;
	
	public void maakGeluid() {
		System.out.println("Pieuw pieuw!");
	}
	public boolean leeftijdCheck(int leeftijd) {
		if (leeftijd <= 18) return false;
		else return true;
	}
}
