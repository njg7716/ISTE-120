public class Easter{
   private int year;
   public Easter(int y){
      year = y;
   }
   public String getEasterSundayMonth(){
      int a = year%19;
      int b = year / 100;
      int c = year % 100;
      int d = b / 4;
      int e = b % 4;
      int g = (8 * b +13)/ 25;
      int h = (19 * a + b - d - g + 15) %30;
      int j = c / 4;
      int k = c % 4;
      int m = (a + 11 * h) / 319;
      int r = (2 * e + 2 * j - k - h + m + 32) % 7;
      int n = (h - m + r + 90) / 25;
      return Integer.toString(n);
   }
   public String getEasterSundayDay(){
      int a = year%19;
      int b = year / 100;
      int c = year % 100;
      int d = b / 4;
      int e = b % 4;
      int g = (8 * b +13)/ 25;
      int h = (19 * a + b - d - g + 15) %30;
      int j = c / 4;
      int k = c % 4;
      int m = (a + 11 * h) / 319;
      int r = (2 * e + 2 * j - k - h + m + 32) % 7;
      int n = (h - m + r + 90) / 25;
      int p = (h - m + r + n + 19) % 32;
      return Integer.toString(p);
   }
}