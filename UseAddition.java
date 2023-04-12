package oops2test;

public class UseAddition {
	public static void main(String[] args) {
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int num3=Integer.parseInt(args[2]);
		int num4=Integer.parseInt(args[3]);
		int num5=Integer.parseInt(args[4]);
		Addition a=new Addition();
		System.out.println(a.addOperation(num1,num2));
		System.out.println(a.addOperation(num3, num4,num5));
		
	}

}
