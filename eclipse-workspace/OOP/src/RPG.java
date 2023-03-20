
public class RPG extends Game{
	public int maxLevel;
	public void maakGeluid() {
		System.out.println("Level up!");
	}
	public boolean leeftijdCheck(int leeftijd) {
		if (leeftijd <= 12) return false;
		else return true;
	}
}
