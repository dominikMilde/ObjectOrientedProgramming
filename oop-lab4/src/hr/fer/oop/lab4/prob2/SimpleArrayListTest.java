package hr.fer.oop.lab4.prob2;

public class SimpleArrayListTest {

	public static void main(String[] args) {
		
		SimpleArrayList<Double> doubleList = new SimpleArrayList<>();
		SimpleArrayList<Integer> integerList = new SimpleArrayList<>();
		
		doubleList.add(1.1);
		doubleList.add(2.2);
		doubleList.add(3.3);
		doubleList.add(4.4);
		
		integerList.add(1);
		integerList.add(2);
		
		for(int i = 0; i<doubleList.size(); i++){
			System.out.println(doubleList.get(i));
		}
		
		for(int i = 0; i<integerList.size(); i++){
			System.out.println(integerList.get(i));
		}
		
	}
	
}
