abstract class FName
{
	private String fname;
	protected FName(String name)
	{
		fname=name;
	}
	String getFName()
	{
		return fname;
	}
	abstract String getLName();
	
}
class LName extends FName
{
	private String lname;
	LName(String fname,String lname)
	{
		super(fname);
		this.lname=lname;
	}
	String getLName()
	{
		return lname;
	}
	
}
public class AbstractConstructor
{
	public static void main(String[] args)
	{
		LName obj=new LName("Vamshi","Krishna");
		System.out.println("First Name: "+obj.getFName());
		System.out.println("Last Name: "+obj.getLName());
		
	}
}