package entities;

public class Student {

	public String name;
	public double firstQuarterGrade;
	public double secondQuarterGrade;
	public double thirdQuarterGrade;
	
	public double finalGrade() {
	    return firstQuarterGrade + secondQuarterGrade + thirdQuarterGrade;
	}

	public boolean isApproved() {
	    return finalGrade() >= 60.0;
	}

	public double missingPoints() {
	    return 60.0 - finalGrade();
	}

}
