package hr.fer.oop.lab4.exceptions;

public class TeamCountryNullException extends TeamCreationException{
	
	private static final long serialVersionUID = 1L;

	public TeamCountryNullException(){
		super("Team country must not be null!");
	}

}
