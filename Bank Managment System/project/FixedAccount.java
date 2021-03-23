public class FixedAccount extends Account
{
	
	private int tenureYear;
     
    public void setTenureYear(int tenureYear)
	{
	  this.tenureYear=tenureYear;
    }
    
	public int getTenureYear()
	{
	return tenureYear;
    }
	
	//ABSTRACT METHODS OVERRIDE
	public void setAccountNumber(int accountNumber)
	{
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
		System.out.println("Tenure Year:"+tenureYear);
		System.out.println("Account number :"+accountNumber);
		System.out.println("Total balance:"+balance);
		
	}

}