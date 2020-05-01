public class TestTrainTravelCost{
   public static void main(String[] args){
      if(args.length != 5){
         System.out.println("ERROR: Invalid number of command line arguments.");
         System.exit(1);
      }
      CarTravelCost test = new CarTravelCost(Integer.parseInt(args[0]), Double.parseDouble(args[1]), args[2]);
      System.out.println(test);
      TrainTravelCost test2 = new TrainTravelCost(Double.parseDouble(args[3]), Double.parseDouble(args[4]), args[2]);
      System.out.println(test2);
   }
}