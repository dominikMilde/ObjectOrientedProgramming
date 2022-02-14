package hr.fer.oop.lab2.prob4;

public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prosti pr = new Prosti(Integer.parseInt(args[0]));
		pr.ispisi();

	}

}

class Prosti{
	int n;
	
	Prosti(int n1){
		this.n = n1;
	}
	
	public boolean isPrime(int broj) {
		boolean temp = true;
		for(int i = 2; i<broj; i++) {
			if(broj%i == 0) {
				temp = false;
				break;
			}
		}
		return temp;
	}

	public void ispisi() {
		System.out.println("You requested decomposition of number " + n + " into prime factors. Here they are:");

		int newN = n;
		int counter = 0;

		while (newN != 1) {

			int j = 2;

			while (!(newN % j == 0 && isPrime(j)))
				j++;

			System.out.println((++counter) + ". " + j);

			newN = newN/j;
			j = 2;
		}
		
	}
	
}