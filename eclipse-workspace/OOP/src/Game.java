
public abstract class Game {
	
	public String name;
	public int release;
	public int updateTime;
	public double price;
	
	public void printName() {
		System.out.println("Naam is " + name);
	}
	
	public double actiePrijs() {
		double nieuwePrijs = 0.8 * price;
		return nieuwePrijs;
	}
	
	public int update(int jarenWerk) {
		int laatsteUpdate = release + jarenWerk;
		return laatsteUpdate;
	}
	
	public abstract void maakGeluid();
	public abstract boolean leeftijdCheck(int leeftijd);
}
