/*
Nicholas Graca
ISTE-120
HW7
*/
public class Healthy{
   private String name;
   private String gender;
   private double weight;
   private double height;
   private int age;
   private int activity;
   
   public Healthy(String n, String g, double w, double h, int a, int act){
      name = n;
      gender = g;
      weight = w;
      height = h;
      age = a;
      activity = act;
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
   public void setName(String n){
      name = n;
   }
   //sets gender to given value
   public void setGender(String g){
      gender = g;
   }
   //sets weight to given number
   public void setWeight(double w){
      weight = w;
   }
   //set height to given number
   public void setHeight(double h){
      height = h;
   }
   //sets age to given int
   public void setAge(int a){
      age = a;
   }
   //set activity level to given int
   public void setActivity(int a){
      activity = a;
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