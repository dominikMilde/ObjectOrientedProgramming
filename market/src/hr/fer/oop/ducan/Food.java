package hr.fer.oop.ducan;

import java.time.LocalDate;

public class Food extends Item implements IPerishable, IJosJedan{
	private LocalDate bestBefore;
	private double weight;

	public Food(String sku, String name, double netSalePrice, double weight, LocalDate bestBefore) {
		super(sku, name, netSalePrice);
		System.out.println("Beverage constructor");
		this.weight = weight;
		this.bestBefore = bestBefore;
	}
	
	public double getVAT() {
		return 0.13;
	}
	
	public String getItemType() {
		return "Food";
	}	
	
	public static String staticFja() {
		return "Food static";
	}		
	
	public String toString() {
		return super.toString() + ", best before: " + this.bestBefore;
	}

	@Override
	public LocalDate getBestBefore() {
		// TODO Auto-generated method stub
		return this.bestBefore;
	}

	@Override
	public void setBestBefore(LocalDate bestBefore) {
		// TODO Auto-generated method stub
		this.bestBefore = bestBefore;
	}

	@Override
	public void metoda1() {
		// TODO Auto-generated method stub
		
	}
	
//  //Ne zelimo da netko nadjaca getSKU()
	//zato smo stavili "final" ispred getSKU() u klasi Item	
//	public String getSKU() {
//		return "222";
//	}	

}
