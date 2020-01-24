import java.util.*;

public class TestPicture3{
   public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      Picture3 p = new Picture3();
      p.draw();
      System.out.println("Press Enter to continue:");
      in.nextLine();
      p.setNewColors();
      System.out.println("Press Enter to continue:");
      in.nextLine();
      p.setOrigColors();
   }
}