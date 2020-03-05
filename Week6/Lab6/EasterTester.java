import java.util.Scanner;

public class EasterTester{
   public static void main(String[] args){
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter the year: ");
      int y = reader.nextInt();
      Easter e = new Easter(y);
      System.out.println("Month:" + e.getEasterSundayMonth());
      System.out.println("Day: " + e.getEasterSundayDay());
   }
}