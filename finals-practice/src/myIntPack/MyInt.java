/**
 * 
 */
package myIntPack;

import java.util.*;

/**
 * @author Dominik
 *
 */
public class MyInt implements Iterable<Integer>{
	private List<Integer> lista;
	public MyInt(int number) {
		int temp = number;
		lista = new ArrayList<Integer>();
		int prosti = 2;
		while(temp != 1) {
			if(temp % prosti == 0) {
				temp = temp / prosti;
				lista.add(prosti);
			}
			else {
				prosti++;
			}
		}
	}
	
	public Iterator<Integer> iterator() {
		return new MyIterator();
	}
	
	class MyIterator implements Iterator<Integer>{
		private int index = 0;
		public boolean hasNext() {
			if(index+1 <= lista.size()) {
				return true;
			}
			return false;
		}
		
		public Integer next() {
			return lista.get(index++);
		}
	}
}
