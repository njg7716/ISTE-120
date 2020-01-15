import java.awt.*;

public class FirstDrawing {
   public static void main(String[] args) {
      FirstDrawing fd = new FirstDrawing();
   }
   
   public FirstDrawing() {
      Canvas canvas = new Canvas("FirstDrawing", 400,400);
      Rectangle rec1 = new Rectangle(30, 40, 100, 200, Color.BLUE);
      System.out.println("Rectangle: " + rec1);
      canvas.draw(rec1);
   }
}