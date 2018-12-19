import  java.util.*;

public class Bank{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Request> request = new ArrayList<Request>();
		int i = 0;
		while(true){
			char c = in.next().charAt(0);
			if(c == 'D' || c == 'W'){
				int id = in.nextInt();
				int amount = in.nextInt();
				int rnum = i+1;
				request.add(new Request(c,id,amount,rnum));
				i++;
			}
			else if(c == 'Q'){
				int id = in.nextInt();
				int rnum = i+1;
				request.add(new Request(c,id,rnum));
				i++;
			}
			else if(c == 'B'){
				request.add(new Request(c));	
			}
			else{
				request.add(new Request(c));
				Teller T = new Teller(request);
				T.appoint_cashier();
				break;
			}
		}
	}
}
//Sample Input//
//D:Deposit _amount_//
//Q:Request _amount_//
//W:Withdraw _amount_ //
//B:Break//
//E:End //
/*D 1 1000
D 2 2000
Q 1
W 2 1000
B
D 3 3000
W 3 1000
E*/
