
public abstract class Hostel implements Fees
{
	private String NumberofRooms;
	private String NumberofStudents;
	int availableRooms;
	private double balance;

	public Hostel()
	{
		System.out.println();
	}
	
	public Hostel(String NumberofRooms, String NumberofStudents, int availableRooms,double balance)
	{
		System.out.println();
		this.NumberofRooms=NumberofRooms;
		this.NumberofStudents=NumberofStudents;
		this.availableRooms=availableRooms;
		this.balance=balance;

	}
	
	public void setNumberofRooms(String NumberofRooms)
	{
		this.NumberofRooms=NumberofRooms;
	}
	public void setNumberofStudents(String NumberofStudents)
	{
		this.NumberofStudents=NumberofStudents;
	}
	public void setavailableRooms(int availableRooms)
	{
		this.availableRooms=availableRooms;
	}
	public void setbalance()
	{
		 this.balance=balance;
	}
	
	
	String getNumberofRooms()
	{
		return NumberofRooms; 
	}
	String getNumberofStudents()
	{
		return NumberofStudents;
	}
	int getavailableRooms()
	{
		return availableRooms;
	}
	public double getbalance()
	{
		return balance;
	}
	
	
	public void addRooms(int amount)
	{
		availableRooms =availableRooms+amount;
		System.out.println("Add Rooms:"+amount);
		System.out.println("After Adding Available Rooms:"+availableRooms);
		
	}
	
	public void decreaseRooms(int amount)
	{
		availableRooms=availableRooms-amount;
		System.out.println("Decrease Rooms:"+amount);
		System.out.println("After Decresing Available Rooms:"+availableRooms);
	}
	
	public void deposit(double amount)
	{
		if(amount>0)
		{
			this.balance+=amount;
		}
	}
	public void withdraw(double amount)
	{
		if(balance>=amount && amount>0)
		{
			this.balance-=amount;
		}
	}
	

	public void showDetails()
	{
		System.out.println("Number of Rooms:"+this.NumberofRooms);
		System.out.println("Number of Students:"+this.NumberofStudents);
		System.out.println("Available Rooms:"+this.availableRooms);
		System.out.println("balance:"+this.balance);
	}
	
}