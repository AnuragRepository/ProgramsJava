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

}
