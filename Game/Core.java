import java.util.*;

public class Core{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			String game = in.next();
			if(game.equals("End")){
				break;
			}
			if(game.equals("FlightSimple")){
				int NumberOfSteps = in.nextInt();
				char[] steps = new char[NumberOfSteps];
				for(int i = 0;i < NumberOfSteps;i++){
					steps[i] = in.next().charAt(0);
				}
				FlightSimple gamename1  = new FlightSimple(game,steps,NumberOfSteps);
				Game gamename = gamename1;
				GameConsole g = new GameConsole(gamename,NumberOfSteps,steps);
				System.out.print("FlightSimple: ");
				g.play();
			}
			else{
				int NumberOfSteps = in.nextInt();
				char[] steps = new char[NumberOfSteps];
				for(int i = 0;i < NumberOfSteps;i++){
					steps[i] = in.next().charAt(0);
				}
				RandomWalk gamename2  = new RandomWalk(game,steps,NumberOfSteps);
				Game gamename = gamename2;
				GameConsole g = new GameConsole(gamename,NumberOfSteps,steps);
				System.out.print("RandomWalk: ");
				g.play();
			}
		}		
	}
}
//Sample Input//
//R:Right//
//L:Left//
//U:Up//
//D:Down//
/*FlightSimple 10
R R R U U R D L D D
RandomWalk 11
R R R U U R D L D D R
RandomWalk 20
R R R U U R D L D U R R U U U U U U U U
FlightSimple 20
R R U R U R R U D D L D L L L L L L L L
End*/
