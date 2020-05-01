public class TestCarTravelCost{
   public static void main(String[] args){
      if(args.length < 3 || args.length > 4){
         System.out.println("ERROR: Invalid number of command line arguments.");
         System.exit(1);
      }
      CarTravelCost test = new CarTravelCost(Integer.parseInt(args[0]), Double.parseDouble(args[1]), args[2]);
      System.out.println(test);
   }
}