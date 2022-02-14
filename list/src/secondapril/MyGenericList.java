package secondapril;


public class MyGenericList<T> {

	MyGenericListElement<T> head;
		
		public MyGenericList() {
			//this.head = null;
		}
		
		public void addFirst(T o) {
			MyGenericListElement<T> el = new MyGenericListElement<T>(o);
			el.setNext(head);
			head = el;
		}
		
		public void print() {
			MyGenericListElement<T> curr = head;
			System.out.print("head -> ");
			
			while (curr != null) {
				System.out.print(" [" + curr.getData() + "] -> ");
				curr = curr.getNext();
			}
			System.out.println("null");
		}
		
		public int size() {
			int i=0;
			MyGenericListElement<T> curr = head;
			while (curr != null) {
				i++;
				curr = curr.getNext();
			}		
			return i;
		}
		
		public void clear() {
			head = null;
		}
		
		public int addLast(T o) {
			if (head == null) {
				addFirst(o);
				return 0;
			}
			MyGenericListElement<T> curr = head;
			int i=1;
			while (curr.getNext() != null) {
				i++;
				curr = curr.getNext();
			}
			MyGenericListElement<T> el = new MyGenericListElement<T>(o);
			el.setNext(null);
			curr.setNext(el);
			return i;
		}
		
		public void removeAt(int idx) {
			if (idx == 0) {
				head = head.getNext();
			}

			int i=1;
			MyGenericListElement<T> curr = head;
			while (i<idx-1) {
				i++;
				curr = curr.getNext();
			}
			
			curr.setNext(curr.getNext().getNext());		
		}
		
		public T elementAt (int idx) {
			int i=0;
			MyGenericListElement<T> curr = head;
			while (i<idx) {
				i++;
				curr = curr.getNext();
			}
			return curr.getData();
		}

	}
