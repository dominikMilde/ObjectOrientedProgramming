
public class Zad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lista = new int[] {1, 5, 2, 2, 5};
		int[] nova = filterOdd(lista);
		
		for(int i=0; i< nova.length; i++) {
			System.out.println(nova[i]);
		}

	}
	
	public static int[] filterOdd(int []arr) {
		int counterOdd = 0;
		for(int i=0; i<arr.length; i++) {
			if (arr[i] % 2 == 1) {
				counterOdd++;
			} 
		}
		int[] nova = new int[counterOdd];
		int counterList = 0;
		for(int i=0; i<arr.length; i++) {
			if (arr[i] % 2 == 1) {
				nova[counterList] = arr[i];
				counterList++;
			}
		}
		
		return nova;
	}

}
