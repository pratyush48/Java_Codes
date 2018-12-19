import java.util.*;

public class Order{
	private String name;
	private float unit;
	private perishableItems p;
	private nonPerishableItems np;
	Order(String name,float unit){
		this.name = name;
		this.unit = unit;
	}
	Order(perishableItems p,float d){
		this.p = p;
		this.unit = d;
	}
	Order(nonPerishableItems p,float d){
		this.np = p;
		this.unit = d;
	}
	String getname(){
		return name;
	}
	float getunit(){
		return unit;
	}
}
