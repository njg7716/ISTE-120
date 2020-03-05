/*
Nicholas Graca
ISTE-120
HW7
*/
import java.util.Scanner;
public class HowHealthy{
   public static void main(String[] args){
      Scanner reader = new Scanner(System.in);
      //Ask user for name and validate
      System.out.print("Person's Name: ");
      String name = reader.nextLine();
      if (name.length() < 1){
         System.out.println("Name must be at least a character.");
         System.exit(0);
      }
      //Ask user for gender and validate
      System.out.print(name + ", are you male or female (M/F): ");
      String gender = reader.nextLine().toUpperCase();
      if (gender.length() > 1){
         System.out.println("Gender must be M or F.");
         System.exit(0);
      }
      if (!gender.equals("M") && !gender.equals("F")){
         System.out.println("Gender must be M or F.");
         System.exit(0);
      }
      //ask user for weight and validate
      System.out.print(name + "'s weight (pounds): ");
      int weight = reader.nextInt();
      if (weight < 100){
         System.out.println("Invalid weight - must be at least 100 pounds.");
         System.exit(0);
      }
      //ask user for height and validate
      System.out.print(name + "'s height (inches): ");
      int height = reader.nextInt();
      if (height < 60 || height > 84){
         System.out.println("Invalid height - must be 60..84, inclusively.");
         System.exit(0);
      }
      //ask user for age and validate
      System.out.print(name + "'s age (years): ");
      int age = reader.nextInt();
      if (age < 18 ){
         System.out.println("Invalid age - must be at least 18.");
         System.exit(0);
      }
      //Ask user for activity level and validate
      System.out.println();
      System.out.println("\nActivity Level: Use these categories:");
      System.out.println("\t1 - Sedentary (little or no exercise, desk job)");
      System.out.println("\t2 - Slighlty active (light exercise/sports 1-3 days/wk)");
      System.out.println("\t3 - Moderately active (moderate exercise/sports 3-5 days/wk)");
      System.out.println("\t4 - Very active (hard exercise/sports 6-7 days/wk)");
      System.out.println("\t5 - Extra active (hard daily exercise/sports & physical job or 2 *day training, i.e. marathon, contest etc.)");
      System.out.print("How active are you? ");
      int active = reader.nextInt();
      if (active > 6 || active < 0 ){
         System.out.println("Must be a value between 1 and 5 (inclusive).");
         System.exit(0);
      }
      //Using info make a new person and print their information
      Healthy person = new Healthy(name, gender, weight, height, age, active);
      System.out.println(person.getName() + "'s information");
      System.out.println("Weight: " + person.getWeight() + " pounds");
      System.out.println("Height: " + person.getHeight() + " inches");
      System.out.println("Age: " + person.getAge() + " years");
      //Check gender and prin the appopriate sentence
      if (person.getGender().equals("F")){
         System.out.println("These are for a female.");      
      }
      if (person.getGender().equals("M")){
         System.out.println("These are for a male.");      
      }
      //Print users BMI, BMR, TDEE and weight classification
      System.out.printf("\nBMR is %.2f\n", person.calcBMR());
      System.out.printf("BMI is %.2f\n", person.calcBMI());
      System.out.printf("TDEE is %.2f\n", person.calcTDEE());
      System.out.println("Your BMI classifies you as " + person.weightClass());
   }

}