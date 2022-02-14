package hr.fer.oop.ducan;

import java.time.LocalDate;

public class Program {

	public static void checkout(Item[] items) {
		double suma = 0;
		System.out.println("checkout:");
		for (Item i : items) {
			// reference su "Item" ali objekti su Beverage, AlcBeverage i Food
			System.out.println("(" + i.getItemType() + ") " + i);
			suma += i.getPrice(1);
		}
		System.out.println("Ukupno: " + suma + "kn");
	}
	
	public static void checkout2(Item[] items) {
		double suma = 0;
		System.out.println("checkout2:");
		for (Item i : items) {
			//Ovaj Cast pretvara referencu u "Item"
			//Ref vec je "Item" pa cast ne radi nista
			Item i1 = (Item)i;
			//Objekti nece promijeniti tip!
			System.out.println("(" + i1.getItemType() + ") " + i1);
			suma += i1.getPrice(1);
		}
		System.out.println("Ukupno: " + suma + "kn");
	}	
	
	public static void checkout3(Item[] items) {
		double suma = 0;
		System.out.println("checkout3:");
		for (Item i : items) {
			//Jedini nacin da stvarno "promijenimo tip" je stvaranje novog
			//objekta drugog tipa. Ali pitanje je zelimo li to.
			//Npr. ovdje ce se za Oreo kekse pozvati "kriva" getVAT() metoda 
			//i ukupna cijena na�e "kosarice" nece bit dobra! 
			Item i1 = new Item(i.getSKU(), i.getName(), i.getNetSalePrice());
			System.out.println("(" + i1.getItemType() + ") " + i1);
			suma += i1.getPrice(1);
		}
		System.out.println("Ukupno: " + suma + "kn");
	}	
	
	public static void staticTest(Item[] items) {
		for (Item i : items)
			//Poziv stati�kih metoda - stati�ko povezivanje
			//Koja �e se stati�ka fja pozvati odre�uje se pri prevo�enju,
			//a ne prema tipu objekta pri izvo�enju
			//Kod prevo�enja znamo jedino da je i "Item".
			//Kako bismo izbjegli pogre�ke, stati�ke metode trebamo zvati
			//preko imena klase, npr. Item.staticFja() ili Food.staticFja()
			System.out.println(i.staticFja());	
	}
	
	public static void ispisiVolumen(Item i) {
		//Ova fja bi trebala primiti parametar tipa Beverage, a ne Item
		
		//Ovo ne radi jer getVolume() ne postoji u klasi Item
		//System.out.println("Volumen: " + i.getVolume());
		
		//Ovo radi ako je objekt i stvarno tipa Beverage
		System.out.println("Volumen: " + ((Beverage)i).getVolume());
		//�to ako funkciji predamo Item ili Food?
	}
	
	public static void main(String[] args) {
		
//		Item i = new Item("12345678", "Oreo keksi�i");
//		System.out.println(i);
//		System.out.println(i.getItemType());

		Beverage b = new Beverage("123","Cedevita",12,1);
		// 1. poziva se
		//    Beverage(String sku, String name, double netSalePrice, double volume)
		// 2. iz njega se poziva
		//    super(sku, name, netSalePrice) tj. Item(String sku, String name, double netSalePrice)
		
		System.out.println(b); //Beverage nema toString
		System.out.println(b.getItemType()); //�to ako zakomentiramo Beverage.getItemType() ?
		
		AlcBeverage p = new AlcBeverage("125","Varionica Pale Ale",12,0.33, 5.2);
		System.out.println(p); //�to ako zakomentiramo Beverage.toString() ?
		
		Item i1 = new Item("111", "Oreo keksi 1", 10);
		Item i2 = new Food("111", "Oreo keksi 1", 10, 100, LocalDate.parse("2018-03-09"));
	
		//Za�to ove dvije linije ne ispisuju isto?
		System.out.println(i1 + " " + i1.getPrice(1));
		System.out.println(i2 + " " + i2.getPrice(1));
		//Koji getVAT() se poziva u kojem slu�aju?
		
		//Sve naslije�eno iz Item se mo�e "promatrati" kao Item
		//Zato mo�emo stvoriti polje Item-a i u njega ubaciti objekt
		//bilo koje klase koja naslje�uje Item
		Item[] items = new Item[] {b, p, i2};
		
		System.out.println();
		checkout(items);

		System.out.println();
		checkout2(items);		
		
		System.out.println();
		checkout3(items);		
		
		System.out.println();
		staticTest(items);				
		
		System.out.println();
		
		//Ovo �e raditi
		ispisiVolumen(b);
		
		//Ho�e li ovo raditi? Za�to?
		//ispisiVolumen(p);	
		
		//Ho�e li ovo raditi? Za�to?
		//ispisiVolumen(i2);		
		Food cevapcici = new Food(Util.getNewSKU(), "Ćevosi", 40, 1, LocalDate.parse("2019-03-29"));
		System.out.println();
		System.out.println(cevapcici);
		
		Milk m = new Milk(Util.getNewSKU(), "Zbregov", 5, 1, MilkType.COW, LocalDate.parse("2019-12-29"));
		System.out.println(m);
		
		IPerishable mp = new Milk(Util.getNewSKU(), "Zbregov", 5, 1, MilkType.COW, LocalDate.parse("2019-04-29"));
		System.out.println(mp);
		
		IPerishable[] kvarljivaRoba = new IPerishable[] {cevapcici, m, mp};
		
		for(IPerishable ip : kvarljivaRoba) {
			System.out.println(ip.getInstructions());
		}
		
		System.out.println("OVO");
		
		for(Item ii : items) {
			if (ii instanceof IPerishable) {
				System.out.println(((IPerishable)ii).getBestBefore());
			}
		}
	}

}
