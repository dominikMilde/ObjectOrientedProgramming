package hr.fer.oop.lab4.exceptions;

public class FootballPlayerEmotionException extends FootballPlayerCreationException{
	
	private static final long serialVersionUID = 1L;

	public FootballPlayerEmotionException(String message, int lowB, int upB) {
		super(message + " " + lowB + " - " + upB);
	}

}
