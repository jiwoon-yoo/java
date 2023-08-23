package yourturn2b;

/** *************************************************
 * @Rich Smith - ZenOfProgramming.com *
 ************************************************** */
public class TestAccounts
{
   public static void main (String[] args)
   {
      System.out.println("Instantiating one of each type of account and placing $100 in the balance");
      ChequingAcct chequingAcct = new ChequingAcct(100); 
      InvestmentAcct investAcct = new InvestmentAcct(100); 
      SavingsAcct savingsAcct = new SavingsAcct(100); 
      
      
      System.out.println("Printing out the account balances:");
      System.out.println("Account #\tAccount Type\t\tBalance");
      System.out.println(chequingAcct.getAccountType() + "\t" + chequingAcct.getBalance());
      System.out.println(investAcct.getAccountType() + "\t" + chequingAcct.getBalance());
      System.out.println(savingsAcct.getAccountType() + "\t" + chequingAcct.getBalance());
      
          
      System.out.println("Adding Interest to each account");
      chequingAcct.addInterest(); 
      investAcct.addInterest();
      savingsAcct.addInterest();
      
      
      
      
      System.out.println("Printing out the account balances:");
      System.out.println("Account #\tAccount Type\t\tBalance");
      System.out.println(chequingAcct.getAccountType() + "\t" + chequingAcct.getBalance());
      System.out.println(investAcct.getAccountType() + "\t" + chequingAcct.getBalance());
      System.out.println(savingsAcct.getAccountType() + "\t" + chequingAcct.getBalance());

      
      



      System.out.println("Depositing $50 and withdrawing $85 from each account");
      chequingAcct.deposit(50);
      chequingAcct.withdraw(85);
      
      investAcct.deposit(50);
      investAcct.withdraw(85);
      
      savingsAcct.deposit(50);
      savingsAcct.withdraw(85);
      
      
      
      System.out.println("Printing out the account balances:");
      System.out.println("Account #\tAccount Type\t\tBalance");
      System.out.println(chequingAcct.getAccountType() + "\t" + chequingAcct.getBalance());
      System.out.println(investAcct.getAccountType() + "\t" + chequingAcct.getBalance());
      System.out.println(savingsAcct.getAccountType() + "\t" + chequingAcct.getBalance());

      
     

      System.out.println("Making an array of 5 chequing accounts, adding $100 to each account, then adding interest to each account and printing out the balances");
      ChequingAcct[] chequingArr = {
    		  new ChequingAcct(100),
    		  new ChequingAcct(100),
    		  new ChequingAcct(100),
    		  new ChequingAcct(100),
    		  new ChequingAcct(100)
      }; 
      
      for(int i = 0; i < chequingArr.length; i++) {
    	  
    	  chequingArr[i].addInterest();  
      }
      
      for(int i = 0; i < chequingArr.length; i++) {
    	  
    	  System.out.println(chequingArr[i].getBalance());
      }
      
      
      
      
      System.out.println("Making a 3x3 multidimensional array of Savings Accounts, adding $100 to each account, then adding interest to each account and printing out the balances");
      SavingsAcct[][] savingsArr = {
    		  {new SavingsAcct(100),new SavingsAcct(100),new SavingsAcct(100) },
    		  {new SavingsAcct(100),new SavingsAcct(100),new SavingsAcct(100) },
    		  {new SavingsAcct(100),new SavingsAcct(100),new SavingsAcct(100) }
      }; 
      
      for(int i = 0; i < savingsArr.length; i++) {
    	  for(int j = 0; j < savingsArr[i].length; j++) {
    		  
    		  savingsArr[i][j].addInterest();
    	  }
      }
      
      for(int i = 0; i < savingsArr.length; i++) {
    	  for(int j = 0; j < savingsArr[i].length; j++) {
    		  
    		  System.out.println(savingsArr[i][j].getBalance());
    	  }
      }
      
      
      
      
      System.out.println("Making a ragged array of Investment Accounts with 2 InvestmentAccounts in the first row and 3 InvestmentAccounts in the 2nd row and then adding $100 to each account, then adding interest to each account and printing out the balances");
      InvestmentAcct[][] investmentArr = {
    		  {new InvestmentAcct(100), new InvestmentAcct(100)},
    		  {new InvestmentAcct(100), new InvestmentAcct(100), new InvestmentAcct(100)}
      }; 
      //way2
//      InvestmentAcct[][] investmentArr2 = new InvestmentAcct[2][];
//      investmentArr2[0] = new InvestmentAcct[2]; 
//      investmentArr2[1] = new InvestmentAcct[3]; 
      
      for(int i = 0; i < investmentArr.length; i++) {
    	  
    	  for(int j = 0; j < investmentArr[i].length; j++) {
    		  
    		  investmentArr[i][j].addInterest();
    	  }
      }
      
      for(int i = 0; i < investmentArr.length; i++) {
    	  
    	  for(int j = 0; j < investmentArr[i].length; j++) {
    		  
    		  System.out.println(investmentArr[i][j].getBalance());
    	  }
      }
   
   
   }
}
