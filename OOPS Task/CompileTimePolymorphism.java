class Name{
    private String firstname;
    private String middlename;
    private String lastname;
    void setName(String fname, String lname) {
        firstname=fname;
        middlename="";
		lastname=lname;
    }
    void setName(String fname,String mname,String lname) {
        firstname=fname;
		middlename=mname;
		lastname=lname;
    }
    String getName()
    {
	return firstname+" "+middlename+" "+lastname;
    }
}
public class CompileTimePolymorphism {
    public static void main(String[] args) {
    Name obj=new Name();
    obj.setName("Vamshi","Krishna");
	Name obj2=new Name();
	obj2.setName("Vamshi","Krishna","Dhunde");
	System.out.println(obj.getName());
	System.out.println(obj2.getName());
    }
}