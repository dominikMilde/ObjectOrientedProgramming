package hr.fer.oop.ducan;

import java.time.LocalDate;

public interface IPerishable {
	public LocalDate getBestBefore();
	public void setBestBefore(LocalDate bestBefore);
	
	default public String getInstructions() {
		return "Čuvati u frižideru";
	}
}
