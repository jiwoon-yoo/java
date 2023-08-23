package yourturn2b;
/** *************************************************
 * @Rich Smith - ZenOfProgramming.com *
 ************************************************** */
public class ChequingAcct extends BankAccount
{

   public ChequingAcct (double balance, BankApplication application)
   {
      super(balance, application);
      this.accountType = AcctType.CHEQUING;		//
   }

   @Override
   public void addInterest ()
   {
      this.balance *= 1.005;
      
   }


   
	
	@Override
	public void transfer(int acctNumber, double amount) {
	    BankAccount targetAcct = null;

	    // 송금 대상 계정을 찾기 위해 계좌 번호를 이용하여 계정을 검색
	    for (BankAccount i : this.application.getAccountList()) {
	        if (i.getAcctNumber() == acctNumber) {
	            targetAcct = i;
	            break;
	        }
	    }

	    if (targetAcct == null) {
	        System.out.println("Target account not found.");
	        return;
	    }

	    if (this.balance >= amount) {
	        this.withdraw(amount);
	        targetAcct.deposit(amount);
	        System.out.println("Transfer successful.");
	        
	        
	    } else {
	        System.out.println("Insufficient balance for transfer.");
	    }
	}


}
