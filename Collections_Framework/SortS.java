import java.util.*;
import java.util.Map.Entry;
//Sorts according to both length and frequency of occurence of words//
public class SortS implements Comparator<String>{
	public int compare(String  a,String b){
		if(a.length() == b.length()){
			return a.compareTo(b);
		}
		else{
			return a.length() - b.length();
		}
	}
}
