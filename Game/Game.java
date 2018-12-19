import java.util.*;
abstract public class Game{
	private char[] steps;
	private int NumberOfSteps;
	private String name;
	Game(String name,char[] steps,int NumberOfSteps){
		this.name = name;
		this.steps = steps;
		this.NumberOfSteps = NumberOfSteps;
	}
	char[] getsteps(){
		return steps;
	}
	int getNumberOfSteps(){
		return NumberOfSteps;
	}
	String getname(){
		return name;
	}
	abstract String StartGame();
}
