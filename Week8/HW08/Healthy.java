/*
Nicholas Graca
ISTE-120
HW8
*/
public class Healthy{
   private String name;
   private String gender;
   private double weight;
   private double height;
   private int age;
   private int activity;
   
   public Healthy(){
      
   }
   //Returns name of person
   public String getName(){
      return name;
   }
   //returns gender of person
   public String getGender(){
      return gender;
   }
   //returns weight of person
   public double getWeight(){
      return weight;
   }
   //returns height of person
   public double getHeight(){
      return height;
   }
   //returns weight of person
   public int getAge(){
      return age;
   }
   //returns activity level of person
   public int getActivity(){
      return activity;
   }
   //Sets name to the string given
   public boolean setName(String n){
      if (n.length() < 1){
         System.out.println("Name must be at least a character.");
         return false;
      }
      name = n;
      return true;
   }
   //sets gender to given value
   public boolean setGender(String g){
      if (g.length() > 1){
         System.out.println("Gender must be M or F.");
         return false;
      }
      if (!g.equals("M") && !g.equals("F")){
         System.out.println("Gender must be M or F.");
         return false;
      }
      gender = g;
      return true;
   }
   //sets weight to given number
   public boolean setWeight(double w){
      if (w < 100){
         System.out.println("Invalid weight - must be at least 100 pounds.");
         return false;
      }
      weight = w;
      return true;
   }
   //set height to given number
   public boolean setHeight(double h){
      if (h < 60 || h > 84){
         System.out.println("Invalid height - must be 60..84, inclusively.");
         return false;
      }
      height = h;
      return true;
   }
   //sets age to given int
   public boolean setAge(int a){
      if (a < 18 ){
         System.out.println("Invalid age - must be at least 18.");
         return false;
      }
      age = a;
      return true;
   }
   //set activity level to given int
   public boolean setActivity(int a){
      if (a > 6 || a < 1 ){
         System.out.println("Must be a value between 1 and 5 (inclusive).");
         return false;
      }
      activity = a;
      return true;
   }
   //returns the persons BMI
   public double calcBMI(){
      return (weight/(height*height))*703;
   }
   //returns the persons BMR
   public double calcBMR(){
      if (gender.equals("M")){
         return 66 + (13.7 * imperialWeight()) + (5 * height * 2.54) - (6.8 * age);
      }
      return 655 + (9.6 * weight * .454) + (1.8 * imperialHeight()) - (4.7 * age);
   }
   //Uses the BMR method and activity value and returns TDEE value
   public double calcTDEE(){
      double mult = 0;
      if (getActivity() == 1){
         mult = 1.2;
      }
      if (getActivity() == 2){
         mult = 1.375;
      }
      if (getActivity() == 3){
         mult = 1.55;
      }
      if (getActivity() == 4){
         mult = 1.725;
      }
      if (getActivity() == 5){
         mult = 1.9;
      }
      return calcBMR() * mult;
   }
   //returns the weight in kilograms
   public double imperialWeight(){
      return weight * .454;
   }
   //returns the height in centimeters
   public double imperialHeight(){
      return height * 2.54;
   }
   //Determines persons weight classification based on BMI
   public String weightClass(){
      String clas = "";
      if (calcBMI() < 18.5){
         clas = "Underweight";
      }
      else if (calcBMI() < 25){
         clas = "Normal weight";
      }
      else if (calcBMI() < 30){
         clas = "Overweight";
      }
      else{
         clas = "Obese";
      }
      return clas;
   }
}