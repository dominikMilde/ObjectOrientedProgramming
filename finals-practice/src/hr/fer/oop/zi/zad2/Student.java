package hr.fer.oop.zi.zad2;

import java.util.Comparator;

public class Student implements Comparable<Student> { 

	private String jmbag; 
	private String firstname; 
	private String surname; 
	private Double avgGrade;

	public Student(String jmbag, String firstname, String surname, Double avgGrade) {
		this.jmbag = jmbag;
		this.firstname = firstname;
		this.surname = surname;
		this.avgGrade = avgGrade;
	}




	public String getJmbag() {
		return jmbag;
	}
	public void setJmbag(String jmbag) {
		this.jmbag = jmbag;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Double getAvgGrade() {
		return avgGrade;
	}
	public void setAvgGrade(Double avgGrade) {
		this.avgGrade = avgGrade;
	}

	public String toString() {
		return this.jmbag + " : " + this.firstname + " " + this.surname;
	}

	@Override
	public int compareTo(Student o) {
		return this.getJmbag().compareTo(o.getJmbag());
	}

	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Student)) return false;
		Student otherStudent = (Student) other;
		return this.getJmbag().equals(otherStudent.getJmbag());
	}
	
	public int hashCode() {
		return this.getJmbag().hashCode();
	}
	
	public static final Comparator<Student> SURNAME = 
			(s1, s2) -> s1.getSurname().compareTo(s2.getSurname());
	
	
	public static final Comparator<Student> AVG_GRADE = 
			(s1, s2) -> s1.getAvgGrade().compareTo(s2.getAvgGrade());

}
