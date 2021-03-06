package hr.fer.oop.vlKlase;

import java.util.*;

public class Common {
	
	public static <T> void printCollection(Collection<T> col) {
		for(T el: col) {
			System.out.println(el);
		}
		System.out.println();
	}
	
	public static <S> void fillStudentsCollection(Collection<S> students, StudentFactory<S> factory) {		
		S s1 = factory.create("Black", "Joe", "1234567890");
		S s2 = factory.create("Poe", "Edgar Allan", "2345678901");
		S s3 = factory.create("Kant", "Immanuel", "3456789012");
		S s4 = factory.create("Rock", "Joe", "0123456789");
		S s5 = factory.create("Black", "Joe", "5687461359");
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);	
		students.add(s5);	
	}

}
