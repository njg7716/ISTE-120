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
   public String getName(){
      return name;
   }
   public String getGender(){
      return gender;
   }
   public double getWeight(){
      return weight;
   }
   public double getHeight(){
      return height;
   }
   public int getAge(){
      return age;
   }
   public int getActivity(){
      return activity;
   }
   public void setName(String n){
      name = n;
   }
   public void setGender(String g){
      gender = g;
   }
   public void setWeight(double w){
      weight = w;
   }
   public void setHeight(double h){
      height = h;
   }
   public void setAge(int a){
      age = a;
   }
   public void setActivity(int a){
      activity = a;
   }
   public double calcBMI(){
      return (weight/(height*height))*703;
   }
   public double calcBMR(){
      if (gender.equals("M")){
         return 66 + (13.7 * weight * .454) + (5 * height * 2.54) - (6.8 * age);
      }
      return 655 + (9.6 * weight * .454) + (1.8 * height * 2.54) - (4.7 * age);
   }
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
}