abstract class Employee {
    private int id;
    private String name;
    Employee(int id,String name)
    {
	this.id=id;
	this.name=name;
    }
    public int getId()
    {
    	return id;
    }
    public String getName()
    {
    	return name;
    }
    abstract String getRole();
}
class Programmer extends Employee {
    
    Programmer(int id,String name)
    {
	super(id,name);
    }
    String getRole()
    {
    	return "Programmer";
    }
}
class Manager extends Employee {
    Manager(int id,String name)
    {
	super(id,name);
    }
    String getRole()
    {
    	return "Manager";
    }
}

class Abstraction {
    public static void main(String args[]) {
        Employee emp=new Programmer(586,"vamshi");
        Employee emp2=new Manager(991,"Kumar");
        System.out.println(emp.getRole());
        System.out.println(emp2.getRole());
    }
}