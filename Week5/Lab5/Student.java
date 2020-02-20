public class Student{
   private String name;
   private int id;
   private int sumGrades;
   private int numGrades;

   public Student(String n, int i){
      name = n;
      id = i;
      sumGrades = 0;
      numGrades = 0;
   }
   
   public void addGrade(int newGrade){
      sumGrades += newGrade;
      numGrades += 1;
   }
   public double getAverage(){
      return (double)sumGrades/(double)numGrades;
   }
   public String toString(){
      String s = String.format("%1$-10.10s %2$5d %3$7.2f", name, id, getAverage());
      return s;
   }

}