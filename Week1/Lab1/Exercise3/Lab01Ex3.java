import java.awt.*;

public class Lab01Ex3 {
   public static void main(String[] args) {
      Canvas canvas = new Canvas("Lab01Ex3 - Nicholas Graca", 500, 500);
      Circle circle = new Circle(20,60,30, Color.BLUE, true);
      //circle.setXInt(circle.getXInt()+150);
      //circle.setYInt(circle.getYInt()+200);
      //circle.setXInt(circle.getXInt()-10);
      //circle.setYInt(circle.getYInt()-13);
      System.out.println("My Circle:" + circle);
      canvas.draw(circle);
   }
}