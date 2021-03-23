public class Bank implements EmployeeOperations,CustomerOperations
{
	public Customer customer[];
	public Employee employee[];
	private int totalEmp=0;
	private int totalCus=0;

	public Bank(){
		employee=new Employee[3]; 
		customer=new Customer[3];
	}
	
	public void insertEmployee(Employee e)
	
	{  	 
	  if(totalEmp<employee.length)
	   { employee[totalEmp]=e;
          totalEmp++;
		
	   }
	    else
	   {
		   System.out.println("invalid");
	   }
	   
	  
	}
    
	
	public void removeEmployee(Employee e)
    {   
	     
		 for(int i=0; i<totalEmp; i++){
			if(e==this.employee[i])
			{
				employee[i]=employee[--totalEmp];
				System.out.println("Deleted");
			}
		} 
	   
	}
	
	public Employee getEmployee(int empId)
    { 
	  
	  return employee[0];
	}
	
	public void showAllEmployees()
	{
		for(int a=0;a<totalEmp;a++)
		{System.out.println("name:"+employee[a].getName());
	     System.out.println("id:"+employee[a].getempId());
		 System.out.println("salary:"+employee[a].getSalary());
		
		}
	      
		
	}
	
	
	
	public void insertCustomer(Customer c)
    {
	   
	   if(totalCus<customer.length)
	   { customer[totalCus]=c;
          totalCus++;
	   }
	   else
	   {
		   System.out.println("invalid");
	   }
	}
	public void removeCustomer(Customer c)
    {
		 for(int i=0; i<totalCus; i++){
			if(c==this.customer[i])
			{
				customer[i]=customer[--totalCus];
				System.out.println("Deleted");
			}
		} 
	}
	public Customer getCustomer(int nid)
    {
		return customer[0];
	}
	public void showAllCustomers()
	{
		for(int a=0;a<customer.length;a++)
		{System.out.println("name:"+customer[a].getName());
	     System.out.println("id:"+customer[a].getNid());
		 
		
		
		}
	}

}