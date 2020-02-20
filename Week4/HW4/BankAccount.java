
import java.lang.*;
/**
 *  A bank account has a balance that can be changed by 
 *  deposits and withdrawals.
 *
 * @author <student's name here>
 * @version <today's date>
*/
public class BankAccount   //Student Starter File
{  
   private double balance;
   private double transFee;
   private int transCount;
   private int numFreeTrans;

  /**
   * Constructs a bank account with a zero balance
   */
   public BankAccount()
   {   
      balance = 0;
      transFee = 0;
      transCount = 0;
      numFreeTrans = 0;
   }

  /**
   * Constructs a bank account with a given balance
   * @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
      transFee = 0;
      transCount = 0;
      numFreeTrans = 0;
   }

  /**
   * Deposits money into the bank account.
   * @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      transCount += 1;
      double newBalance = balance + amount;
      balance = newBalance;
   }

   /**
   * Withdraws money from the bank account.
   * @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      transCount += 1;
      double newBalance = balance - amount;
      balance = newBalance;
   }
   
   public void setTransFee(double fee){
      transFee = fee;
   }
   
   public void setNumFreeTrans(int num){
      numFreeTrans = num;
   }
   
   public int getNumFreeTrans(){
      return numFreeTrans;
   }
   public double getBalance(){
      return balance;
   }
   public double getTransFee(){
      return transFee;
   }
   
   public void deductMonthlyCharge(){
      double num = Math.max(transCount, numFreeTrans);
      num = num - numFreeTrans;
      num = num*transFee;
      balance -=num;
      transCount = 0;
   }

  /**
   * Gets the current balance of the bank account.
   * @return the current balance
   */
}