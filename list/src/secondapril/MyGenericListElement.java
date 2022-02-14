package secondapril;

public class MyGenericListElement<T> {
	private T data;
	private MyGenericListElement<T> next;
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public MyGenericListElement<T> getNext() {
		return next;
	}

	public void setNext(MyGenericListElement<T> next) {
		this.next = next;
	}

	public MyGenericListElement(T o) {
		this.data = o;
	}
	
	public String toString() {
		return this.getData().toString();
	}
	
}
