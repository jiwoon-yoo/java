package demo5;

/**
 * @author Rich Smith at ZenOfProgramming.com
 */
public class Start
{
   public static void main (String[] args)
   {

      // Instantiate a Bank and add all three accounts, each of different a type to it
      Bank bank = new Bank();
      bank.addAccount(new SavingsAcct(200));
      bank.addAccount(new ChequingAcct(200));
      bank.addAccount(new InvestmentAcct(200));
      bank.addAccount(new SavingsAcct(0));
//print out the balance of the accounts
      bank.printOutAllAccounts();
      //add interest to all acounts
      bank.depositInterestToAllAccounts();
      //print out the balances again
      bank.printOutAllAccounts();
      //deposit money into account an account using its accountNumber
      bank.getAcctByAcctNumber(3).deposit(500);

      //print out all balances again
      bank.printOutAllAccounts();
      System.out.println("sorting by balance");
      //   bank.rankAccountsByBalance();
   }
}
