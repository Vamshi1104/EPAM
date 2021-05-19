class Employee
{
	private String name;
	private int id;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	
}

public class Encapsulation
{
	public static void main(String[] args)
	{
		Employee emp=new Employee();
		emp.setName("Vamshi");
		//System.out.println(emp.name); Can't access
		emp.setId(574);
		System.out.println(emp.getName());
		System.out.println(emp.getId());
	}
}