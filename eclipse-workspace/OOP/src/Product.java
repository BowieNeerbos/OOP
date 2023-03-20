
public class Product {

	public String name;
	public int year;
	public boolean sold;
	public double price;
	
	public Product() {//de constructor
		System.out.println("In constructor");
	}
	public Product(String name) {//2e constructor
		this.name = name;
	}
	public Product(String name,
			int year, boolean sold, double price) {//volle constructor
		this.name = name; this.year = year;
		this.sold = sold; this.price = price;
	}
	public void printName() {
		System.out.println("Naam is " + name);
	}
	public void printYear() {
		System.out.println("Jaar is " + year);
	}
	public void printSold() {
		System.out.println("Verkocht is " + sold);
	}
	public void printPrice() {
		System.out.println("Prijs is " + price);
	}
	public void stelNaamIn(String name) {
		this.name = name;
	}
	public void stelJaarIn(int year) {
		this.year = year;
	}
	public void stelStatusIn(boolean sold) {
		this.sold = sold;
	}
	public String watIsJouwNaam() {
		return name;
	}
	public boolean isVerkocht() {
		return sold;
	}
	public int wanneerGebouwd() {
		return year;
	}
}
