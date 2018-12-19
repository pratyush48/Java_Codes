import java.util.*;

public class RandomWalk extends Game{
	RandomWalk(String name,char[] steps,int NumberOfSteps){
		super(name,steps,NumberOfSteps);
	}
	@Override
	String StartGame(){
		int sides = 10;
		int height = 10;
		for(int i = 0;i < getNumberOfSteps();i++){
			if(getsteps()[i] == 'R'){
				if(sides == 20){
					return "Lost";
				}
				sides++;
			}
			else if(getsteps()[i] == 'L'){
				if(sides > 0){
					sides--;
				}
			}
			else if(getsteps()[i] == 'D'){
				if(height == 0){
					return "Won";
				}
				height--;
			}
			else if(getsteps()[i] == 'U'){
				if(height == 20){
					return "Lost";
				}
				height++;
			}
		}
		if(height == 0){
			return "Won";
		}
		else if(sides == 20 || height == 20){
			return "Lost";
		}
		else{
			return "Game Over";
		}
	}
}
