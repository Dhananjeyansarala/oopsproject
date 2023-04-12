package oops2test;

public class Divisible {
	public void findTwoOrThreeDivisible(int numberOne,int numberTwo) {
		int add=numberOne+numberTwo;
		if(add%2==0&&add%3==0==true) {
			System.out.println("TwoThreeDivisible");
		}
		else {
			System.out.println("NotDivisible");
		}
	}
	public void findTwoOrThreeDivisible(int numberThree,int numberFour,int numberFive) {
		int add=numberThree+numberFour+numberFive;
		if(add%2==0&&add%3==0==true) {
			System.out.println("TwoThreeDivisible");
		}
		else {
			System.out.println("NotDivisible");
		}
	}

}
