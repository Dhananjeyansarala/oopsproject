package oops2test;

public class Teacher {
	private String designation;
	private String collegeName;
	
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	public String getDesignation() {
		return designation;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String does(String work) {
		return work;
	}

}
