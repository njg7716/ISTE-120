/*
Nicholas Graca
ISTE-120
Lab9
*/
public class Gpa {
    private int[] credits;
    private char[] grades;
    private int numCourses;
    private int maxCourses;
    
    public Gpa(){

    }
    public Gpa(int max){
        maxCourses = max;
        numCourses = 0;
        credits = new int[max];
        grades = new char[max];
    }
    
    public int calcPoints(char letter){
        letter = Character.toUpperCase(letter);
        switch (letter){
            case 'A':
                return 4;
            case 'B':
                return 3;
            case 'C':
                return 2;
            case 'D':
                return 1;
            case 'F':
                return 0;
            default:
                return -1;
        }
    }
    public void addCourse(int credit, char grade){
      if(credit < 10 || credit > -1){
         credits[numCourses] = credit;
         if(calcPoints(grade) == -1){
            System.out.println("Enter a valid letter next time. (A, B, C, D or F)");
            System.exit(1);
         }
         grades[numCourses] = grade;
         numCourses +=1;
      }
      else{
         System.out.println("Enter a number between 0 and 9 (inclusive).");
         System.exit(1);
      }
    }
    public int getSumCredits(){
        int sum = 0;
        for(int i = 0; i < numCourses; i++){
            sum += credits[i];
        }
        return sum;
    }
    public int getSumWeightedPoints(){
        int sum = 0;
        int num;
        for(int i = 0; i < numCourses; i++){
            num = calcPoints(grades[i]);
            sum += num * credits[i];
        }
        return sum;
    }
    public double calcGpa(){
      if(getSumWeightedPoints() == 0 || getSumCredits() == 0){
         return 0.0;
      }
      double d = (double)getSumWeightedPoints()/(double)getSumCredits();
      return d;
    }

}