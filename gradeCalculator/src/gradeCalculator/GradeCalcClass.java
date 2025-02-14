package gradeCalculator;

import java.util.Scanner;

public class GradeCalcClass {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double grade;
	
	System.out.println("Please input grade here: ");
	grade = input.nextDouble();
	
	
	
	System.out.println(math(grade));
	
	input.close();
	}


	private static String math (double grade) {
		String letterGrade = "Not recognized";
		
		if (grade >= 92) {
			letterGrade = "A";
			
		}
		else if (grade < 92 && grade >= 89) { // variable needs to be at the start && means AND
			letterGrade = "A-";
			
		}  
		else if (grade < 89 && grade >= 87) {
			letterGrade = "B+";
		}
		else if (grade < 87 && grade >= 82) {
			letterGrade = "B";
		}
		else if (grade < 82 && grade >= 79) {
			letterGrade = "B-";
		}
		else if (grade < 79 && grade >= 77) {
			letterGrade = "C+";
		}
		else if (grade < 77 && grade >= 72) {
			letterGrade = "C";
		}
		else if (grade < 72 && grade >= 69) {
			letterGrade = "C-";
		}
		else if (grade < 69 && grade >= 67) {
			letterGrade = "D+";
		}
		else if (grade < 67 && grade >= 60) {
			letterGrade = "D";
		}
		else if (grade < 60) {
			letterGrade = "F";
		}
						return "Your grade is " + letterGrade;
			
	} 
} 