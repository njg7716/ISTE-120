import java.awt.*;
/*
Author: Nicholas Graca
Class: ISTE 120-1
Assignment: HW01
*/


public class HW01 {
   public static void main(String[] args) {
      Canvas canvas = new Canvas("Tree", 500,500);
      Circle c = new Circle(230, 30, 20, Color.RED, true);
      Triangle t1 = new Triangle(200,70,100,50, Color.GREEN, true);
      Triangle t2 = new Triangle(190,124,120,70, Color.GREEN, true);
      Triangle t3 = new Triangle(180,195,140,90, Color.GREEN, true);
      Rectangle rec1 = new Rectangle(230,285,40,40, Color.MAGENTA, true);
      Rectangle rec2 = new Rectangle(220,325,60,60, Color.BLACK, true);
      canvas.draw(rec1);
      canvas.draw(rec2);
      canvas.draw(c);
      canvas.draw(t1);
      canvas.draw(t2);
      canvas.draw(t3);
   }
}