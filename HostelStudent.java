

public class HostelStudent implements HostelOparation
{
	
	private Hostel  hostel[] = new Hostel[100];
	
	
	public boolean insertHostel(Hostel h)
	{
		for(int i=0; i<hostel.length; i++)
		{
			if(hostel[i] == null)
			{
				hostel[i] = h;
				return true;
			}
		}
		return false;
	}
	
	
	public boolean removeHostel(Hostel h)
	{
		for(int i=0; i<hostel.length; i++)
		{
			if(hostel[i] == h)
			{
				hostel[i] = null;
				return true;
			}
		}
		return false;
	}
	
	
	
	
	public void showAllHostel()
	{
		for(int i=0; i<hostel.length; i++)
		{
			if(hostel[i] != null)
			{
				hostel[i].showDetails();
			}
		}
	}
	
	public void showDetails()
	{
		
			
		this.showAllHostel();
	}
	
}