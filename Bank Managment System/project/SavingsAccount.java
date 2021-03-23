public class SavingsAccount extends Account
{
    private double interestRate;
	
    
	public void setInterestRate(double interestRate)
	{
		this.interestRate=interestRate;
	}
    public double getInterestRate()
	{
		return interestRate;
	}
	
	//ABSTRACT METHODS OVERRIDE
	
	public void setAccountNumber(int accountNumber){
		
		this.accountNumber=accountNumber;
	}
    
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
    
	public int getAccountNumber()
	{
		return accountNumber;
    }
    
	public double getBalance()
	{
		return balance;
	}
	
	
	
	
	
	
	
    public void showInfo()
	{
	    System.out.println("Interest Rate:"+interestRate);
		System.out.println("Account number :"+accountNumber);
		System.out.println("Total balance:"+balance);
	}
	

}