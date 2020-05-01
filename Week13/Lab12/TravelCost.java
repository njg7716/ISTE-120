public interface TravelCost{
   public static final double AGENT_FEE = 10.00;
   
   public abstract double getDuration();
   public abstract double getTotalCost();
   public abstract double getLodgingCost();
   public abstract String getDestination();
   public abstract String toString();
}