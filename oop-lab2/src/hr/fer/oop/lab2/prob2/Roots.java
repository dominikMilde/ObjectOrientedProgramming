package hr.fer.oop.lab2.prob2;

public class Roots {

	/*
	 * private double re, im, n, fi, r;
	 * 
	 * Roots(double re1, double im1, int n1){ this.re = re1; this.im = im1; this.n =
	 * n1; this.r = Math.sqrt(this.re*this.re + this.im*this.im); this.fi =
	 * Math.tan(this.im/this.re);
	 * 
	 * }
	 * 
	 * 
	 * public void ispisiKorjene() { for(int i=0; i<this.n; i++) {
	 * System.out.println(this.fi); double newRe = Math.pow(this.r, 1/this.n) *
	 * Math.cos((this.fi+2*i*Math.PI)/this.n); double newIm = Math.pow(this.r,
	 * 1/this.n) * Math.sin((this.fi+2*i*Math.PI)/this.n);
	 * 
	 * System.out.println(newRe); System.out.println(newIm); } }
	 */

	public static void main(String[] args) {
		Korijen root = new Korijen();
		root.re = Double.parseDouble(args[0]);
		root.im = Double.parseDouble(args[1]);
		root.n = Integer.parseInt(args[2]);

		root.ispisiKorjene();
	}
}

class Korijen {
	double re;
	double im;
	int n;

	double fi() { 
		return Math.atan(im /re);
	}
	double r() {
		return Math.sqrt(im * im +  re * re);
	}

	public void ispisiKorjene() {
		System.out.printf("You requested calculation of %d. roots. Solutions are: %n", n);
		for(int i=0; i<n; i++) {
			double newRe = Math.pow(r(), 1./n) * Math.cos((fi()+2*i*Math.PI)/n);
			double newIm = Math.pow(r(), 1./n) * Math.sin((fi()+2*i*Math.PI)/n);
			
			if(newIm < 0) {
				System.out.printf("%d) %.2f - %.2fi %n", i+1, newRe, -newIm);
			}
			else {
				System.out.printf("%d) %.2f + %.2fi %n", i+1, newRe, newIm);
			}
		}
	}
}

