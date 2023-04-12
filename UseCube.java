package oops2test;

public class UseCube {
	public static void main(String[] args) {
		int val1=Integer.parseInt(args[0]);
		int val2=Integer.parseInt(args[1]);
		int val3=Integer.parseInt(args[2]);
		int val4=Integer.parseInt(args[3]);
		int val5=Integer.parseInt(args[4]);
		int val6=Integer.parseInt(args[5]);
		int val7=Integer.parseInt(args[6]);
		int val8=Integer.parseInt(args[7]);
		int val9=Integer.parseInt(args[8]);
		CubeThree c=new CubeThree();
		c.cubeOperation(val7, val8, val9);
		c.cubeOperation(val4, val5, val6);
		c.cubeOperation(val1, val2, val3);
		

	}

}
