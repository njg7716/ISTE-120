
public class TestCalc1 {
   private double accumulator;
   
   public TestCalc1() {
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
         System.out.println("ATTEMPT TO DIVIDE BY ZERO - IGNORED");
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
      TestCalc1 myCalc = new TestCalc1();
      double popNYS = 19378102;
      double areaNYS = 54555;
      myCalc.add(popNYS);
      myCalc.div(areaNYS);
      System.out.println("Amount of people per square mile in NYS: " + myCalc.getAccum());
      myCalc.div(0);
      myCalc.clear();
      myCalc.add(22);
      myCalc.div(7);
      System.out.println("Value of pi is: " + myCalc.getAccum());
      myCalc.clear();
      myCalc.add(5);
      myCalc.mult(0);
      System.out.println("5*0=" + myCalc.getAccum());
   }
}  