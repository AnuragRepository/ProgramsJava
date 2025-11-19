package Revision.OOPS.Inheritance.Concept;

public class InheritanceSubClass extends InheritanceSuperClass {

    public static void main(String[] args)
    {

        InheritanceSubClass inheritanceSubClass = new InheritanceSubClass();
        inheritanceSubClass.getColor();
        inheritanceSubClass.brakes();// taken from parent class
    }

    public void getColor()
    {
        System.out.println(colorInSuperClass);// taken from parent class
    }




}
