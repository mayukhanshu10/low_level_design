package design_patterns.CreationalDP.FactoryDP.PracticalDP;

public class Client {
    public static void main(String[] args) {

        /* Calling EmployeeFactory-->getEmployee() which creates object based on Enum type passed by us and returns it.
           Since WebDeveloper, KotlinDeveloper, etc all are subclasses of Employee Interface type, hence at runn time,
           Employee e will store the Object of that developer whose type we passed in parameter.
        */

        Employee e = EmployeeFactory.getEmployee(EmployeeType.WEBDEVELOPER);
        System.out.println(e.salary());

        Employee e2 = EmployeeFactory.getEmployee(EmployeeType.KOTLINDEVELOPER);
        System.out.println(e2.salary());
    }
}
