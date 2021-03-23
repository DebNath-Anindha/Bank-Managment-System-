public abstract class Account implements ITransactions
{
	
	protected int accountNumber;
	protected double balance;
	
	 
    public abstract void setAccountNumber(int accountNumber);
    public abstract void setBalance(double balance);
    public abstract int getAccountNumber();
    public abstract double getBalance();
    public abstract void showInfo();
    
	public void deposit(double amount)
	{
		this.balance=balance+amount;
	}
	public void withdraw(double amount)
	{
		this.balance=balance-amount;
	}
    public void transfer(Account a,double amount)
	{
		a.balance+=amount;
	}

}