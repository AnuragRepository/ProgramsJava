package Revision.OOPS.Constructor;

public class ParentClass {

    ParentClass()
    {
        System.out.println("ParentDefaultConstructor");
    }
    ParentClass(int a , int b)
    {
        int sum = a+b;
        System.out.println("ParentParameterizeConstructor = "+sum);
    }
    public static void main(String[] args)
    {
        ParentClass obj = new ParentClass();// it will only called default constructor
        ParentClass obj1 = new ParentClass(5,2); // it will only call parameterized constructor based on argument type , count matching
        //If there is no default constructor but parameterized constructor defined in class, so - ParentClass obj = new ParentClass(); will throw compilation error, asking for argument
    }

}
