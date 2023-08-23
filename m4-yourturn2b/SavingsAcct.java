package yourturn2b;
/** *************************************************
 * @Rich Smith - ZenOfProgramming.com *
 ************************************************** */
public class SavingsAcct extends BankAccount
{

   public SavingsAcct (double balance)
   {
      super(balance);
      this.accountType = AcctType.SAVINGS;
   }

   @Override
   public void addInterest ()
   {
      this.balance *= 1.03;
   }

}
