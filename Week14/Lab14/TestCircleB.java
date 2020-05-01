/**
 * ISTE-120 Lab 14
 * TestCircle.java 
 * @author     T.J. Borrelli
 * Updated by JKang & JLeone
 */

import java.util.*;

public class TestCircleB {
   public static void main(String [] args) {
      // read a radius of the circle from command line
      try{
         Scanner in = new Scanner(System.in);
         System.out.print("Enter a circle radius: ");
         double radius = in.nextDouble();
         // Instantiate a Circle object
         Circle aCircle = new Circle(radius);
         // Print current status of the circle
         System.out.println(aCircle);
      }
      catch (ShapeException shapeExcept){
         System.out.println(shapeExcept);
      }
      catch (InputMismatchException ime){
         System.out.println("InputMismatchException occurred...");
         System.exit(1);
      }
      catch (NoSuchElementException noe){
         System.out.println("NoSuchElementException occurred...");
      }
      catch(Exception e ){
         System.out.println("CTRL+C Program stops...");
         System.exit(0);
      }
   }
}