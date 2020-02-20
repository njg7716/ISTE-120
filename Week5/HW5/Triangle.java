import java.lang.Math; 

public class Triangle{
   private double x1;
   private double y1;
   private double x2;
   private double y2;
   private double x3;
   private double y3;
   
   public Triangle(double a1, double a2, double b1, double b2, double c1, double c2){
      x1 = a1;
      y1 = a2;
      x2 = b1;
      y2 = b2;
      x3 = c1;
      y3 = c2;
   
   }
   
   public double calcArea(){
      double area = .5*lengthC()*getHeight();
      return area;
   }
   public double calcPerimeter(){
      double perm = lengthA() + lengthB() + lengthC();
      return perm;
   }
   public double lengthA(){
      double len = Math.hypot(x3-x2, y3-y2);
      return Math.abs(len);
   }
   public double lengthB(){
      double len = Math.hypot(x3-x1, y3-y1);
      return Math.abs(len);
   
   }
   public double lengthC(){
      double len = Math.hypot(x2-x1, y2-y1);
      return Math.abs(len);
   }
   public double getHeight(){
      double h = y3 - y1;
      return h;
   }
   public double angleA(){
      double a = Math.toDegrees(Math.asin((getHeight()/lengthB())));
      return a;
   }
   public double angleB(){
      double b = Math.toDegrees(Math.asin((getHeight()/lengthA())));
      return b;
   }
   public double angleC(){
      double c = 180 - angleB() - angleA();
      return c; 
   }
   public String toString(){
      return "A (" + x1+ "," + y1 + "), B (" + x2+ "," + y2 + "), V (" + x3+ "," + y3 + ")";
   }
}