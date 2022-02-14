/**
 * 
 */
package hr.fer.oop.iterator1;

/**
 * @author Dominik
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedSizeCollection<String> col1 = new FixedSizeCollection<String>("Franjo", "Stipe", "Mate", "Ante");
		
		for(String s:col1) {
			System.out.println(s);
		}
	}

}
