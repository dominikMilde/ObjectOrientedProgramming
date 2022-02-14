
public class Zadatak {

	public static void main(String[] args) {
		System.out.println(args.length);
		// TODO Auto-generated method stub
		String [] s1; //referenca na String
		//String s2[];
		
		s1 = new String[5];
		for(int i=0; i<s1.length; i++) {
			System.out.printf("%s ", s1[i]);
		}
		System.out.println("");
		s1[2] = new String("Proba");
		for(int i=0; i<s1.length; i++) {
			System.out.printf("%s ", s1[i]);
		}
		int [] polje = new int[10];
		int donja = 10;
		
		int gornja = 150;
		int n = 100;
		long suma = 0;
		
		for(int i=0; i<n; i++) {
			int r = (int) ((gornja - donja+1)*Math.random()) + donja;
			System.out.println(r);
			suma += r;
		}
		
		System.out.println("Prosjek je: " + (double)suma/n);
		String s = new String("Bok");
		s = s.concat(" svima"); //Bok se gubi
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("Bok");
		sb.append(" svima");
		System.out.println(sb);
		
		int [] polje1 = {1, 2, 3, 4, 5 ,6};
		System.out.println(avg(polje));
		
	}
	static String avg(int[] p) {
		return "Prosjek je " + "?"; 
	}

}
