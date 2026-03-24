package application;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		student.name = sc.nextLine();
		
		System.out.print("Enter firt quarter grade (0–30): ");
		student.firstQuarterGrade = sc.nextDouble();
		while (student.firstQuarterGrade < 0 || student.firstQuarterGrade > 30) {
			System.out.print("Invalid grade. Please enter a value between 0 and 30: ");
			student.firstQuarterGrade = sc.nextDouble();
		}
		
		System.out.print("Enter second quarter grade (0–35): ");
		student.secondQuarterGrade = sc.nextDouble();
		while (student.secondQuarterGrade < 0 || student.secondQuarterGrade > 35) {
			System.out.print("Invalid grade. Please enter a value between 0 and 35: ");
			student.secondQuarterGrade = sc.nextDouble();
		}
		
		System.out.print("Enter third quarter grade (0–35): ");
		student.thirdQuarterGrade = sc.nextDouble();
		while (student.thirdQuarterGrade < 0 || student.thirdQuarterGrade > 35) {
			System.out.print("Invalid grade. Please enter a value between 0 and 35: ");
			student.thirdQuarterGrade = sc.nextDouble();
		}
		

		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());

		if (student.isApproved()) {
		    System.out.println("PASS");
		} else {
		    System.out.println("FAILED");
		    System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		}
		
		sc.close();
	}

}
