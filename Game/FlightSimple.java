import java.util.*;

public class FlightSimple extends Game{
	FlightSimple(String name,char[] steps,int NumberOfSteps){
		super(name,steps,NumberOfSteps);
	}
	@Override
	String StartGame(){
		int altitude = 0;
		int speed = 0;		
		for(int i = 0;i <getNumberOfSteps();i++){
			if(getsteps()[i] == 'R'){
				speed += 1;	
			}
			else if(getsteps()[i] == 'L'){
				speed -= 1;
				if(speed == 0 &&  altitude >= 1){
					String result = "Lost";
					return result;
				}
			}
			else if(getsteps()[i] == 'U'){
				if(altitude == 0){
					if(speed > 2){
						altitude += 1;
					}
				}
				else{
					altitude += 1;
				}
			}
			else if(getsteps()[i] == 'D'){
				altitude -= 1;
				if(altitude < 0){
					String s = "Lost";
					return s;
				}
			}
		}
		if(speed <= 0 && altitude <= 0){
			String s = "Won";
			return s;
		}
		else{
			String s = "Game Over";
			return s;
		}
	}
}
