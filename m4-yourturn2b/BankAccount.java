package yourturn2b;
/** *************************************************
 * @Rich Smith - ZenOfProgramming.com *
 ************************************************** */
public abstract class BankAccount implements IAccount
{
   protected double balance;
   protected AcctType accountType;  //I changed this from String which was bad to an enumerated type ;->
   protected int acctNumber;
   private static int nextAcctNum;

   public BankAccount (double balance)
   {
      this.balance = balance;
      this.acctNumber = BankAccount.nextAcctNum;
      BankAccount.nextAcctNum++;
   }

   public int getAcctNumber ()
   {
      return acctNumber;
   }

   public void setAcctNumber (int acctNumber)
   {
      this.acctNumber = acctNumber;
   }

   public AcctType getAccountType ()
   {
      return accountType;
   }

   public double getBalance ()
   {
      return balance;
   }

   public void setBalance (double balance)
   {
      this.balance = balance;
   }

   @Override
   public void deposit (double moneyIn)
   {
      this.balance += moneyIn;
   }

   @Override
   public void withdraw (double moneyOut)
   {
      this.balance -= moneyOut;
   }

//    @Override
//    public abstract void addInterest ();

}
