import java.awt.*;

public class Arrow{
   private Canvas canvas;
   private Triangle head;
   private Rectangle shaft;
   
   public Arrow(Canvas canvas){
      this.canvas = canvas;
      head = new Triangle(125, 525, 50, 50, Color.RED, false);
      shaft = new Rectangle(145, 575, 10, 100, Color.BLUE, false);
   }
   
   public void draw(){
      canvas.draw(head);
      canvas.draw(shaft);
   }
   public void erase(){
      canvas.erase(head);
      canvas.erase(shaft);
   }
   public void moveUp(){
      head.setYInt(head.getYInt()-50);
      shaft.setYInt(shaft.getYInt()-50);
   }
}

class Controller{
   
   public static void main(String[] args)throws Exception{
      new Controller();
   }
   public Controller() throws Exception {
      Canvas canvas = new Canvas("Arrow", 300, 700);
      Arrow arrow = new Arrow(canvas);
      arrow.draw();
      Thread.currentThread().sleep(100);
      arrow.erase();
      arrow.moveUp();
      arrow.draw();
      Thread.currentThread().sleep(100);
      arrow.erase();
      arrow.moveUp();
      arrow.draw();
      Thread.currentThread().sleep(100);
      arrow.erase();
      arrow.moveUp();
      arrow.draw();
      Thread.currentThread().sleep(100);
      arrow.erase();
      arrow.moveUp();
      arrow.draw();
      Thread.currentThread().sleep(100);
      arrow.erase();
      arrow.moveUp();
      arrow.draw();
      Thread.currentThread().sleep(100);
      arrow.erase();
      arrow.moveUp();
      arrow.draw();
      Thread.currentThread().sleep(100);
      arrow.erase();
      arrow.moveUp();
      arrow.draw();
      Thread.currentThread().sleep(100);
      arrow.erase();
      arrow.moveUp();
      arrow.draw();
      Thread.currentThread().sleep(100);
      arrow.erase();
      arrow.moveUp();
      arrow.draw();
      Thread.currentThread().sleep(100);
      arrow.erase();
      arrow.moveUp();
      arrow.draw();
      Thread.currentThread().sleep(100);
      arrow.erase();
      arrow.moveUp();
      arrow.draw();
   }

}