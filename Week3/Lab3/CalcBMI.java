
public class CalcBMI{
   private double accumulator;
   
   public CalcBMI() {
      accumulator = 0;
   }
   
   public double getAccum(){
      return accumulator;
   }
   
   public void add(double num){
      accumulator += num;
   }
   
   public void sub(double num){
      accumulator -= num;
   }
   
   public void mult(double num){
      accumulator = accumulator*num;
   }
   
   public void div(double num){
      if (num == 0 ){
         System.out.println("ATTEMPT TO DEVIDE BY ZERO - IGNORED");
      }
      else{
         accumulator = accumulator/num;
      }
   }
   
   public void clear() {
      accumulator = 0;
   }
   
   public String toString(){
      return "Accumulator: " + accumulator;
   }
   public static void main(String[] args){
      CalcBMI numerator = new CalcBMI();
      double weight = 190;
      numerator.add(weight);
      numerator.mult(703);
      CalcBMI denominator = new CalcBMI();
      double height = 72;
      denominator.add(height);
      denominator.mult(denominator.getAccum());
      numerator.div(denominator.getAccum());
      System.out.println("Your BMI is: " + numerator.getAccum());
   }
}