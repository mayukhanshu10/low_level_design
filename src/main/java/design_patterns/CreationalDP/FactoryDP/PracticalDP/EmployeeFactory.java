package design_patterns.CreationalDP.FactoryDP.PracticalDP;

public class EmployeeFactory {

    /*
        This is factory class of Employee type, responsible for creating Object as per Enum input comming.
        That is, we removed the logic of creating object of Employee from client class and
        gave that logic to factory class. Now factory will decide which object to create based on ENUM input.
     */

    public static Employee getEmployee(EmployeeType et) {

        if(et.equals(EmployeeType.WEBDEVELOPER)){
            return new WebDeveloper();
        }else if(et.equals(EmployeeType.KOTLINDEVELOPER)){
            return new KotlinDeveloper();
        }else if(et.equals(EmployeeType.FRONTENDDEVELOPER)){
            return new FrontendDeveloper();
        }else{
            return null;
        }
    }
}
