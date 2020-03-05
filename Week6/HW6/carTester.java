/*
Name: Nicholas graca
Course: ISTE-120
HW: #6
*/
import java.util.Scanner;


public class carTester{
   
   public static void main(String [] args){
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter the car's Year, Make and Model: ");
      String s = reader.nextLine();
      String[] words = s.split(" ");
      String y = words[0];
      String ma = words[1];
      String mo = words[2];
      newCar c1 = new newCar(y,ma,mo);
      System.out.print("Enter the car's Sticker Price: ");
      double sp = reader.nextDouble();
      System.out.print("Enter the car's Discount: ");
      double dis = reader.nextDouble();
      System.out.print("Enter the car's Sales Tax Rate: ");
      double st = reader.nextDouble();
      System.out.print("Enter the Number of Months at Zero Percent Interest: ");
      int n = reader.nextInt();
      c1.setStickerPrice(sp);
      c1.setDiscount(dis);
      c1.setSalesTax(st);
      System.out.println(c1.toString());
      System.out.println();
      System.out.printf("Final Price: %.2f\n", c1.calcFinalPrice(sp, dis, st));
      System.out.printf("Monthly Payment at zero percent: %.2f\n", c1.calcZeroPctMonPayt(n));
      
   }
}