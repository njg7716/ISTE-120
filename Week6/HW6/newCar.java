/*
Name: Nicholas graca
Course: ISTE-120
HW: #6
*/
public class newCar{

   private String year;
   private String make;
   private String model;
   private String desc;
   private String abbv;
   private double sticker_price;
   private double discount;
   private double sales_tax;
   
   public newCar(String y, String ma, String mo){
      year = y;
      make = ma;
      model = mo;
      sticker_price = 0;
      discount = 0;
      sales_tax = 0;
      desc = y + " " + make + " " + model;  
      abbv = y.substring(2,4) + ma.substring(0,1) + mo.substring(0,1);
   }
   public double calcFinalPrice(double sticker_price, double discount, double sales_tax){
      double price = (sticker_price - discount) + (sales_tax*.01*(sticker_price-discount));
      return price;
   }
   
   public double calcZeroPctMonPayt(int num){
      double amount = calcFinalPrice(sticker_price, discount, sales_tax)/num;
      return amount;
   }
   
   public String toString(){
      String s = "You want to purchase a \"" + desc + "\" Abbreviation: \"" + abbv + "\"";
      return s;
   }
   
   public void setStickerPrice(double sp){
      sticker_price = sp;
   }
   
   public void setDiscount(double dis){
      discount = dis;
   }
   public void setSalesTax(double st){
      sales_tax = st;
   }

}