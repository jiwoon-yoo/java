package yourturn2b;

/** *************************************************
 * @Rich Smith - ZenOfProgramming.com *
 ************************************************** */
public class TestAccounts
{
   public static void main (String[] args)
   {
	   // Create a bank application to store the list of accounts 
       BankApplication bankApp = new BankApplication();				

       // Create accounts and add them to the bank application
       ChequingAcct chequingAcct = new ChequingAcct(1000, bankApp);			//notice. pass the same BankApplication object
       SavingsAcct savingsAcct = new SavingsAcct(2000, bankApp);

       bankApp.addAccount(chequingAcct);
       bankApp.addAccount(savingsAcct);

       
       
       // Perform transfers
       chequingAcct.transfer(savingsAcct.getAcctNumber(), 500);

       // Display account information after transfers
       System.out.println("Chequing Account Balance: $" + chequingAcct.getBalance());
       System.out.println("Savings Account Balance: $" + savingsAcct.getBalance());
   
      
      
   }
}
