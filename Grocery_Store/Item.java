import java.util.*;
//Base class..Rest classes will derive from//
public class Item{
	private String name;
	private  int price;
	Item(String name,int price){
		this.name = name;
		this.price = price;
	}
	String getname(){
		return name;
	}
	int getprice(){
		return price;
	}
}
