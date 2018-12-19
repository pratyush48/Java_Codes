import java.util.*;

public class GameConsole{
	private Game game;
	private int NumberOfSteps;
	private char[] steps;
	GameConsole(Game game,int NumberOfSteps,char[] steps){
		this.game = game;
		this.NumberOfSteps = NumberOfSteps;
		this.steps = steps;
	}
	void play(){
		System.out.println(game.StartGame());
	}		
}
