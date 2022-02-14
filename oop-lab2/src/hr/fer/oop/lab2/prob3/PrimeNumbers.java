package hr.fer.oop.lab2.prob3;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prosti pr = new Prosti(Integer.parseInt(args[0]));
		pr.ispis();
		
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
	
	public void ispis() {
		int counter = 0;
		System.out.printf("You requested calculation of first %d prime numbers. Here they are: %n",n);
		int j=2;
		while(counter<n) {
			if(isPrime(j)) {
				System.out.printf("%d. %d %n", counter+1, j);
				counter++;
				
			}
			j++;
		}
	} 
}
