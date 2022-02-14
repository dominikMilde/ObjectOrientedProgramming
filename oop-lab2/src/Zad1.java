public class Zad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		increasing(null);

	}
	static void increasing(int[] arr) {
			int prvi = (int) (Math.random()*9) + 1;
			arr[0] = prvi;
			for(int i=0; i<arr.length-1; i++) {
				arr[i+1] = (int) (Math.random()*arr[i]) + arr[i];
			}
		}
	}

