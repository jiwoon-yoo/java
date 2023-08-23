package yourturn2b;

import java.util.ArrayList;
import java.util.List;

public class BankApplication {
    private List<BankAccount> accountList;

    public BankApplication() {
        accountList = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accountList.add(account);
    }

    public BankAccount findAccountByNumber(int acctNumber) {
        for (BankAccount acct : accountList) {
            if (acct.getAcctNumber() == acctNumber) {
                return acct;
            }
        }
        return null;
    }

	public List<BankAccount> getAccountList() {
		return accountList;
	}


    //getter
	public void setAccountList(List<BankAccount> accountList) {
		this.accountList = accountList;
	}
    

}
