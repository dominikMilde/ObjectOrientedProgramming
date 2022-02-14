/**
 * 
 */
package iterator2;

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
	static class FixedSizeCollectionIterator<T> implements Iterator<T>{
		private int index = 0;
		private FixedSizeCollection<T> col;
		
		public FixedSizeCollectionIterator(FixedSizeCollection<T> col) {
			this.col = col;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index<col.elements.length;
		}


		@Override
		public T next() {
			// TODO Auto-generated method stub
			return col.elements[index++];
		}
		
	}

	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new FixedSizeCollectionIterator<T>(this);
	}
	
}
