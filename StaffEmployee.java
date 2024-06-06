
public class StaffEmployee extends Hostel
{
	private	String name;
	private String salary;
	private	String id;
	private String cellnumber;
	
	public StaffEmployee()
	{
		System.out.println();
	}
	public StaffEmployee(String NumberofRooms, String NumberofStudents,int availableRooms, double balance, String name, String salary,String id, String cellnumber)
	{
		super(NumberofRooms,NumberofStudents,availableRooms, balance);
		this.name=name;
		this. id= id;
		this.salary=salary;
		this.cellnumber=cellnumber;
		
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setid(String id)
	{
		this.id=id;
	}
	public void setsalary(String salary)
	{
		this.salary=salary;
	}
	public void setcellnumber(String cellnumber)
	{
		this.cellnumber=cellnumber;
	}
	public String getname()
	{
		return name;
	}
	public String getid()
	{
		return id;
	}
	public String getsalary()
	{
		return salary;
	}
	public String getcellnumber()
	{
		return cellnumber;
	}
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Name:"+name);
		System.out.println("ID:"+id);
		System.out.println("SALARY:"+salary);
		System.out.println("CELLNUMBER:"+cellnumber);
	}		
	

}
