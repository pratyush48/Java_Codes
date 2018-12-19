import  java.util.*;

class Request{
	private int id;
	private int amount;
	private char job;
	private int rnum;
	Request(char job,int id,int amount,int num){
		this.job = job;
		this.id = id;
		this.amount = amount;
		this.rnum = num;
	}
	Request(char job,int id,int num){
		this.job = job;
		this.id = id;
		this.rnum = num;
	}
	Request(char job){
		this.job = job;
	}
	char getjob(){return job;}
	int getamount(){return amount;}
	int getid(){return id;}
	int getrnum(){return rnum;}
}
