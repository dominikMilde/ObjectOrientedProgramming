/**
 * 
 */
package hashovi;

public class Program {

	public static void main(String[] args) {
		//Integer i = new Integer(5);
		Integer i = 127;	//zadnji s istim identitetom
		System.out.println(i + " : " + System.identityHashCode(i));
		i++;
		/*
		 * int i1 = i.getIntValue(); i1++; i = new Integer(i1);
		 */
		System.out.println(i + " : " + System.identityHashCode(i));
		i--;
		System.out.println(i + " : " + System.identityHashCode(i));
		
		for (Integer j=1; j<5; j++) {
			System.out.println(j + ":" + System.identityHashCode(j));
		}
	}

}