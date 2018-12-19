import java.util.*;

public class Store{
	private Cart c;
	private ArrayList<perishableItems> pitems;
	private ArrayList<nonPerishableItems> npitems;
	Store(ArrayList<perishableItems> pitems,ArrayList<nonPerishableItems> npitems,Cart c){
		this.pitems = pitems;
		this.npitems = npitems;
		this.c = c;
	}
	void compute(){
		Biller biller = new Biller(c,pitems,npitems);
	 	biller.bill();	
	}
}
