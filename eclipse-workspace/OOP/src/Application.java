import java.util.List;
public class Application {

	public static void main(String[] args) {
//		System.out.println("Hello world!");
//		
//		Product p = new Product();
//		p.name = "TV"; p.year = 2019; p.sold = true;
//		
//		Product p2 = new Product();
//		p2.name = "Laptop"; p2.year = 2010; p2.sold = false;
//		
//		System.out.println(p.name);
//		System.out.println(p2.name);
//		
//		p.printName(); p.printYear(); p.printSold();
//		
//		p.stelNaamIn("Wasmachine");
//		p.stelStatusIn(false);
//		p.stelJaarIn(2020);
//		p.printName(); p.printYear(); p.printSold();
//	
//		String productName = p.watIsJouwNaam();
//		System.out.println(productName);
//		boolean productStatus = p.isVerkocht();
//		System.out.println(productStatus);
//		int productYear = p.wanneerGebouwd();
//		System.out.println(productYear);
//		Product p3 = new Product("Speaker");
//		p3.printName();
//		Product p4 = new Product("dvd", 2019, true, 52.5);
//		p4.printName(); p4.printPrice();
		
//		Game game = new Game(); //is nu een abstract class
//		game.name = "Mario";
		Shooter halo = new Shooter();
		halo.name = "Halo"; halo.release = 1998; 
		halo.price = 49.99;
		RPG skyrim = new RPG();
		skyrim.name = "Skyrim"; skyrim.release = 2012; 
		skyrim.price = 30.00;
		halo.printName();
		System.out.println(halo.actiePrijs());
		halo.updateTime = halo.update(2);
		System.out.println(halo.updateTime);
		skyrim.maakGeluid();
		
		Game GTA = new Shooter();
		GTA.maakGeluid();
		System.out.println("oud genoeg is " + GTA.leeftijdCheck(19));
		//List<Game> games;
		
	}
}
