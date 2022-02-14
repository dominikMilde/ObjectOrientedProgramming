package hr.fer.oop.recap.zad3;

public class Salesman extends Worker {
	private static final double SALARY_PERCENT=0.01;
	private double turnover;
	private double minSalary;
	public Salesman(String name, String bankNumber, double minSalary) {
		super(name, bankNumber);
		this.minSalary = minSalary;
	}
	public double getTurnover() {
		return turnover;
	}
	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}
	public void paySalary(BankManager bm) {
		double amount = this.minSalary + this.SALARY_PERCENT*this.turnover;
		bm.payment(this, amount);
	}
}
