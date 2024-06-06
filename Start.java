public class Start
{
	public static void main(String args[])
	{
		Student s1 = new Student("40", "400", 20,3456.00,"TAZDIK","45116","CSE","09465839");
		s1.addRooms(10);
		s1.decreaseRooms(5);
		s1.deposit(4999.00);
		s1.withdraw(567.00);
		StaffEmployee se1 = new StaffEmployee("40", "400", 20,4567.00,"JAMAL","1","10000","9283746");
		se1.addRooms(5);
		se1.decreaseRooms(6);
		se1.deposit(499.00);
		se1.withdraw(57.00);
		
		Student s2 = new Student("20", "300", 15,45768.00,"PUJA","37441","CSE","0946475739");
		s2.addRooms(20);
		s2.decreaseRooms(15);
		s2.deposit(345.00);
		s2.withdraw(555.00);
		StaffEmployee se2 = new StaffEmployee("20", "300", 15,23431.00,"KAMAL","2","20000","0946475");
		se2.addRooms(3);
		se2.decreaseRooms(3);
		se2.deposit(333.00);
		se2.withdraw(453.00);
		
		Student s3 = new Student("30", "200", 30,7865.00,"FAHAMIDA","38961","CSE","0946235839");
		s3.addRooms(6);
		s3.decreaseRooms(9);
		s3.deposit(777.00);
		s3.withdraw(875.00);
		StaffEmployee se3 = new StaffEmployee("30", "200", 30,536473.00,"RAMAL","3","30000","023235839");
		se3.addRooms(3);
		se3.decreaseRooms(3);
		se3.deposit(333.00);
		se3.withdraw(453.00);
		
		Student s4 = new Student("34", "500", 45,9860.00,"MESBAH","40282","CSE","0459465839");
		s4.addRooms(10);
		s4.decreaseRooms(5);
		s4.deposit(4999.00);
		s4.withdraw(567.00);
		StaffEmployee se4 = new StaffEmployee("34", "500",45,93654.00,"DAMAL","4","40000","067755839");
		se4.addRooms(3);
		se4.decreaseRooms(3);
		se4.deposit(333.00);
		se4.withdraw(453.00);
		
		HostelStudent h = new HostelStudent ();
		
		h.showDetails();
		
		
		
		System.out.println("-----");
		
		
		if(h.insertHostel(s1))
		{
			System.out.println("The Student " +s1.getname()+" has been Inserted ");
		}
		else
		{
			System.out.println("The Student " +s1.getname()+" Can NOT be Inserted ");
		}
		
		
		if(h.insertHostel(s2))
		{
			System.out.println("The Student " +s2.getname()+" has been Inserted ");
		}
		else
		{
			System.out.println("The Student " +s2.getname()+" Can NOT be Inserted ");
		}
		
		if(h.insertHostel(s3))
		{
			System.out.println("The Student " +s3.getname()+" has been Inserted ");
		}
		else
		{
			System.out.println("The Student " +s3.getname()+" Can NOT be Inserted ");
		}
		
		if(h.insertHostel(s4))
		{
			System.out.println("The Student " +s4.getname()+" has been Inserted ");
		}
		else
		{
			System.out.println("The Student " +s4.getname()+" Can NOT be Inserted ");
		}
		
		
		
		
		
		if(h.insertHostel(se1))
		{
			System.out.println("The Staff Employee " + se1.getname()+ " has been Inserted ");
		}
		else
		{
			System.out.println("The Staff Employee " + se1.getname()+ " Can NOT be Inserted ");
		}
		
		if(h.insertHostel(se2))
		{
			System.out.println("The Staff Employee " + se2.getname()+ " has been Inserted ");
		}
		else
		{
			System.out.println("The Staff Employee " + se2.getname()+ " Can NOT be Inserted ");
		}
		
		if(h.insertHostel(se3))
		{
			System.out.println("The Staff Employee " + se3.getname()+ " has been Inserted ");
		}
		else
		{
			System.out.println("The Staff Employee " + se3.getname()+ " Can NOT be Inserted ");
		}
		
		if(h.insertHostel(se4))
		{
			System.out.println("The Staff Employee " + se4.getname()+ " has been Inserted ");
		}
		else
		{
			System.out.println("The Staff Employee " + se4.getname()+ " Can NOT be Inserted ");
		}
		
		
		System.out.println("-----");
		
		h.showDetails();
		
		System.out.println("-----");
		
		if(h.removeHostel(s2))
		
		{
			System.out.println("The Student " + s2.getname()+ " has been Removed ");
		}
		else
		{
			System.out.println("The Student " + s2.getname()+ "Can NOT be Removed ");
		}
		
		if(h.removeHostel(se3))
		{
			System.out.println("The Staff Employee " + se3.getname()+ " has been Removed ");
		}
		else
		{
			System.out.println("The  Staff Employee " + se3.getname()+ "Can NOT be Removed ");
		}
		
		
		
		
		/*System.out.println("-----");
		
		h.showDetails();
		
		System.out.println("------");
		
		Hostel  hh = h.searchHostel (s4.getname());
		
		if(hh != null)
		{
			System.out.println("*Student Found*");
			hh.showDetails();
		}
		else
		{
			System.out.println("*Student not Found*");
		}
		
		Hostel hhh = h.searchHostel(se2.getname());
		
		if(hhh != null)
		{
			System.out.println("*Staff Employee Found*");
			hhh.showDetails();
		}
		else
		{
			System.out.println("*Staff Employee not Found*");
		}*/
		
		System.out.println("----");
	}
}
	
