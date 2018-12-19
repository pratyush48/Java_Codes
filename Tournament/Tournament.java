import java.util.*;
public class Tournament{
	private Team[] Teams;
	private int[][]rules;
	private int size;
	Tournament(Team[]t_names,int[][]data,int n){	
		this.Teams = t_names;
		this.rules = data;
		this.size = n;
	}

	void winner(){
		int n1 = size;
		Team[] arr1 = new Team[size];
		for(int i = 0;i < size;i++){
			arr1[i] = Teams[i];
		}
		Team[] arr2 = new Team[n1/2];
		for(int i = 0;i < Math.log(size)/Math.log(2);i++){
			int count = 0;
			for(int j = 0;j < n1;j++){
					if(j%2 == 0){
						Match match = new Match(arr1[j],arr1[j+1],rules,size);
						arr2[count] = match.mwinner();
						count++;
					}
					else{
						continue;
					}
			}
			System.out.print("Round "+(i+1)+" Winners: ");
			for(int m = 0;m < n1/2;m++){
				System.out.print((arr2[m].get()+1)+ " ");
			}
			System.out.println();
			n1 = n1/2;
			for(int k = 0;k < n1;k++){
				arr1[k] = arr2[k];		
			}
		}
	}
}

