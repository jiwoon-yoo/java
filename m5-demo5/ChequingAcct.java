package demo5;

/** *************************************************
 * @Rich Smith - ZenOfProgramming.com *
 ************************************************** */
public class ChequingAcct extends BankAccount
{

   public ChequingAcct (double balance)
   {
      super(balance);
      this.accountType = AcctType.CHEQUING;
   }

   @Override
   public void addInterest ()
   {
      this.balance *= 1.005;
   }
}
