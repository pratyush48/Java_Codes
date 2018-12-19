import java.util.*;
public class Match{
	private Team Team1,Team2;
	private int[][] rules;
	private int size;
	Match(Team A,Team B,int[][] data,int n){
		this.Team1 = A;
		this.Team2 = B;
		this.rules = data;
		this.size = n;
	}
	Team mwinner(){               
		if(rules[Team1.get()][Team2.get()] == 1){
			return Team2;
		}
		else{
			return Team1;
		}
	}
}
