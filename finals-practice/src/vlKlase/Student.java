package hr.fer.oop.vlKlase;

public class Student implements Comparable<Student>{
	String lastName;
	String firstName; 
	String studentID;
	public Student(String lastName, String firstName, String studentID) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.studentID = studentID;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String toString() {
		return "("+this.getStudentID()+") "+this.getFirstName()+" "+this.getLastName();
	}
	@Override
	public int hashCode() {
		return this.getStudentID().hashCode();
		
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((studentID == null) ? 0 : studentID.hashCode());
//		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) return false;
		Student other = (Student) obj;
		return this.getStudentID().equals(other.getStudentID());
		
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (studentID == null) {
//			if (other.studentID != null)
//				return false;
//		} else if (!studentID.equals(other.studentID))
//			return false;
//		return true;
	}
	@Override
	public int compareTo(Student o) {
		return this.getStudentID().compareTo(o.getStudentID());
	}
	
}
