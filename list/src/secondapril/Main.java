package secondapril;

public class Main {
	public static void main(String[] args) {
		MyList list = new MyList();
		list.addFirst("abcss");
		list.addFirst("sec");
		list.print();
		System.out.print(list.size());
		
		list.clear();
		
		list.print();
		System.out.print(list.size());
		list.addLast("first");
		list.addLast("second");
		list.addLast("third");
		list.print();
		list.removeAt(1);
		list.print();
//
//		System.out.println(list.size());//ispisuje: 3
//		list.removeAt(1);
		System.out.println(list.elementAt(1));//ispisuje: third
//		System.out.println(list.size());//ispisuje: 2
//
//		list.addLast("fourth");
//		System.out.println(list.elementAt(2));//ispisuje: fourth
	}
}
