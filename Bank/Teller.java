import  java.util.*;
public class Teller{
	private ArrayList<Request> request;
	int Time = 0;
	int[]requestnumber;
	Teller(ArrayList<Request> r){
		this.request = r;
	}
	void appoint_cashier(){
		int i = 0;
		int b = 0;
		while(true){
			if(request.get(i).getjob() == 'D' || request.get(i).getjob() == 'W' || request.get(i).getjob() == 'Q'){
				i++;
			}
			else if(request.get(i).getjob() == 'B'){
				int num;
				num = (i-b)/3;
				if((i-b)%3 >= 1){
					num += 1;
				}
				ArrayList<Cashier> cashier = new ArrayList<Cashier>();
				for(int j = 0; j < num;j++){
					cashier.add(new Cashier(request.subList(b,i),j,Time,num));
					Time = cashier.get(j).print();
				}
				cashier.clear();
				b = i+1;
				i++;
				continue;
			}
			else if(request.get(i).getjob() == 'E'){
				int num;
				num = (i-b)/3;
				if((i-b)%3 >= 1){
					num += 1;
				}
				ArrayList<Cashier> cashier = new ArrayList<Cashier>();
				for(int j = 0; j < num;j++){
					cashier.add(new Cashier(request.subList(b,i+1),j,Time,num));
					Time = cashier.get(j).print();
				}
				break;
			}
		}
	}
}
