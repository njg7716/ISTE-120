import java.awt.*;

public class Lab01Ex4 {
   public static void main(String[] args) {
      Canvas canvas = new Canvas("Lab01Ex4 - Nicholas Graca", 500, 500);
      
      //Wheels
      Circle circle1 = new Circle(10,300,30,true);
      Circle circle2 = new Circle(75,300,30,true);
      Circle circle3 = new Circle(240,300,30,true);
      Circle circle4 = new Circle(305,300,30,true);
      Circle circle5 = new Circle(420,300,30,true);
      canvas.draw(circle1);
      canvas.draw(circle2);
      canvas.draw(circle3);
      canvas.draw(circle4);
      canvas.draw(circle5);   
      
      //Container
      Rectangle rec1 = new Rectangle(10,190,360,100,Color.BLUE,true);
      Rectangle rec2 = new Rectangle(10,290,120,10,Color.RED,true);
      Rectangle rec3 = new Rectangle(250,290,150,10,Color.RED,true);
      canvas.draw(rec1);
      canvas.draw(rec2);
      canvas.draw(rec3);
      
      //Cab
      Rectangle rec4 = new Rectangle(380,250,100,50,Color.RED,true);
      Rectangle rec5 = new Rectangle(380,200,60,50,Color.RED,true);
      Rectangle rec6 = new Rectangle(387,205,45,40,Color.BLUE,true);
      canvas.draw(rec4);
      canvas.draw(rec5);
      canvas.draw(rec6);
      
      //Words
      DrawableString string = new DrawableString("Ajax Supplies",160,250);
      canvas.draw(string);
      }
}