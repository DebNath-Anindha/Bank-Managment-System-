import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Customer implements AccountOperations //implementing interface
{
	
	private String name;
	private int nid; 
	private Account accounts[];
	private int totalACC=0;
	
	public Customer()
	{
		accounts=new Account[3];
		
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setNid(int nid)
	{
		this.nid=nid;
	}
	
	public int getNid()
	{
		return nid;
	}
	//implements
	public void insertAccount(Account a)
	{   if(totalACC<accounts.length)
		{
			accounts[totalACC]=a;
			totalACC++;
		}
		else
		{
			System.out.println("ivalid");
		}
		
		
	}
    public void removeAccount(Account a)
    {
		 for(int i=0; i<totalACC; i++){
			if(a==this.accounts[i])
			{
				accounts[i]=accounts[--totalACC];
				System.out.println("Deleted");
			}
		} 
		
	}
	public Account getAccount(int accountNumber)
    {   int i=0;  
	    for(int j=0;j<accounts.length;j++)
		{
	       if(accounts[i].accountNumber!=accountNumber)
		      {
	           i++;
	          }
		}
		return accounts[i];
	
	}
	public void showAllAccounts()
	{
		System.out.println("Customer name:"+name);
		System.out.println("nid :"+nid);
		for(int i=0;i<totalACC;i++)
		{  
			System.out.println("Account number:"+accounts[i].accountNumber);
	     
		    System.out.println("balance:"+accounts[i].balance);
		
		}
		
	}
	
	
	public void saveInfo()
	{
		try
		{
	     FileWriter fout=new FileWriter("CustomerINfo.txt",true); 
         fout.write(this.getName());
		 fout.write("\n");
		 
		 fout.write(new Integer(this.nid).toString());
		 fout.write("\n");
  		 
         fout.close(); 
		
		/*FileReader inFile=new FileReader("Start.txt");
		Scanner sin=new Scanner(inFile);
		String s;
		while(sin.hasNext())
		{
			s=sin.next();
			System.out.println(s);
		}
		inFile.close();
		*/
			
           
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not Found Exception");
		}
		
		catch(IOException e)
		{
			System.out.println("IOException");
		}
		
		
		
		
		
		
	}
	
	
	
}