
public class Student extends Hostel

{
	private  String name;
	private	String id;
	private String department;
	private String cellnumber;
	
	public Student()
	{
		System.out.println();
	}
	public Student(String NumberofRooms, String NumberofStudents,int availableRooms, double balance, String name, String id, String department,String cellnumber)
	{
		super(NumberofRooms,NumberofStudents,availableRooms, balance);
		this.name=name;
		this.id= id;
		this.department=department;
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
	public void setdepartment(String department)
	{
		this.department=department;
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
	public String getdepartment()
	{
		return department;
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
		System.out.println("DEPARTMENT:"+department);
		System.out.println("CELLNUMBER:"+cellnumber);
	}		
	
}
