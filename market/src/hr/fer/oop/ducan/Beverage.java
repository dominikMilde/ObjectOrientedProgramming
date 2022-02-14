package hr.fer.oop.ducan;

public class Beverage extends Item {

	private double volume;
	
	public Beverage(String sku, String name, double netSalePrice, double volume) {
		super(sku, name, netSalePrice);
		//System.out.println("Beverage constructor");
		this.volume = volume;
	}
	
	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public String getItemType() {
		return "Beverage";
	}

	//toString od Item + dodatak: volumen pi�a
	public String toString() {
		return super.toString() + ", volume : " + getVolume();
	}	
	
	public static String staticFja() {
		return "Beverage static";
	}	
	
}
