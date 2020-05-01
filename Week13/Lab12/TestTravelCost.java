
import java.util.ArrayList;

public class TestTravelCost{
   public static void main(String[] args){
      if(args.length != 10){
         System.out.println("ERROR: Invalid number of command line arguments.");
         System.exit(1);
      }
      ArrayList<TravelCost> travel = new ArrayList<TravelCost>();
      CarTravelCost test0 = new CarTravelCost(Integer.parseInt(args[0]), Double.parseDouble(args[1]), args[2]);
      TrainTravelCost test1 = new TrainTravelCost(Double.parseDouble(args[3]), Double.parseDouble(args[4]), args[2]);
      AirTravelCost test2 = new AirTravelCost(Integer.parseInt(args[5]), args[6], args[7], args[8], args[9], args[2], Double.parseDouble(args[1]));
      travel.add(test0);
      travel.add(test1);
      travel.add(test2);
      TravelCost cost = travel.get(0);
      TravelCost duration =  travel.get(0);
      for(TravelCost trip : travel){
         System.out.println(trip);
         if(cost.getTotalCost() > trip.getTotalCost()){
            cost = trip;
         }
         if(duration.getDuration() > trip.getDuration()){
            duration = trip;
         }
      }
      System.out.printf("%nLOWEST COST: %s%n", cost);
      System.out.printf("SHORTEST DURATION: %s%n%n", duration);
   }
}