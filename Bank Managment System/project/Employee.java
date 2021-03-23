import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Employee
{
	private String name;
	private String empId ;
	private double salary;
	
	public void setName(String name)
	{
		this.name=name;
		
	}
	public void setempId(String empId)
	{
		this.empId=empId;
	}
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public String getName() 
	{
		return name;
	}
	public String getempId() 
	{
		return empId;
	}
	public double getSalary()
    {
		return salary;
	}
	
	public void saveInfo()
	{
		try
		{
	     FileWriter fout=new FileWriter("Start.txt",true); 
         fout.write(this.getName());
		 fout.write("\n");
		 fout.write(this.getempId());
		 fout.write("\n");
		 fout.write(new Double(this.salary).toString());
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