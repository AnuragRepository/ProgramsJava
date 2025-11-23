package Revision.OOPS.Polymorphism.Overriden;

public class Child extends Parent{

    public void commonMethod(int a, int b, String c)
    {
        System.out.println("Child Method having feature "+c +" with variable "+a+" and "+b);
    }

    public static void main(String[] args)
    {
        // If we comment commonMethod of child method and call commonMethod via child object console will print
        /*Parent Method having feature Overide with variable 1 and 2*/
        //otherwise with uncommented commonMethod in child and parent class console will print only
        /*Child Method having feature Overide with variable 1 and 2*/

        //Basically commonMethod of parent class will be overided via commonMethod of child class

        Child childObj = new Child();
        childObj.commonMethod(1,2,"Overide");

        // This will call commonMethod of ChildClass
        //since method we are calling via so it will call based on right side which is new child()
        //direct variable calling concept NA for overide
        Parent childObj1 = new Child();
        childObj1.commonMethod(3,4,"Parent Class Object Referenced");

        // This will call commonMethod of ParentClass obj created for parent class, priority given with right side concept
        Parent parentObj = new Parent();
        parentObj.commonMethod(5,6,"Parent Class Object Referenced");
    }

}
