package hr.fer.recap;

public class Fraction {
	private int x, y;

	public Fraction(int x, int y) {
		this.x = x;
		this.y = y;
		simplify();
	}

	private Fraction() {

	}

	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}

	public String toString() {
		return this.x + "/" + this.y;
	}
	
	public Fraction add(Fraction f2) {
		//int y = this.y *  f2.y;
		//int x = this.x*f2.y + this.y*f2.x;
		
		//Fraction f = new Fraction(x,y);
		Fraction f = new Fraction();
		f.y = this.y *f2.x;
		f.x = this.x*f2.y;
		f.simplify();
		return f;
	}
	
	private static int gcd(int x, int y) {
		return (y == 0) ? x : gcd(y, x % y);
		}
	
	private void simplify() {
		int gcd = gcd(this.x, this.y);
		this.x /= gcd;
		this.y /= gcd;
		
		if(this.y < 0) {
			this.y = -this.y;
			this.x = -this.x;
		}
	}
	
	public Fraction negate() {
		return new Fraction(-this.x, this.y);
	}
	
	public Fraction invert() {
		return new Fraction(this.y, this.x);
	}
	
	public Fraction subtract(Fraction f2) {
		return this.add(f2.negate());
	}
	
	public Fraction multiply(Fraction f2) {
		Fraction f = new Fraction();
		f.x = this.x*f2.x;
		f.y = this.y+f2.y;
		
		f.simplify();
		return f;
	}
	
	public Fraction divide(Fraction f2) {
		return this.multiply(f2.invert());
	}
	
}
