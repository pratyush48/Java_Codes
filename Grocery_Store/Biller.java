import java.util.*;

public class Biller{
	private Cart c;
	private ArrayList<perishableItems> pitems;
	private ArrayList<nonPerishableItems> npitems;
	Biller(Cart c,ArrayList<perishableItems> pitems,ArrayList<nonPerishableItems> npitems){
		this.c = c;
		this.pitems = pitems;
		this.npitems = npitems;
	}
	void bill(){
		int i = 0;
		float weight = 0;
		float vol = 0;
		ArrayList<Order> o = c.getorder();
		float Total = 0;
		while(i < o.size()){
			float[] f = new float[2];
			f = check(o.get(i));
			if(f[1] == 0){
				weight += o.get(i).getunit(); 
			}
			else{
				vol += o.get(i).getunit();
			}
			Total += f[0];
			i++;		
		}
		Packer p = new Packer(weight,vol);
		float s = p.getshipping();
		System.out.print("Total ");
		System.out.printf("%.1f\n",(Total+s));
	}
	float[] check(Order o){
		float[] price = new float[2];
		float p;
		for(int i = 0;i < pitems.size();i++){
			if((o.getname()).equals(pitems.get(i).getname())){
				p = o.getunit()*pitems.get(i).getprice();
				System.out.print(o.getname()+" ");
				System.out.printf("%.1f",o.getunit());
				System.out.print(" ");
				System.out.printf("%.1f\n",p);
				price[0] =  p;
				price[1] =  0;
				return price;
			}
		}
		for(int i = 0;i < npitems.size();i++){
			if((o.getname()).equals(npitems.get(i).getname())){
				p = o.getunit()*npitems.get(i).getprice();
				System.out.print(o.getname()+" ");
				System.out.printf("%.1f",o.getunit());
				System.out.print(" ");
				System.out.printf("%.1f\n",p);
				price[0] =  p;
				price[1] =  1;
				return price;
			}
		}
	return price;
	}
}
