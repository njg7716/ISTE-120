/*
Nicholas Graca
ISTE-120
Lab8
*/
import java.util.Scanner;
public class ComputeGpa{
    public static void main(String[] args) {
        Gpa gpa = new Gpa();
        Scanner reader;
        int courses = 0;
        char l = ' ';        
        while(true){
            System.out.print("Enter number of courses: ");
            reader  = new Scanner(System.in);
            courses = reader.nextInt();
            if (courses > 0){
                break;
            }
            System.out.println("Invalid number of courses - must be greater than 0");
        }
        for (int i = 0; i < courses; i++){
            while (true){
                System.out.print("Enter grade (one character): ");
                reader  = new Scanner(System.in);
                String temp = reader.nextLine();
                l = temp.charAt(0);
                if(temp.length() > 1){
                    System.out.println("Invalid grade - must enter exactly one letter");
                    continue;
                }
                
                else if (gpa.calcPoints(l) == -1){
                    System.out.println("Invalid grade - must enter A,B,C,D,F (UPPER or lower case)");
                    continue;
                }
                break;
            }
            while (true){
                System.out.print("Enter credits: ");
                int num = reader.nextInt();
                if (num > 9 || num < 0){
                    System.out.println("Invalid credits - must be between 0 and 9, inclusively");
                    continue;
                }
                gpa.addToTotals(l, num);
                break;
            }
        }
        System.out.println();
        System.out.printf("GPA: %.2f", gpa.calcGpa());
    }
}