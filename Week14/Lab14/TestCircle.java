/**
 * ISTE-120 Lab 14
 * TestCircle.java 
 * @author     T.J. Borrelli
 * Updated by JKang & JLeone
 */
public class TestCircle {
   public static void main(String [] args) {
     // read a radius of the circle from command line
     double radius = 0.0;
     try{
         radius = Double.parseDouble(args[0]);
      }
      catch (NumberFormatException nfe){
         System.out.println("Number Format Exception occurred...");
         System.exit(1);
      }
      
   
     
      try{
         // Instantiate a Circle object
         Circle aCircle = new Circle(radius);
         // Print current status of the circle
         System.out.println(aCircle);
      }
      catch (ShapeException shapeExcept){
         System.out.println(shapeExcept);
      }
      
   }
}