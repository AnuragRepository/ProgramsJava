package Revision.OOPS.Abstraction;

public class ChildClass extends ParentClass {
    public static void main(String[] args)
    {
        ChildClass childClassObj = new ChildClass();
        childClassObj.abstractMethod();
        childClassObj.nonAbstractMethod();// able to call Parent method since Child class inherits Parent class
    }


    /* When a non abstract class inherits abstract class , 2 options-
  Make inherited class abstract or Implement all abstract method of abstract class to child class*/
    @Override
    public void abstractMethod() // coming form abstract Parent class
    {
     System.out.println("Implemented body of abstract method in Child class");
    }
}
