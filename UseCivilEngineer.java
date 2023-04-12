package oops2test;

public class UseCivilEngineer {
	public static void main(String[] args) {
		String[] a=args[0].split(",");
		String designation=a[0];
		String workingSector=a[1];
		int salary=Integer.parseInt(a[2]);
		String work=a[3];
		CivilEngineer c=new CivilEngineer();
		c.setDesignation(designation);
		c.setWorkingSector(workingSector);
		
		System.out.println(c.getDesignation());
		System.out.println(c.getWorkingSector());
		System.out.println(c.showSalary(salary));
		System.out.println(c.typeOfWork(work));
		
	}

}
