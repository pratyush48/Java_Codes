import java.util.*;

public class Cart{
	private ArrayList<Order> order;
	Cart(ArrayList<Order> order){
		this.order  = order;
	}
	ArrayList<Order> getorder(){
		return order;
	}
}
