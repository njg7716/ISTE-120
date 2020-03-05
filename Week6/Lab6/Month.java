public class Month{
   private int num;
   
   public Month(int m){
      num = m-1;
   }
   
   public String getName(){
      String months = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
      int amount = num *9;
      String month = months.substring(amount, amount+9);
      return month;
      
   }
}