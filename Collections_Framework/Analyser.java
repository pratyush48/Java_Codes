import java.util.*;
import java.util.Map.Entry;

public class Analyser{
	private ArrayList<String> Rwords;
	private ArrayList<String> lines;
	Analyser(ArrayList<String> Rwords,ArrayList<String> lines){
		this.Rwords = Rwords;
		this.lines = lines;
	}
	public ArrayList<String> a1(){
		ArrayList<String[]> line = new ArrayList<String[]>();
		for(int i = 0;i < lines.size();i++){
			line.add(lines.get(i).toLowerCase().replaceAll("[^a-zA-Z0-9\\s]","").split("\\s"));
		}			
		ArrayList<String> line1 = new ArrayList<String>();
		for(int i = 0;i < line.size();i++){
			for(int j = 0;j < line.get(i).length;j++){
				line1.add(line.get(i)[j]);
			}
		}
		Iterator<String> it = line1.iterator();
		while(it.hasNext()){
			String s = it.next();
			if(s.equals("")){
				it.remove();
			}
		}
		return line1;
	}
	public ArrayList<String> a2(){
		ArrayList<String[]> line = new ArrayList<String[]>();
		for(int i = 0;i < lines.size();i++){
			line.add(lines.get(i).toLowerCase().replaceAll("[^a-zA-Z0-9\\s]","").split("\\s"));
		}			
		ArrayList<String> line1 = new ArrayList<String>();
		for(int i = 0;i < line.size();i++){
			for(int j = 0;j < line.get(i).length;j++){
				line1.add(line.get(i)[j]);
			}
		}
		Iterator<String> it = line1.iterator();
		while(it.hasNext()){
			String s = it.next();
			if(s.equals("")){
				it.remove();
			}
		}
		Collections.sort(line1,new SortL());
		return line1;
	}
	public ArrayList<String> a3(){
		ArrayList<String[]> line = new ArrayList<String[]>();
		for(int i = 0;i < lines.size();i++){
			line.add(lines.get(i).toLowerCase().replaceAll("[^a-zA-Z0-9\\s]","").split("\\s"));
		}			
		ArrayList<String> line1 = new ArrayList<String>();
		for(int i = 0;i < line.size();i++){
			for(int j = 0;j < line.get(i).length;j++){
				line1.add(line.get(i)[j]);
			}
		}
		Set<String> data = new HashSet<String>(line1);
		List<String> data1 = new ArrayList<String>(data);
		Iterator<String> it = data1.iterator();
		while(it.hasNext()){
			String s = it.next();
		if(s.equals("")){
				it.remove();
			}
		}
		Collections.sort(data1,new SortS());
		ArrayList<String> al = (ArrayList<String>) data1;
		return al;
	}
	public ArrayList<String> a4(){
		ArrayList<String[]> line = new ArrayList<String[]>();
		for(int i = 0;i < lines.size();i++){
			line.add(lines.get(i).toLowerCase().replaceAll("[^a-zA-Z0-9\\s]","").split("\\s"));
		}			
		ArrayList<String> line1 = new ArrayList<String>();
		for(int i = 0;i < line.size();i++){
			for(int j = 0;j < line.get(i).length;j++){
				line1.add(line.get(i)[j]);
			}
		}
		Iterator<String> it = line1.iterator();
		while(it.hasNext()){
			String s = it.next();
			if(s.equals("")){
				it.remove();
			}
		}
		Set<String> data = new LinkedHashSet<String>(line1);
		Map<String,Integer> map = new LinkedHashMap<>();
		for(String s : data){
			int i = Collections.frequency(line1,s);
			map.put(s,i);
		}
		List<Integer> list = new ArrayList<Integer>();
		for(Integer i : map.values()){
			list.add(i);
		}
		Collections.sort(list,new SortF());
		Set<String> set = new LinkedHashSet<String>();
		for(int i = 0;i < list.size();i++){
			for(Map.Entry<String,Integer> entry : map.entrySet()){
				if(list.get(i) == entry.getValue()){
					set.add(entry.getKey());
				}
			}
		}
		List<String> l = new ArrayList<String>(set);
		ArrayList<String> al = (ArrayList<String>) l;
		return al;
	}
	public ArrayList<Entry<Integer,Character>> two(){
		ArrayList<String[]> line = new ArrayList<String[]>();
		for(int i = 0;i < lines.size();i++){
			line.add(lines.get(i).toLowerCase().replaceAll("[^a-zA-Z0-9\\s]","").split("\\s"));
		}			
		ArrayList<String> line1 = new ArrayList<String>();
		for(int i = 0;i < line.size();i++){
			for(int j = 0;j < line.get(i).length;j++){
				line1.add(line.get(i)[j]);
			}
		}
		Iterator<String> it = line1.iterator();
		while(it.hasNext()){
			String s = it.next();
			if(s.equals("")){
				it.remove();
			}
		}
		Collections.sort(line1,new SortL());
		ArrayList<Character> cList = new ArrayList<Character>(); 
		for(String s : line1){
			cList.add(s.charAt(0));
		}
		Set<Character> set = new LinkedHashSet<Character>(cList);
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(Character c : set){
			int i = Collections.frequency(cList,c);
			map.put(c,i);
		}
		List<Integer> list = new ArrayList<Integer>();
		for(Integer i : map.values()){
			list.add(i);
		}
		List<Character> list1 = new ArrayList<Character>();
		int i = 0;
		for(Map.Entry<Character,Integer> entry : map.entrySet()){
			if(list.get(i) == entry.getValue()){
				list1.add(entry.getKey());
				i++;
			}
		}
		Map<Integer,Character> map1 = new LinkedHashMap<>();
		for(int i1 = 0;i1 < list1.size();i1++){
			if(list.get(i1) != 0){
				map1.put(list.get(i1),list1.get(i1));
			}
		}
		ArrayList<Entry<Integer,Character>> al = new ArrayList<Entry<Integer,Character>>(map1.entrySet());
		return al;
	}
	public ArrayList<String> ThreeA(){
		ArrayList<String[]> line = new ArrayList<String[]>();
		for(int i = 0;i < lines.size();i++){
			line.add(lines.get(i).toLowerCase().replaceAll("[^a-zA-Z0-9\\s]","").split("\\s"));
		}			
		ArrayList<String> line1 = new ArrayList<String>();
		for(int i = 0;i < line.size();i++){
			for(int j = 0;j < line.get(i).length;j++){
				line1.add(line.get(i)[j]);
			}
		}
		Iterator<String> it = line1.iterator();
		while(it.hasNext()){
			String s = it.next();
			if(s.equals("")){
				it.remove();
			}
		}
		Set<String> set = new LinkedHashSet<String>(line1);
		Set<String> set1 = new LinkedHashSet<String>();
		for(String s : set){
			for(int i = 0;i < Rwords.size();i++){
				if(s.equals(Rwords.get(i))){
					set1.add(s);
				}
			}	
		}
		List<String> l = new ArrayList<String>(set1);
		ArrayList<String> al = (ArrayList<String>)l;
		return al;
	}
	public ArrayList<String> ThreeB(){
		ArrayList<String[]> line = new ArrayList<String[]>();
		for(int i = 0;i < lines.size();i++){
			line.add(lines.get(i).toLowerCase().replaceAll("[^a-zA-Z0-9\\s]","").split("\\s"));
		}			
		ArrayList<String> line1 = new ArrayList<String>();
		for(int i = 0;i < line.size();i++){
			for(int j = 0;j < line.get(i).length;j++){
				line1.add(line.get(i)[j]);
			}
		}
		Iterator<String> it = line1.iterator();
		while(it.hasNext()){
			String s = it.next();
			if(s.equals("")){
				it.remove();
			}
		}
		Map<String,Integer> map = new LinkedHashMap<>();
		Set<String> set = new LinkedHashSet<>(line1);
		for(String s : set){
			for(String s1 : Rwords){
				if(s.equals(s1)){
					int i = Collections.frequency(line1,s);
					map.put(s,i);
				}
			}
		}
		List<Integer> list = new ArrayList<Integer>();
		for(Integer i : map.values()){
			list.add(i);
		}
		Collections.reverse(list);
		Collections.sort(list,new SortF());
		Collections.reverse(list);
		Set<String> set1 = new LinkedHashSet<String>();
		for(Integer i : list){
			for(Map.Entry<String,Integer> entry : map.entrySet()){
				if(i == entry.getValue()){
					set1.add(entry.getKey());
				}
			}
		}
		List<String> l = new ArrayList<>(set1);
		ArrayList<String> al = (ArrayList<String>)l;
		return al;
	}
}
