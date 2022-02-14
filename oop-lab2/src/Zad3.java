
public class Zad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstRepeatingChar("Ovdje je aoa"));
	}
	
	public static Character firstRepeatingChar(String str) {
		char[] lista = str.toCharArray();
		for(int c=0; c < lista.length; c++) {
			for(int j=c+1; j<lista.length; j++) {
				if(String.valueOf(lista[c]).toLowerCase().equals(String.valueOf(lista[j]).toLowerCase())) {
					return lista[c];
				}
			}
		}
		return null;
	}

}
