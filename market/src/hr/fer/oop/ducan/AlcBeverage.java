package hr.fer.oop.ducan;

public class AlcBeverage extends Beverage {
	private double alc;
	
	public AlcBeverage(String sku, String name, double netSalePrice, double volume, double alc) {
		super(sku, name, netSalePrice, volume);
		System.out.println("Beverage constructor");
		this.alc = alc;
	}

	public double getAlc() {
		return alc;
	}

	public void setAlc(double alc) {
		this.alc = alc;
	}

	public String getItemType() {
		return "AlcBeverage";
	}	
	
	//toString od Beverage + dodatak: % alkohola
	//Možemo li reæi return super.super.toString() + "alc"; ?
	public String toString() {
		return super.toString() + ", alc : " + alc + "%";
	}
	
	public static String staticFja() {
		return "AlcBeverage static";
	}		
	
}
