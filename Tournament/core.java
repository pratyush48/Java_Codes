import java.util.*;
//This is the main code where all the classes are called//
public class core{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] data = new int[n][n];
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++){
				data[i][j] = in.nextInt();
			}
		}
		Team[] t_names = new Team[n];
		for(int i = 0;i < n;i++){
			int c = in.nextInt();
			t_names[i] = new Team(c-1);
		}	
		Tournament t1 = new Tournament(t_names,data,n);
		t1.winner();
	}
}
//Sample test case//
/*8
0 1 -1 1 -1 1 -1 1
-1 0 1 -1 1 -1 1 -1
1 -1 0 -1 1 -1 1 -1
-1 1 1 0 1 -1 1 -1
1 -1 -1 -1 0 1 -1 1
-1 1 1 1 -1 0 -1 1
1 -1 -1 -1 1 1 0 1
-1 1 1 1 -1 -1 -1 0
0 1 2 3 4 5 6 7*/
