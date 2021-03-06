package hr.fer.oop.lab3.demo;

import hr.fer.oop.lab3.FootballPlayer;

public class FootballPlayerTest {

	public static void main(String[] args){

		FootballPlayer defaultPlayer = new FootballPlayer();
		
		System.out.println(defaultPlayer.getName());
		System.out.println(defaultPlayer.getCountry());
		System.out.println(defaultPlayer.getEmotion());
		System.out.println(defaultPlayer.getPlayingSkill());
		System.out.println(defaultPlayer.getPlayingPosition());
		
		System.out.println("Creation of a second player: ");
		
		FootballPlayer player2 = new FootballPlayer("Marko Pavelic", "Croatia", -2, 111, null);
		System.out.println(player2.getPlayingSkill());
		System.out.println(player2.getEmotion());
		System.out.println(player2.getPlayingPosition());
	}
}
