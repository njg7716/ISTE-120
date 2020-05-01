/**
 * ISTE-120 Lab 14
 * TestCircle.java 
 * @author     T.J. Borrelli
 * Updated by JKang & JLeone
 */

import java.util.*;

public class TestCircleC {
   public static void main(String [] args) {
      // read a radius of the circle from command line
      while (true){
         try{
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a circle radius: ");
            double radius = in.nextDouble();
            // Instantiate a Circle object
            Circle aCircle = new Circle(radius);
            // Print current status of the circle
            System.out.println(aCircle);
            System.exit(0);
         }
         catch (ShapeException shapeExcept){
            System.out.println(shapeExcept);
         }
         catch (InputMismatchException ime){
            System.out.println("InputMismatchException occurred...");
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
}