package hr.fer.oop.lab3.demo;

import hr.fer.oop.lab3.NationalTeam;

public class NationalTeamTest {

	public static void main(String[] args){

		NationalTeam defaultTeam = new NationalTeam();
		
		System.out.println(defaultTeam.getFormation());
		
		System.out.println("Creating second team:");
		
		
		NationalTeam team2 = new NationalTeam(null , null, null);
		
		System.out.println(team2.getFormation());
		System.out.println(team2.getName());
		System.out.println(team2.getCountry());
	}

}
