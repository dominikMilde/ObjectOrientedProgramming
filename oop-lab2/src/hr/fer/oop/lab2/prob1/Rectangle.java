package hr.fer.oop.lab2.prob1;

import java.util.Scanner;

public class Rectangle {
	
	double sirina;
	double visina;
		
	public double vratiPovrsinu() {
		return this.sirina*this.visina;
	}
	public double vratiOpseg() {
		return this.sirina + this.visina;
	}
	
	public void printajPodatke() {
		System.out.printf("You have specified a rectangle of width %.2f and height %.2f.%nIts area is  %.2f and its perimeter is %.2f", this.sirina, this.visina, vratiPovrsinu(), vratiOpseg());

	}
	public void pozivArgumenti() {
		printajPodatke();
	}
	
	public void unosPodatka(double dimenzija, String strDimenzija) {
		Scanner sc = new Scanner(System.in);
		String temp;

		do {
			System.out.println("Please provide " + strDimenzija + ": ");
			temp = sc.nextLine().trim();
			if (!temp.isEmpty()) {
				dimenzija = Double.parseDouble(temp);
				if (dimenzija < 0) {
					System.out.println("The " + strDimenzija + " must not be negative.");
				}
			}

		} while (temp.isEmpty() || dimenzija < 0);
		sc.close();
	}
	
	public void pozivTipkovnica() {
		
		unosPodatka(this.sirina, "width");
		unosPodatka(this.visina, "height");
		
		
		printajPodatke();
	}
	
	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
			
			if( args.length==0) {
				rec.pozivTipkovnica();
			}
			else {
				if (args.length==2) {
					rec.sirina=Double.parseDouble(args[0]);
					rec.visina=Double.parseDouble(args[1]);
					rec.pozivArgumenti();
				}
				else {
					System.out.println("Invalid number of arguments was provided");
				}
			}
		}
		
	}