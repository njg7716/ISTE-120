import java.util.Scanner;


public class Report3{
   
   public static void main(String[] args){
      System.out.println("Student 1: ");
      Student s1 = newStudent();
      System.out.println("Student 2: ");
      Student s2 = newStudent();
      System.out.println("Student 3: ");
      Student s3 = newStudent();
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
   }

   public static Student newStudent(){
      Scanner reader = new Scanner(System.in);
      System.out.print("   Name: ");
      String n = reader.nextLine();
      System.out.print("   ID: ");
      int i = reader.nextInt();
      System.out.print("   Grade1: ");
      int g1 = reader.nextInt();
      System.out.print("   Grade2: ");
      int g2 = reader.nextInt();
      System.out.print("   Grade3: ");
      int g3 = reader.nextInt();
      Student s = new Student(n, i);
      s.addGrade(g1);
      s.addGrade(g2);
      s.addGrade(g3);   
      return s;
   }
}