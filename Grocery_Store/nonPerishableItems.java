import java.util.*;

public class nonPerishableItems extends Item{
	private float volume;
	nonPerishableItems(String name,int price,float volume){
		super(name,price);
		this.volume = volume;
	}
	float getvolume(){
		return volume;
	}
}
