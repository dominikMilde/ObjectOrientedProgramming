package hr.fer.oop.vlKlase;

public interface StudentFactory <S>{
	S  create(String lastName, String firstName, String studentID);
}
