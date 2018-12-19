import java.util.*;
import java.util.Map.Entry;

public class Core{
	public static void main(String[] args){
		ArrayList<String> ReservedWords = new ArrayList<String>();
		ArrayList<String> lines = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		while(true){
			String word = in.next();
			if(word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'){
				lines.add(word);
				break;
			}
			else{
				ReservedWords.add(word);
			}
		}
		while(true){
			String line = in.nextLine();
			lines.add(line);
			if(line.charAt(line.length()-1) == '.'){
				Analyser analysis = new Analyser(ReservedWords,lines);
				System.out.print("1a:");
				System.out.println(String.join(" ",analysis.a1()));
				System.out.print("1b:");
				System.out.println(String.join(" ",analysis.a2()));
				System.out.print("1c:");
				System.out.println(String.join(" ",analysis.a3()));
				System.out.print("1d:");
				System.out.println(String.join(" ",analysis.a4()));
				System.out.print("2a:");
				List<Entry<Integer,Character>> map  = new ArrayList<Entry<Integer,Character>>(analysis.two());
				for(Entry<Integer,Character> m : map){
					System.out.println(m.getValue()+" "+m.getKey());
				}
				System.out.print("3a:");
				System.out.println(String.join(" ",analysis.ThreeA()));
				System.out.print("3b:");
				System.out.println(String.join(" ",analysis.ThreeB()));
				break;
			}
		}
	}
}
//Sample Input//
/*groups collections elements
A collection — sometimes called a container — is simply an object that groups multiple
elements into a single unit.. A collections framework helps manipulate collections, creating sets
of elements etc.*/
