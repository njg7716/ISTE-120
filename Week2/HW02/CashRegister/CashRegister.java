/**
 *  A cash register totals up sales and computes change due.
 */
public class CashRegister {
   private double purchase;
   private double payment;
   /**
    *  Constructs a cash register with no money in it.
   	*/
   public CashRegister() {
      purchase = 0;
      payment = 0;
   }

   /**
    *  Records the sale of an item.
    *  @param amount the price of the item
    */
   public void recordPurchase(double amount) {
      double total = purchase + amount;
      purchase = total;
   }

   /**
    *  Enters the payment received from the customer.
    *  @param amount the amount of the payment
    */
   public void enterPayment(double amount) {
      payment = amount;
   }

   /**
	* Computes the change due and resets the machine for the next customer, and
	* Print a receipt.
    */
   public void printReceipt() {
      double change = payment - purchase;
      System.out.printf("   Total Sales: $ %.2f\n", purchase);
      System.out.printf("       Payment: $ %.2f\n", payment);
      System.out.printf("==========================\n");
      if (payment < purchase) {
         System.out.printf("Not Enough Payment: $ %.2f\n\n", change);
      }
      else {
         purchase = 0;
         payment = 0;
         System.out.printf("    Change Due: $ %.2f\n\n", change);
      }
   }
}
