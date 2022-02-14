/**
 * 
 */
package hr.fer.oop.iterator1;

import java.util.Iterator;

public class FixedSizeCollectionIterator<T> implements Iterator<T>{
	private int index = 0;
	private FixedSizeCollection<T> col;
	
	public FixedSizeCollectionIterator(FixedSizeCollection<T> col) {
		this.col = col;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index<this.col.size();
	}


	@Override
	public T next() {
		// TODO Auto-generated method stub
		return col.getElement(index++);
	}
	
}
