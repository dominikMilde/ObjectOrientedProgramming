package hr.fer.oop.ducan;

import java.time.LocalDate;

public final class Milk extends Beverage implements IPerishable {
	MilkType type;
	LocalDate bestBefore;

	public Milk(String sku, String name, double netSalePrice, double volume, MilkType type, LocalDate bestBefore) {
		super(sku, name, netSalePrice, volume);
		// TODO Auto-generated constructor stub
		this.bestBefore = bestBefore;
		this.type = type;
	}

	@Override
	public String toString() {
		return super.toString() + "Milk [type=" + type + ", bestBefore=" + bestBefore + ", getType()=" + getType() + ", getBestBefore()="
				+ getBestBefore() + "]";
	}

	public MilkType getType() {
		return type;
	}
	
	public String getInstructions() {
		return "Na hladnom";
	}

	public void setType(MilkType type) {
		this.type = type;
	}

	public LocalDate getBestBefore() {
		return bestBefore;
	}

	public void setBestBefore(LocalDate bestBefore) {
		this.bestBefore = bestBefore;
	}
		
}
