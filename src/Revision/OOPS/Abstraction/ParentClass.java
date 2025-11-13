package Revision.OOPS.Abstraction;

public abstract class ParentClass {

    public static void main(String[] args)
    {
        //ParentClass parentClassObj = new ParentClass(); abstract class cannot be instantaniated

    }

    public void nonAbstractMethod()
    {
        System.out.println("Non abstract method content from Parent class");
    }
    public abstract void abstractMethod();// cannot make abstract method private since it has to be implemented in inherited class

}
