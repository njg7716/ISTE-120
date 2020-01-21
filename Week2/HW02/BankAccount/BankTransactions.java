/*
Name:    Nicholas Graca
Course:  ISTE-120
HW:      #2-2
*/

public class BankTransactions {
   public static void main(String[] args) {
      BankAccount savings = new BankAccount("Jim's Savings", 0);
      // Adding 3000 into Jim Savings
      savings.deposit(3000);
      savings.printBalance();
      savings.printLineA();
      
      BankAccount checking = new BankAccount("Jim's Checking", 0);
      checking.printBalance();
      //Transfering 500 from Jim Saving to Jim Checking
      checking.transfer(savings, 500);
      checking.printBalance();
      //Withraw 500 from Jim checking
      checking.withdraw(500);
      checking.printBalance();
      savings.printBalance();
      savings.printLineA();
      
      BankAccount jenChecking = new BankAccount("Jen's Checking", 500);
      jenChecking.printBalance();
      //Transfer 500 from Jim Saving to Jen Checking
      jenChecking.transfer(savings, 500);
      jenChecking.printBalance();
      //Withdraw 50 from Jen Checking
      jenChecking.withdraw(50);
      jenChecking.printBalance();
      jenChecking.printLineA();
      savings.printBalance();
      
   }
}
