import java.util.*;
import java.util.Map.Entry;
//Sorts according to the length  of string//
public class SortL implements Comparator<String>{
	public int compare(String a,String b){
		return a.compareTo(b);
	}
}
