package oops2test;

public class UseChemistryTeacher {
	public static void main(String[] args) {
		String[] a=args[0].split(",");
		String designation=a[0];
		String collegeName=a[1];
		String work=a[2];
		String subject=a[3];
		ChemistryTeacher ct=new ChemistryTeacher();
		ct.setDesignation(designation);
		ct.setCollegeName(collegeName);
		System.out.println(ct.getDesignation());
		System.out.println(ct.getCollegeName());
		System.out.println(ct.does(work));
		System.out.println(ct.mainSubject(subject));
		
		
		
	}

}
