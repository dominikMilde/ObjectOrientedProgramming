package secondapril;

public class MyList {
	MyListElement head;
	public MyList() {
		this.head=null;
	}
	public void addFirst(Object o) {
		MyListElement el = new MyListElement(o);
		el.setNext(head);
		head = el;
	}
	public void print() {
		MyListElement curr=head;
		System.out.print("Head -> ");
		while(curr != null) {
			System.out.print(" ["+ curr.getData()+"] -> ");
			curr=curr.getNext();
		}
	}
	
	public int size() {
		int i=0;
		MyListElement curr = head;
		while(curr!=null) {
			i++;
			curr=curr.getNext();
		}
		return i;
	}
	
	public void clear() {
		head=null;
	}
	
	public int addLast(Object o) {
		if(head==null) {
			addFirst(o);
			return 0;
		}
		int i=1;
		MyListElement curr = head;
		while(curr.getNext()!=null) {
			i++;
			curr=curr.getNext();
		}
		MyListElement el = new 	MyListElement(o);
		el.setNext(null);
		curr.setNext(el);
		return i;
	}
	
	public void removeAt(int ind) {
		if(ind==0) {
			head=head.getNext();
		}
		MyListElement curr = head;
		int i=1;
		while(i<ind-1) {
			i++;
			curr=curr.getNext();
		}
		curr.setNext(curr.getNext().getNext());
	}
	
	public MyListElement elementAt (int ind) {
		MyListElement curr = head;
		int i=0;
		while(i<ind) {
			i++;
			curr=curr.getNext();
		}
		return curr;
	}
}
