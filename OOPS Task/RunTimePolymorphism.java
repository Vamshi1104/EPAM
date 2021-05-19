class Employee {
    void whoIsThis() {
        System.out.println("Employee");
    }
}
class Programmer extends Employee {
    void whoIsThis() {
        System.out.println("Programmer");
    }
}
class Manager extends Employee {
    void whoIsThis() {
        System.out.println("Manager");
    }
}
class Assistant extends Employee {
    void whoIsThis() {
        System.out.println("Assistant");
    }
}
public class RunTimePolymorphism {
    public static void main(String args[]) {
        Employee emp;
        emp = new Programmer();
        emp.whoIsThis();
        emp = new Manager();
        emp.whoIsThis();
        emp = new Assistant();
        emp.whoIsThis();
        //emp=(Employee)(emp);
        //emp.whoIsThis(); Guess the output
    }
}