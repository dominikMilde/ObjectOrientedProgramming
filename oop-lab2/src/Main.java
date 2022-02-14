import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		do {
			if(sc.hasNextInt()) {
				int linija = sc.nextInt();
				suma += linija;
				}
		} while (sc.hasNextInt());
		
		System.out.println(suma);
	}	
}