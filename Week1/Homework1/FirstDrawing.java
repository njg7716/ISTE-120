import java.awt.*;

public class FirstDrawing {
   public static void main(String[] args) {
      FirstDrawing fd = new FirstDrawing();
   }
   
   public FirstDrawing() {
      Canvas canvas = new Canvas("House", 400,400);
      Rectangle rec1 = new Rectangle(0,0,200,200, Color.RED, false);
      canvas.draw(rec1);
   }
}