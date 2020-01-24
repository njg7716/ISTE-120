import java.util.*;

public class TestPicture2{
   public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      Picture2 p = new Picture2();
      p.draw();
      System.out.println("Press Enter to continue:");
      in.nextLine();
      p.setNewColors();
      System.out.println("Press Enter to continue:");
      in.nextLine();
      p.setOrigColors();
   }
}