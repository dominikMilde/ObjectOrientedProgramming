package hr.fer.oop.recap.zad3;

public class HourBasedWorker extends Worker{
	private static final double MONTHLY_WORKING_HOURS = 160;
	private static final double OVERTIME_FACTOR = 1.2;
	private double workingHours;
	private double salaryPerHour;
	public HourBasedWorker(String name, String bankNumber, double salaryPerHour) {
		super(name, bankNumber);
		this.salaryPerHour = salaryPerHour;
	}
	public double getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}
	
	public void paySalary(BankManager bm) {
		double amount;
		if (this.workingHours < this.MONTHLY_WORKING_HOURS)
		{
			amount = this.salaryPerHour*this.workingHours;
		}	
		else {
			amount = this.salaryPerHour*this.MONTHLY_WORKING_HOURS + this.salaryPerHour*this.OVERTIME_FACTOR*(this.workingHours-this.MONTHLY_WORKING_HOURS);
					
		}
		bm.payment(this, amount);
	}
	
}
