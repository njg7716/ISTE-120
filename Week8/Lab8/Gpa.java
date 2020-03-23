/*
Nicholas Graca
ISTE-120
Lab8
*/
public class Gpa {
    private int sumCredits;
    private int sumWeightedPoints;

    public Gpa(){

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

    public int getSumCredits(){
        return sumCredits;
    }
    public int getSumWeightedPoints(){
        return sumWeightedPoints;
    }
    public void addToTotals(char c, int credits){
        sumCredits += credits;
        sumWeightedPoints += calcPoints(c)*credits;
    }
    public double calcGpa(){
      if(sumWeightedPoints == 0 || sumCredits == 0){
         return 0.0;
      }
      double d = (double)sumWeightedPoints/(double)sumCredits;
      return d;
    }

}