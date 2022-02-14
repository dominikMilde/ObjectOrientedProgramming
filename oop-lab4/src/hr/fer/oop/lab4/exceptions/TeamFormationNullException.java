package hr.fer.oop.lab4.exceptions;

public class TeamFormationNullException extends TeamCreationException{
	
	private static final long serialVersionUID = 1L;

	public TeamFormationNullException(){
		super("Team formation must not be null!");
	}
}
