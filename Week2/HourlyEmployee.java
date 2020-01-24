public class HourlyEmployee{
   private String lastName;
   private String firstName;
   private int hoursWorkedLastWeek;
   private int hourWorkedYTD;
   private double hourlyRate;
   
   public String getLastName(){return lastName;}
   public String getFirstName(){return firstName;}
   public int gethoursWorkedLastWeek(){return hoursWorkedLastWeek;}
   public double getWeeklyPay(){return hoursWorkedLastWeek*hourlyRate;}
   public int getHoursWorkedYTD(){return hoursWorkedYTD;}
   public double getYTDPay(){return hoursWorkedYTD*hourlyRate;}
   public double getHurlyRate(){return hourlyRate;}
   public String toString(){
      return "First Name: " + firstName + "\nLast Name: " + lastName + "\nHours Worked Last Week: " + hoursWorkedLastWeek +
      "\nHours Worked YTD: " + hourWorkedYTD + "\nHourly Rate: " + hourlyRate + "\nWeekly Pay: " + getWeeklyPay() +
      "\nYTD Pay: " + getYTDPay();
   }
   
   public printCheck(){
      System.out.println("Pay to the order of: " + firstName + lastName + "\nAmount: " + hoursWorkedLastWeek*hourlyRate);
   }
   
   public HourlyEmployee(String fN, String lN, double hR){
      firstName = fN;
      lastName = lN;
      hourlyRate = hR;
   }
   
}