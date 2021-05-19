class Employee{  
    private int id;
    private String name;
    private String skills;
    private int basicsalary;
    Employee(int id,String name)
    {
		this.id=id;
		this.name=name;
		skills="Fluent in communication";
		basicsalary=5000;
    }
    public int getId()
    {
    	return id;
    }
    public String getName()
    {
    	return name;
    }
    public String getSkills()
    {
    	return skills;
    }
    int getSalary()
    {
    	return basicsalary;
    }

}  
class Programmer extends Employee{  
    
    Programmer(int id,String name)
    {
    	super(id,name);
    	
    }
    public int getSalary()
    {
    	return super.getSalary()+10000;
    }
    public String getSkills()
    {
    	return super.getSkills()+",codes applications";
    }
   
}
class Manager extends Employee{  
    
    Manager(int id,String name)
    {
    	super(id,name);
    }
    public int getSalary()
    {
    	return super.getSalary()+15000;
    }
    public String getSkills()
    {
    	return super.getSkills()+",manages employees";
    }

}  
public class Inheritance
{
	 public static void main(String args[]){  
	 	Employee emp1=new Programmer(586,"Vamshi");
        Employee emp2=new Manager(786,"Krishna");  
        System.out.println(emp1.getId());
        System.out.println(emp1.getName());
        System.out.println(emp1.getSkills());
        System.out.println(emp1.getSalary());
        System.out.println(emp2.getId());
        System.out.println(emp2.getName());
        System.out.println(emp2.getSkills());
        System.out.println(emp2.getSalary());
    }  
}