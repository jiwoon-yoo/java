package demo5;

/** *************************************************
 * @Rich Smith - ZenOfProgramming.com *
 ************************************************** */
public class InvestmentAcct extends BankAccount
{

   public InvestmentAcct (double balance)
   {
      super(balance);
      this.accountType = AcctType.INVESTMENT;
   }

   @Override
   public void addInterest ()
   {
      this.balance *= 1.07;
   }




}
