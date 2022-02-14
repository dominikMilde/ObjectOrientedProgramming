package hr.fer.oop.ducan;

public class Item {
	private String SKU;
	private String name;
	private double netSalePrice;
	
	public Item() {
		System.out.println("default Item constructor");
	}
	
	public Item(String sku, String name, double netSalePrice) {
		SKU = sku;
		this.name = name;
		this.netSalePrice = netSalePrice;
		//System.out.println("Item constructor s 3 parametra");
	}
	
	public Item(String sku, String name) {
		this(sku, name, 0);
		System.out.println("Item constructor s 2 parametra");
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNetSalePrice() {
		return netSalePrice;
	}

	public void setNetSalePrice(double netSalePrice) {
		this.netSalePrice = netSalePrice;
	}

	public final String getSKU() {
		return SKU;
	}
	
	public double getVAT() {
		return 0.25;
	}

	public double getPrice(int count) {
		return count * (getNetSalePrice() * (1 + getVAT()));
	}
	
	public String toString() {
		return getSKU() + " : " + getName(); 
	}

	//public abstract String getItemType();
	public String getItemType() {
		return "Item";
	}
	
	public static String staticFja() {
		return "Item static";
	}
	
}
