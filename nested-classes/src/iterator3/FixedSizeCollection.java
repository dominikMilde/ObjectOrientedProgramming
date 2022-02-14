/**
 * 
 */
package iterator3;

import java.util.Iterator;

public class FixedSizeCollection<T> implements Iterable<T> {

	private T[] elements;

	@SuppressWarnings("unchecked")
	public FixedSizeCollection(T ... elementi) {
		elements = (T[]) new Object[elementi.length];
		for(int i=0; i<elementi.length; i++) {
			elements[i] = elementi[i];
		}
	}
	
	public int size() {
		return elements.length;
	}
	
	public T getElement(int idx) {
		return elements[idx];
	}
	
	private class FixedSizeCollectionIterator implements Iterator<T>{
		private int index = 0;
		private FixedSizeCollection<T> col;
		

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index<elements.length;
		}


		@Override
		public T next() {
			// TODO Auto-generated method stub
			return elements[index++];
		}
		
	}

	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new FixedSizeCollectionIterator();
	}
	
}
