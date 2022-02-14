package hr.fer.oop.vlKlase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[]args) {
//		List<Student> students = new ArrayList<>();
//		Set<Student> students = new HashSet<>();
		Set<Student> students = new TreeSet<>((Student s1, Student s2)-> s1.getStudentID().compareTo(s2.getStudentID()));
		Common.fillStudentsCollection(students, Student::new);
		Common.printCollection(students);
		
		Student s = new Student("Poe", "Edgar Allan", "2345678901");
		System.out.println("Poe u kol: "+students.contains(s));
	}
}
