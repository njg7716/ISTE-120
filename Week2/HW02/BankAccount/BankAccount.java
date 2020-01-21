/**
 *  A bank account has a balance that can be changed by
 *  deposits and withdrawals.
 */
public class BankAccount
{
	//Instance variable
   private double balance;
   private String accountName;
   /**
    *  Constructs a bank account with a zero balance
    *  and with an account name
    *  @param name the account name
    */
   public BankAccount(String name)
   {
      balance = 0;
      accountName = name;
   }

   /**
    *  Constructs a bank account with a given balance
    *  @param name the account name
    *  @param initialBalance the initial balance
    */
   public BankAccount(String name, double initialBalance)
   {
      balance = initialBalance;
      accountName = name;
   }

   /**
    *  Deposits money into the bank account.
    *  @param amount the amount to deposit
    */
   public void deposit(double amount)
   {
      double newBalance = balance + amount;
      balance = newBalance;
   }

   /**
    *  Withdraws money from the bank account.
    *  @param amount the amount to withdraw
    */
   public void withdraw(double amount)
   {
      double newBalance = balance - amount;
      balance = newBalance;
   }

   /**
    *  Gets the current balance of the bank account.
    *  @return the current balance
    */
   public double getBalance()
   {
      return balance;
   }

   /**
    * Transfer money from other account
    * @param ba another BankAccount object
    * @param amt the amount to transfer
    */
   public void transfer(BankAccount ba, double amt) {
	   ba.withdraw(amt);
	   deposit(amt);
   }

   /**
    * Print the balance
    */
   public void printBalance() {
	   System.out.printf(accountName + " Account Balance is $ %.2f\n", balance);
   }

   /**
    * Print a line of "="s
    */
   public void printLineA() {
	   System.out.println("==========================================");
   }

   /**
    * Print a line of "&"s
    */
   public void printLineB() {
   	   System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
   }
}
