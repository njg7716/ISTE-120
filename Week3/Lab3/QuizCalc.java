
public class QuizCalc{
   private String name;
   private int numQuiz;
   private double sum;
   
   public QuizCalc(String n){
      name = n;
      numQuiz = 0;
      sum = 0;
   }
   public void addScore(double newScore){
      sum += newScore;
      numQuiz += 1;
   }
   public double getAverage(){
      return sum/numQuiz;
   }
   public String toString(){
      return name + " quiz average: " + String.format("%6.2f", getAverage());
   }
   public static void main(String[] args){
      QuizCalc owen = new QuizCalc("Owen");
      owen.addScore(72);
      owen.addScore(87);
      owen.addScore(69);
      QuizCalc logan = new QuizCalc("Logan");
      logan.addScore(95);
      logan.addScore(98);
      logan.addScore(69);
      System.out.println(owen);
      System.out.println(logan);
   }
}