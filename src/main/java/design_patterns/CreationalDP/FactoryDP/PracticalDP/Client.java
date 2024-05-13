package design_patterns.CreationalDP.FactoryDP.PracticalDP;

public class Client {
    public static void main(String[] args) {
        Employee e = EmployeeFactory.getEmployee(EmployeeType.WEBDEVELOPER);
        System.out.println(e.salary());
    }
}
