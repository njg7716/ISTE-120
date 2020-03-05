import java.util.Scanner;
public class MonthTester{
   public static void main(String[] args){
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter the month number (1 - 12): ");
      int n = reader.nextInt();
      Month m = new Month(n);
      System.out.println("The month is: " + m.getName());
   }
}