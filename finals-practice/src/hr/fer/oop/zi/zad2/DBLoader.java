package hr.fer.oop.zi.zad2;

import java.util.ArrayList;
import java.util.List;

public class DBLoader {
	static List<Student> loadStudents(){
		List <Student> indexList = new ArrayList<>();
		indexList.add(new Student("369090", "Ivo", "Ivi�", 4.5));
		indexList.add(new Student("367366", "Ante", "Juri�", 2.54));
		indexList.add(new Student("364545", "Jura", "Jurin", 3.7));
		indexList.add(new Student("363636", "Pero", "Peri�", 3.51));
		return indexList;
	}
}

