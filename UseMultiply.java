package oops2test;

public class UseMultiply {
	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		int num3=30;
		int num4=40;
		int num5=50;
		Multiply m=new Multiply();
		System.out.println(m.findProduct(num1, num2)+" "+m.findProduct(num3,num4,num5));
		
	}

}
