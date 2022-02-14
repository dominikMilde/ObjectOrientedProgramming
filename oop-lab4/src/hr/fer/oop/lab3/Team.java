package hr.fer.oop.lab3;

import hr.fer.oop.lab3.welcomepack.Constants;
import hr.fer.oop.lab3.welcomepack.Formation;
import hr.fer.oop.lab3.welcomepack.ManageableTeam;
import hr.fer.oop.lab3.welcomepack.SimpleFootballPlayerCollection;
import hr.fer.oop.lab4.exceptions.TeamFormationNullException;
import hr.fer.oop.lab4.exceptions.TeamNameNullException;

/**
 * Vježba za studente: dokumentirajte programski kod pisanjem smislenih Javadoc komentara (razred i metode).
 */
public abstract class Team implements ManageableTeam {

 	private String name = Constants.DEFAULT_TEAM_NAME;
    private Formation formation = Constants.DEFAULT_FORMATION;
    private SimpleFootballPlayerCollection registeredPlayers;
    private SimpleFootballPlayerCollection startingEleven = new SimpleFootballPlayerCollectionImpl(Constants.STARTING_ELEVEN_SIZE);

    public Team(String name, Formation formation, int registeredPlayersSize) {
        this.registeredPlayers = new SimpleFootballPlayerCollectionImpl(registeredPlayersSize);
        try{
        	if(name != null){
        		this.name = name;
        	} else throw new TeamNameNullException();
        }
        catch(TeamNameNullException e){
        	e.printStackTrace();
        	this.name = "NoName";
		} finally {
			if(name == null)
			{
				System.out.println("Name is set to noName");
			}
		}
        
        setFormation(formation);
    }

    public Team(int registeredPlayersSize){
        this.registeredPlayers = new SimpleFootballPlayerCollectionImpl(registeredPlayersSize);
    }



    @Override
    public boolean addPlayerToStartingEleven(FootballPlayer player) {
        if(registeredPlayers.contains(player) && !startingEleven.contains(player) && startingEleven.size() < Constants.STARTING_ELEVEN_SIZE){
            startingEleven.add(player);
            return true;
        }
        return false;
    }

    @Override
    public void clearStartingEleven() {
        startingEleven.clear();
    }

    @Override
    public Formation getFormation() {
        return formation;
    }
    
    public String getName(){
    	return name;
    }

    @Override
    public SimpleFootballPlayerCollection getRegisteredPlayers() {
        return registeredPlayers;
    }

    @Override
    public SimpleFootballPlayerCollection getStartingEleven() {
        return startingEleven;
    }

    @Override
    public boolean isPlayerRegistered(FootballPlayer player) {
        return registeredPlayers.contains(player);
    }

    @Override
    public void setFormation(Formation formation) {
    	try{
    		if(formation!=null)
    			this.formation = formation;
    		else throw new TeamFormationNullException();
    	}catch(TeamFormationNullException e){
    		e.printStackTrace();
    		this.formation = Formation.F442;
    	}finally{
    		if(formation == null){
    			System.out.println("Formation set to 442");
    		}
    	}
    }
}
