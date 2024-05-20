package design_patterns.CreationalDP.PrototypeAndRegistryDP;

public class IntelligentStudent extends Student {
    int iq;

    public IntelligentStudent(){}

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    private IntelligentStudent(IntelligentStudent student) {
        super(student); //Remaining attributes are same as of parent class hence we use super() so that we
                        // can use parents constructor to initalize same attributes
        this.iq = student.iq;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

     /*
        This clone method is overriden cauz we have implemented Prototype interface to this class and since
        clone method in Prototype is of generic return type, hece from IntelligentStudent class we are returning IntelligentStudent object.
     */
}