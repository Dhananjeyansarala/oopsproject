package oops2test;

public class CricketResult {
	public void manOfMatch(int bowler1,int bowler2,int bowler3,int bowler4,int bowler5) {
		
		if(bowler1>bowler2&&bowler1>bowler3&&bowler1>bowler4&&bowler1> bowler5) {
			System.out.println(bowler1+" is highest wicket");
		}
		else if(bowler2>bowler1&&bowler2>bowler3&bowler2>bowler4&&bowler2>bowler5) {
			System.out.println(bowler2+" is highest wicket");
		}
		else if(bowler3>bowler1&&bowler3>bowler2&bowler3>bowler4&&bowler3>bowler5) {
			System.out.println(bowler3+" is highest wicket");
		}
		else if(bowler4>bowler1&&bowler4>bowler2&bowler4>bowler3&&bowler4>bowler5) {
			System.out.println(bowler4+" is highest wicket");
		}
		else {
			System.out.println(bowler5+" is highest wicket");
		}
	}
	public void manOfMatch(int batsman1,int batsman2,int batsman3,int batsman4,int batsman5,int batsman6) {
			if(batsman1>batsman2&&batsman1>batsman3&&batsman1>batsman4&&batsman1>batsman5&&batsman5>batsman6) {
			System.out.println(batsman1+" is highest score");
		}
		else if(batsman1>batsman2&&batsman1>batsman3&&batsman1>batsman4&&batsman1>batsman5&&batsman5>batsman6) {
			System.out.println(batsman2+" is highest score");
		}
		else if(batsman2>batsman1&&batsman2>batsman3&&batsman2>batsman4&&batsman2>batsman5&&batsman2>batsman6) {
			System.out.println(batsman3+" is highest score");
		}
		else if(batsman3>batsman1&&batsman3>batsman2&&batsman3>batsman4&&batsman3>batsman5&&batsman3>batsman6) {
			System.out.println(batsman4+" is highest score");
		}
		else if(batsman4>batsman1&&batsman4>batsman2&&batsman4>batsman3&&batsman4>batsman5&&batsman4>batsman6) {
			System.out.println(batsman5+" is highest score");
		}
		else {
			System.out.println(batsman6+" is highest score");
		
		}
		
	}

}
