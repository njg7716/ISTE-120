public class TriangleTester{
   public static void main(String[] args){
      Triangle t1 = new Triangle(0,0,4,0,3,3);
      System.out.println("Triangle with Coordinates: " + t1.toString());
      System.out.println("Area: " + t1.calcArea());
      System.out.printf("Perimeter: %2.2f\n", t1.calcPerimeter());
      System.out.printf("Length side a: %2.2f\n", t1.lengthA());
      System.out.printf("Length side b: %2.2f\n", t1.lengthB());
      System.out.printf("Length side c: %2.2f\n", t1.lengthC());
      System.out.printf("Height h: %2.2f\n", t1.getHeight());
      System.out.printf("Angle A: %2.2f\n", t1.angleA());
      System.out.printf("Angle B: %2.2f\n", t1.angleB());
      System.out.printf("Angle C: %2.2f\n", t1.angleC());
   }

}