/**
 * 
 */
package generici;

/**
 * @author Dominik
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntegerPoint ip = new IntegerPoint(1, 2); // (new Integer(1), Integer.valueOf(2))
		System.out.println(ip);

		DoublePoint dp = new DoublePoint(4.2, 2.1);
		System.out.println(dp);

		ObjectPoint op = new ObjectPoint(1, 2);
		ObjectPoint op2 = new ObjectPoint(1.2, 2.22);

		System.out.println(op);
		System.out.println(op2);

		// op2.getX(). nudi mi metode Objecta
		((Double) op2.getX()).doubleValue();
		ObjectPoint op3 = new ObjectPoint("abnc", 3.14);
		System.out.println(op3);

		Point<Integer> gp = new Point<>(1, 2);
		gp.getX().intValue();
		
		Point gp3 = new Point(1,2); //tretira kao Object
	}
}
