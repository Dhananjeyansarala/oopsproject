package oops2test;

public class UseDivisible {
	public static void main(String[] args) {
		int numberOne=2;
		int numberTwo=3;
		int numberThree=6;
		int numberFour=8;
		int numberFive=10;
		Divisible d=new Divisible();
		d.findTwoOrThreeDivisible(numberOne,numberTwo);
		d.findTwoOrThreeDivisible(numberThree, numberFour,numberFive);
	}

}
