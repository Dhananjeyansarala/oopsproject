package oops2test;

public class UseWeekDay {
	public static void main(String[] args) {
		String day1=args[0];
		String day2=args[1];
		int month=Integer.parseInt(args[2]);
		WeekDay d=new WeekDay();
		d.findDay(day1);
		d.findDay(day2,month);
	}

}
