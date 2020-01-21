/*
Name:    Nicholas Graca
Course:  ISTE-120
HW:      #2-1
*/
public class RunCashRegister {
   public static void main(String[] args) {
      
      //Customer 1's Transaction
      CashRegister customer1 = new CashRegister();
      customer1.recordPurchase(49.95);
      customer1.recordPurchase(20.40);
      customer1.enterPayment(80);
      customer1.printReceipt();
      
      //Customer 2's Transaction
      CashRegister customer2 = new CashRegister();
      customer2.recordPurchase(99.95);
      customer2.recordPurchase(35.15);
      customer2.recordPurchase(50);
      customer2.enterPayment(180);
      customer2.printReceipt();
   }
}
