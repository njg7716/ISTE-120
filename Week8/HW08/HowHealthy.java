/*
Nicholas Graca
ISTE-120
HW8
*/
import java.util.Scanner;
public class HowHealthy{
   public static void main(String[] args){
      Healthy person = new Healthy();
      boolean cont = true;
      Scanner reader;
      while (cont){
         //Ask user for name and validate
         while(true){
            reader = new Scanner(System.in);
            System.out.print("Person's Name: ");
            String name = reader.nextLine();
            if(person.setName(name)){
               break;
            }
         }
         //Ask user for gender and validate
         while(true){
            System.out.print(person.getName() + ", are you male or female (M/F): ");
            String gender = reader.nextLine().toUpperCase();
            if(person.setGender(gender)){
               break;
            }
         }
         //ask user for weight and validate
         while(true){
            System.out.print(person.getName() + "'s weight (pounds): ");
            int weight = reader.nextInt();
            if(person.setWeight(weight)){
               break;
            }
         }
         //ask user for height and validate
         while(true){
            System.out.print(person.getName() + "'s height (inches): ");
            int height = reader.nextInt();
            if(person.setHeight(height)){
               break;
            }
         }
         //ask user for age and validate
         while(true){
            System.out.print(person.getName() + "'s age (years): ");
            int age = reader.nextInt();
            if(person.setAge(age)){
               break;
            }
         }
         //Ask user for activity level and validate
         while(true){
            System.out.println();
            System.out.println("\nActivity Level: Use these categories:");
            System.out.println("\t1 - Sedentary (little or no exercise, desk job)");
            System.out.println("\t2 - Slighlty active (light exercise/sports 1-3 days/wk)");
            System.out.println("\t3 - Moderately active (moderate exercise/sports 3-5 days/wk)");
            System.out.println("\t4 - Very active (hard exercise/sports 6-7 days/wk)");
            System.out.println("\t5 - Extra active (hard daily exercise/sports & physical job or 2 *day training, i.e. marathon, contest etc.)");
            System.out.print("How active are you? ");
            int active = reader.nextInt();
            if(person.setActivity(active)){
               break;
            }
         }
         //Using info make a new person and print their information
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
         while (true){
            System.out.println();
            System.out.print("Would you like to continue(Yes or No)? ");
            Scanner r = new Scanner(System.in);
            String maybe = r.nextLine().toUpperCase();
            if (maybe.substring(0,1).equals("Y")){
               break;
            }
            else{
               System.out.println("Have a good day");
               cont = false;
               break;
            }
         }
      }
   }

}