package demo5;

import java.util.ArrayList;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */
public class Bank
{
   private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

//make a method called addAccount that will accept a new Chequing, Savings or Investment account and add it to our accounts list
   public void addAccount (BankAccount account)
   {
      accounts.add(account);
   }


   //add a method called depositInterestToAllAccounts that will increase each account by the interest owed, based on the account type.  Hint - it is very easy...don't overthink it.  2nd hint:  Array lists don't have .length, the have .size
   public void depositInterestToAllAccounts ()
   {
      for (int i = 0; i < accounts.size(); i++) {
         accounts.get(i).addInterest();
      }
   }

   //Add a method called printOutAllAccounts that will show the account status for each account.  Hint - A cool way to do this would be to override the toString method in BankAccount to give a nicely formatted output for each account

   public void printOutAllAccounts ()
   {
      System.out.println("\nBank Statements:");
      //note, I've used a for each loop here - you can use a plain old for loop like the method above but this is a little slicker and easier to read
      for (BankAccount account : accounts) {
         System.out.println(account.toString());
      }
   }


   public BankAccount getAcctByAcctNumber (int accountNumber)
   {
      for (BankAccount account : accounts) {
         if (account.getAcctNumber() == accountNumber) {
            return account;
         }
      }
      return null;
   }


//   public void rankAccountsByBalance ()
//   {
//      Collections.sort(accounts);
//      for (BankAccount account : accounts) {
//         System.out.println(account.toString());
//      }
//   }
}
