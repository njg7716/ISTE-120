/*
Nicholas Graca
ISTE-120
Lab9
*/

import java.util.Scanner;

public class Exercise1
{
    public static int letterToNumeric(char letter){
        letter = Character.toUpperCase(letter);
        switch (letter){
            case 'A':
                return 4;
            case 'B':
                return 3;
            case 'C':
                return 2;
            case 'D':
                return 1;
            case 'F':
                return 0;
            default:
                return -1;
        }
    }

	public static void main (String[] args)
	{
		//declarations
		Scanner in = new Scanner(System.in); //input object
		int credits;		//number of credits for a course
		String grade;		//grade for course
		
		
		//read in number of courses
		
		//create Gpa object to hold specified number of courses
      double totCreds = 0;
      double totPoints = 0;
		//read in all courses and add course information to Gpa object
		for (int k=0; k<4; k++)
		{
			System.out.print("Enter credits for course " + (k+1) + ": ");
			credits = in.nextInt();
         totCreds += credits;
			System.out.print("Enter grade for course " + (k+1) + ": ");
			grade = in.next();
         totPoints += letterToNumeric(grade.charAt(0)) * credits;
		}
		
		//print results
		System.out.println();
      System.out.printf("Total number of credits: %.0f\n", totCreds); 
      System.out.printf("Total number of points: %.0f\n", totPoints);
		System.out.printf("GPA is %4.2f%n", totPoints/totCreds); 

	} //end main
}