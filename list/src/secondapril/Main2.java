/**
 * 
 */
package secondapril;

import java.awt.Point;

/**
 * @author Dominik
 *
 */
public class Main2<T> {

	public static <V> void ispisi(V nesto) {
		System.out.println(nesto.toString());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ispisi(3);
		ispisi("Radi");
		//ispisi(new Point<Integer>(2,1));
	}

}
