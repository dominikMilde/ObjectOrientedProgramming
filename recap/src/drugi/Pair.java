package drugi;

import prvi.Ntuple;

public class Pair<T extends Comparable<T>> extends Ntuple<T>{
	
	@SuppressWarnings("unchecked")
	public Pair(T first, T second) {
		super(first, second);
		// TODO Auto-generated constructor stub
	}
	
	public T getX() {
		return get(1);
	}
	public void setX(T value) {
		set(1, value); //super.set(1, value)
	}
	
	public T getY() {
		return get(2);
	}
	
	public void setY(T value) {
		set(2, value); 
	}
	
}
