import  java.util.*;
public class Cashier{
	private List<Request> request;
	private int id;
	int Time;
	int number;
	Cashier(List<Request> r,int id,int T,int num){
		this.request = r;
		this.id = id;
		this.Time = T;
		this.number = num;
	}		
	int print(){
		int amount = 0;
		System.out.println("Cashier "+ (id+1));
		for(int i = request.size()-1;i >=0;i--){
			if(i%number == id){
				if(request.get(i).getjob() == 'D'){
					Time += 5;
					System.out.println("Request " + request.get(i).getrnum() + " " + Time);
					amount += request.get(i).getamount();
				}
				else if(request.get(i).getjob() == 'W'){
					Time += 10;
					System.out.println("Request " + request.get(i).getrnum() + " " + Time);
					amount -= request.get(i).getamount();
				}
				else if(request.get(i).getjob() == 'Q'){
					Time += 2;
					System.out.println("Request " + request.get(i).getrnum() + " " + Time);
				}
			}
			else{
				continue;
			}
		}
		System.out.println("Total " + amount);
		return Time;
	}
}
