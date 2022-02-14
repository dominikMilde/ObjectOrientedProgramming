package hr.fer.oop.zi.zad2;

import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Predicate;


public class Main {
	public static void printStudents(Iterable<Student> students, 
									 Predicate<Student> predicate) {
		for (Student s: students) {
			if (predicate.test(s)) {
				System.out.println(s.toString());
			}
		}
	}
	public static void printPair(Student first, Student last) {
		System.out.format("First and last student: %n\t%s%n\t%s%n", first, last);
	}
	// Definirajte metodu firstAndLastStudent u kojoj se na temelju 
	//komparatora comparator dolazi do prvog i posljednjeg studenta me�u 
	//studentima students te se nad prvim i posljednjim studentom izvodi 
	//akcija action.
	public static void firstAndLastStudent(Iterable<Student> students, 
										   Comparator<Student> comparator, 
										   BiConsumer<Student, Student> action) {
	
		TreeSet<Student> ss = new TreeSet<>(comparator);
		for (Student s : students) ss.add(s);
		
		action.accept(ss.first(), ss.last());
	
	}

	public static void main(String[] args) {
		List<Student> dataset = DBLoader.loadStudents();
		// Pozivom metode printStudents ispi�ite sve studente 
		//koji imaju prosjek ve�i od 3.5 (u pozivu morate koristiti 
		//primjerak objekta koji pripada anonimnom razredu).
		printStudents(
				dataset,
				(s -> s.getAvgGrade()>3.5));
		
		// Poziv metode firstAndLastStudent s vanjskim komparatorom 
		//koji je definiran po atributu avgGrade u klasi Student s 
		//akcijom koja je definirana u metodi printPair.
		firstAndLastStudent (
				dataset,
				Student.AVG_GRADE,
				Main::printPair
				);

		//Definirajte i kreirajte BiConsumer koji ispisuje apsolutnu 
		//vrijednost razlike prosje�nih ocjena dvaju studenata kao 
		//Diff= x.xx (vidi primjer ispisa programa)
		
		BiConsumer<Student, Student> printDiff = new BiConsumer<Student, Student>() {
			
			@Override
			public void accept(Student t, Student u) {
				// TODO Auto-generated method stub
				System.out.println("Diff= " + Math.abs(t.getAvgGrade() - u.getAvgGrade()));
				
			}
		};
//				(s1, s2) 
//				-> System.out.println("Diff= " + 
//						Math.abs(s1.getAvgGrade()-s2.getAvgGrade())
//						);
				
		
		//Poziv metode firstAndLastStudent s vanjskim komparatorom koji 
		//je definiran po atributu avgGrade u klasi Student ali reverzno 
		//s akcijom koja je definirana u prije navedenom BiConsumer-u 
		//(ispis razlike prosje�nih ocjena).
		firstAndLastStudent (
				dataset,
				Student.AVG_GRADE.reversed(),
				printDiff
				);


	} // end of main
}
