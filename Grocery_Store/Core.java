import java.util.*;

public class Core{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<perishableItems> pitems = new ArrayList<perishableItems>();
		ArrayList<nonPerishableItems> npitems = new ArrayList<nonPerishableItems>();
		while(true){
			String name = in.next();
			if(name.equals("End")){
				break;
			}
			int price = in.nextInt();
			if(in.hasNextFloat()){
				float c = in.nextFloat();
				npitems.add(new nonPerishableItems(name,price,c));
			}
			else{
				pitems.add(new perishableItems(name,price));
			}
		}
		ArrayList<Order> order1 = new ArrayList<Order>();
		ArrayList<Order> order2 = new ArrayList<Order>();
		while(true){
			String name = in.next();
			if(name.equals("Checkout")){
				Cart c = new Cart(order1);
				Store store = new Store(pitems,npitems,c);
				store.compute();
				break;
			}
			else{
				float d = in.nextFloat();
				for(int i = 0;i < pitems.size();i++){
					if(name.equals(pitems.get(i).getname())){
						order2.add(new Order(pitems.get(i),d));
					}
				}
				for(int i = 0;i < npitems.size();i++){
					if(name.equals(npitems.get(i).getname())){
						order2.add(new Order(npitems.get(i),d));
					}
				}
				order1.add(new Order(name,d));
			}
		}
	}
}
//Sample  Input//
////---------------------//
//First set of inputs are the items available in the store//
/*Banana 35
Carrots 60
Potato 70
Grapes 120
Butter 210
Detergent 200 2.5
Soap 35 0.4
Notebook 40 0.2
End*/
//----------------------//
//Second set of inputs are items we buy from the store//
/*Grapes 0.5
Potato 3.0
Detergent 2
Soap 5
Butter 0.5
Carrots 1.5
Checkout*/

