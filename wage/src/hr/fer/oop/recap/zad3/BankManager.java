package hr.fer.oop.recap.zad3;

public class BankManager {
	public void payment(Worker worker, double amount) {
		System.out.println(worker.getName() + " - " + worker.getBankNumber() + ": " + amount);
	}
}