package oops2test;

public class UseCricketResult {
	public static void main(String[] args) {
		int bowler1=1;
		int bowler2=7;
		int bowler3=2;
		int bowler4=3;
		int bowler5=4;
		int batsman1=33;
		int batsman2=55;
		int batsman3=66;
		int batsman4=20;
		int batsman5=12;
		int batsman6=102;
		CricketResult cr=new CricketResult();
		cr.manOfMatch(bowler1,bowler2,bowler3,bowler4,bowler5);
		cr.manOfMatch(batsman1, batsman2, batsman3, batsman4, batsman5, batsman6);
	}

}
