public class Lab01Ex2{

   public static void main(String[] args){
      Account account1 = new Account();
      account1.initialize("Jane");
      System.out.print("Account1:");
      account1.print();
      Account account2 = new Account();
      account2.initialize("Fred");
      System.out.print("Account2:");
      account2.print();
      account1.deposit(100);
      System.out.print("Account1:");
      account1.print();
      account1.withdraw(40);
      System.out.print("Account1:");
      account1.print();
      account2.deposit(200);
      System.out.print("Account2:");
      account2.print();
      account2.withdraw(125);
      System.out.print("Account2:");
      account2.print();
      Account account3 = new Account();
      account3.initialize("George");
      account3.deposit(50);
      System.out.print("Account3:");
      account3.print();
      account2.deposit(60);
      System.out.print("Account2:");
      account2.print();
      account1.withdraw(20);
      System.out.print("Account1:");
      account1.print();
   }
}
