
public class Zad5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(obrnutPoredakRijeci("Lopta je okrugla"));
	}
	
	public static String obrnutPoredakRijeci(String str) {
		String[] lista = str.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for(int i=(lista.length-1); i>=0; i--) {
			sb.append(lista[i]).append(" ");
		}
		String povrat = sb.toString();
		return povrat;
	}

}
