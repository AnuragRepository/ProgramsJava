package Revision.OOPS.Constructor;

public class ChildClass extends ParentClass {

    ChildClass()
    {
        System.out.println("ChildDefaultConstructor");
    }

    ChildClass(int a , int b)
    {
        int multipy = a*b;
        System.out.println("ChildParameterizeConstructor = "+multipy);
    }

    public static void main(String[] args)
    {
        ChildClass childObj = new ChildClass();
        System.out.println("**********************************\n");
        ParentClass Obj1 = new ChildClass();
        System.out.println("**********************************\n");
        ChildClass childObj1 = new ChildClass(2,3);
        System.out.println("**********************************\n");
        ParentClass obj2 = new ChildClass(2,3);
        System.out.println("**********************************\n");
        ParentClass obj3 = new ParentClass(2,3);
    }


}
