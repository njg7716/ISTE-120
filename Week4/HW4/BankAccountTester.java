/*
Name: Nicholas graca
Course: ISTE-120
HW: #4
*/
public class BankAccountTester{

   public static void main(String[] args){
      BankAccount b1 = new BankAccount(1000);
      b1.setTransFee(2);
      b1.setNumFreeTrans(5);
      System.out.println("Set up new account with $" + (int) b1.getBalance() + ", " + (int) b1.getNumFreeTrans() + " free transactionsand $" +
      (int) b1.getTransFee() + " per transaction above " + b1.getNumFreeTrans());
      System.out.println("Starting Balance: " + b1.getBalance());
      System.out.println("deposit 1000, withdraw 500, withdraw 400, deposit 200 - 4 transactions ");
      b1.deposit(1000);
      b1.withdraw(500);
      b1.withdraw(400);
      b1.deposit(200);
      System.out.println("Balance: " + b1.getBalance());
      System.out.println("Expected: 1300.0");
      System.out.println("Apply Monthly Charge");
      b1.deductMonthlyCharge();
      System.out.println("Ending Balance Month 1: " + b1.getBalance());
      System.out.println("Expected: 1300.0");
      System.out.println();
      System.out.println("Starting Balance: " + b1.getBalance());
      System.out.println("deposit 1000, withdraw 500, withdraw 400, deposit 200, deposit 500 - 5 transactions ");
      b1.deposit(1000);
      b1.withdraw(500);
      b1.withdraw(400);
      b1.deposit(200);
      b1.deposit(500);
      System.out.println("Balance: " + b1.getBalance());
      System.out.println("Expected: 2100.0");
      System.out.println("Apply Monthly Charge");
      b1.deductMonthlyCharge();
      System.out.println("Ending Balance Month 2: " + b1.getBalance());
      System.out.println("Expected: 2100.0");
      System.out.println();
      System.out.println("Starting Balance: " + b1.getBalance());
      System.out.println("deposit 1000, withdraw 500, withdraw 400, deposit 200, deposit 500, withdraw 1000 - 6 transactions ");
      b1.deposit(1000);
      b1.withdraw(500);
      b1.withdraw(400);
      b1.deposit(200);
      b1.deposit(500);
      b1.withdraw(1000);
      System.out.println("Balance: " + b1.getBalance());
      System.out.println("Expected: 1900.0");
      System.out.println("Apply Monthly Charge");
      b1.deductMonthlyCharge();
      System.out.println("Ending Balance Month 3: " + b1.getBalance());
      System.out.println("Expected: 1898.0");
      System.out.println();
      System.out.println("Starting Balance: " + b1.getBalance());
      System.out.println("deposit 1000, withdraw 500, withdraw 400, deposit 200, deposit 500, withdraw 1000\ndeposit 100 - 7 transactions ");
      b1.deposit(1000);
      b1.withdraw(500);
      b1.withdraw(400);
      b1.deposit(200);
      b1.deposit(500);
      b1.withdraw(1000);
      b1.deposit(100);
      System.out.println("Balance: " + b1.getBalance());
      System.out.println("Expected: 1798.0");
      System.out.println("Apply Monthly Charge");
      b1.deductMonthlyCharge();
      System.out.println("Ending Balance Month 4: " + b1.getBalance());
      System.out.println("Expected: 1794.0");
   }

}