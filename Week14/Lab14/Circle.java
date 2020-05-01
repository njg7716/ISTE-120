/**
 * ISTE-120 Lab 13
 * Circle.java
 * @author     T.J. Borrelli
 * Updated by JKang & JLeone
 */
public class Circle {      // Student Starter code
   private double radius;    // circle radius

   /**
    * Constructor - Create a new circle
    * @param    inRadius  radius of the circle
    */

   public Circle(double inRadius ) throws ShapeException{
      if(inRadius <= 0.0){
         throw new ShapeException("Shape Exception occured...");
      }
      radius = inRadius;
   }

   /**
    * Return the radius of the circle
    * @return    radius of the circle
    */
   public double getRadius() {
      return radius;
   }

   /**
    * set the radius
    * @param newRadius		new radius of the circle
    */
   public void setRadius(double newRadius) throws ShapeException {
      if(newRadius <= 0.0){
         throw new ShapeException("Shape Exception occured...");
      }
   	radius = newRadius;
   }

   /**
    * Compute and return the area of the circle
    * @return    the area of the circle
    */
   public double area() {
      return Math.PI * radius * radius;
   }

   /**
    * Stretches circle size by multiplying
    * the radius by the factor provided.
    * @param    factor    stretch factor
    */
   public void stretchBy(double factor ) throws ShapeException {
      if(factor <= 0.0){
         throw new ShapeException("Shape Exception occured...");
      }
      radius = radius * factor;
   }

   /**
    * Return a string representation of a circle.
    * @return    a string representing this circle
    */
   public String toString() {
     // implement body here
     return String.format("Circle: %.1f%n", radius);
   }
}