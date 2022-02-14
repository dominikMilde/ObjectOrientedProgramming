/**
 * 
 */
package hr.fer.oop.iterator1;

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
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new FixedSizeCollectionIterator<T>(this);
	}
	
}
