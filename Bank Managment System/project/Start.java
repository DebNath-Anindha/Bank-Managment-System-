import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Start
{
public static void main(String [] args)

  {   
	  System.out.println("press 1 for Employee Management");
	  System.out.println("press 2 for Customer Management"); 
	  System.out.println("press 3 for Customer Account Management");
	  System.out.println("press 4 for Account Transaction");
	  System.out.println("press 5 for Exit");
	  
	  Scanner d=new Scanner(System.in);
	  int a=d.nextInt();
	  
	  switch (a)
	  {
		  case 1:
		  {  Employee e1=new Employee();
			 Employee e2=new Employee();
			 Employee e3=new Employee();
			 
			  
			  e1.setName("abc");
			  e1.setempId("141");
			  e1.setSalary(123456.0);
			  e1.getName();
			  e1.getempId();
			  e1.getSalary();
			  e1.saveInfo();
			  
			  e2.setName("def");
			  e2.setempId("142");
			  e2.setSalary(1236.0);
			  e2.getName();
			  e2.getempId();
			  e2.getSalary();
			  e2.saveInfo();
			  
			  e3.setName("sds");
			  e3.setempId("143");
			  e3.setSalary(12.0);
			  e3.getName();
			  e3.getempId();
			  e3.getSalary();
			  e3.saveInfo();
			  Bank b=new Bank();
			  b.insertEmployee(e1);
              b.insertEmployee(e2);			  
			  b.insertEmployee(e3);
			  b.removeEmployee(e3);
		      b.showAllEmployees();
          			  
		
	  
			
			 
				
		  }break;
		  
		case 2:
		{
		
		
			 Customer c1=new Customer();
			 Customer c2=new Customer();
			 Customer c3=new Customer();
			 
			  
			  c1.setName("d");
			  c1.setNid(242);
			  
			 
			  c1.getName();
			  c1.getNid();
			  c1.saveInfo();
			
			  
			  c2.setName("f");
			  c2.setNid(142);
			 
			  c2.getName();
			  c2.getNid();
			   c2.saveInfo();
			 
			  
			  c3.setName("s");
			  c3.setNid(143);

			  c3.getName();
			  c3.getNid();
			
			   Bank b=new Bank();
			     b.insertCustomer(c1);
                 b.insertCustomer(c2);			  
			     b.insertCustomer(c3);
				 b.removeCustomer(c2);
				 b.showAllCustomers(); 
				
		  }
	
		
		break;
		case 3:
		{
		  Customer c4=new Customer();
		
		  c4.setName("hsdjk");
		  c4.setNid(1212);
		  c4.getNid();
		  c4.getName();
		 
		 Account a4=new SavingsAccount();
		
		  a4.setAccountNumber(12235);
		  a4.setBalance(10000.2);
	
		  c4.insertAccount(a4);
		 
		  c4.showAllAccounts();
		
		}break;
		case 4:
		{ Account a1;
		  a1=new SavingsAccount();
		  a1.setBalance(500.0);
		  a1.getBalance();
		  a1.deposit(400);
		  a1.setAccountNumber(121121212);
		  a1.getAccountNumber();
		  
		  a1.showInfo();
		  a1.transfer(a1,50000.0);
		    a1.showInfo();
		  a1=new FixedAccount();
		  a1.setBalance(5550.0);
		  a1.getBalance();
		  a1.withdraw(400.0);
		  a1.setAccountNumber(10002);
		  a1.getAccountNumber();
		  a1.showInfo();
		  a1.transfer(a1,50000.0);
		  a1.showInfo();
		
		 }break;
		
		
		case 5:
		{
			System.out.println("invalid ");
		}
		break;
		
		
	
	
		  
	  }
	  
	  
	  
	  
  }
}