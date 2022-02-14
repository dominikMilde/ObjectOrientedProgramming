package secondapril;

public class MyListElement {
	private Object data;
	private MyListElement next;
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public MyListElement getNext() {
		return next;
	}

	public void setNext(MyListElement next) {
		this.next = next;
	}

	public MyListElement(Object o) {
		this.data = o;
	}
	
	public String toString() {
		return this.getData().toString();
	}
	
}
