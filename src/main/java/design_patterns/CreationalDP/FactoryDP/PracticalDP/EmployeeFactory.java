package design_patterns.CreationalDP.FactoryDP.PracticalDP;

public class EmployeeFactory {

    /*
        This is factory class of Employee type, responsible for creating Object as per Enum input comming.
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
