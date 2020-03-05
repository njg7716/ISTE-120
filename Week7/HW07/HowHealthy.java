import java.util.Scanner;
public class HowHealthy{
   public static void main(String[] args){
      Scanner reader = new Scanner(System.in);
      System.out.print("Person's Name: ");
      String name = reader.nextLine();
      if (name.length() < 1){
         System.exit(0);
      }
      System.out.print(name + ", are you male or female (M/F): ");
      String gender = reader.nextLine().toUpperCase();
      if (gender.length() > 1){
         System.exit(0);
      }
      if (!gender.equals("M") && !gender.equals("F")){
         System.exit(0);
      }
      System.out.print(name + "'s weight (pounds): ");
      int weight = reader.nextInt();
      if (weight < 100){
         System.exit(0);
      }
      System.out.print(name + "'s height (inches): ");
      int height = reader.nextInt();
      if (height < 60 || height > 84){
         System.exit(0);
      }
      System.out.print(name + "'s age (years): ");
      int age = reader.nextInt();
      if (age < 18 ){
         System.exit(0);
      }
      System.out.println();
      double bmi = (weight/(height*height))*703;
      System.out.println(name + "'s information");
      System.out.println("Weight: " + weight + " pounds");
      System.out.println("Height: " + height + " inches");
      System.out.println("Age: " + age + " years");
      if (gender.equals("F")){
         System.out.println("These are for a female.");      
      }
      if (gender.equals("M")){
         System.out.println("These are for a male.");      
      }
   }

}