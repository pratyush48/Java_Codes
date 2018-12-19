import java.util.*;

public class Packer{
	private float weight;
	private float volume;
	Packer(float weight,float volume){
		this.weight = weight;
		this.volume = volume;
	}
	float getshipping(){
		float shipping_cost = 0;
		float w = weight - 5;
		float v = volume - 4;
		if(w > 0){
			shipping_cost += w*5;
		}
		if(v > 0){
			shipping_cost += v*2;
		}
		System.out.print("Shipping ");
		System.out.printf("%.1f\n",shipping_cost);
		return shipping_cost;
	}
}
