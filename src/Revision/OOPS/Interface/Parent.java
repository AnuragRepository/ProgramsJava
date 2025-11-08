package Revision.OOPS.Interface;

public class Parent implements Interface1, Interface2 {

    public static void main(String[] args)
    {
        Parent classObj = new Parent();
        classObj.methodOfParentClass();
/*
        Access Type                 | Decided At     | Based On             | Output |
            | --------------------- | ------------   | -------------------- | ------ |
            | Variable (obj.x)      | Compile time   | Reference type (A)   | 10     |
            | Method (obj.getX())   | Runtime        | Object type (B)      | 20     |*/

        Interface1 I1 = new Parent();// create class object with reference to Interface1
        I1.methodOfInterface1();//I1 cannot call methodOfInterface2() since its not defined in interface1
        I1.commonInterfaceMethod();

        Interface2 I2 = new Parent();// create class object with reference to Interface2
        I2.methodOfInterface2();//I2 cannot call methodOfInterface1() since its not defined in interface2
        I2.commonInterfaceMethod();

        System.out.println("Access via class object");
        classObj.methodOfInterface1();// doubt how class object access interface method
        classObj.methodOfInterface2();//
        classObj.commonInterfaceMethod();//

    }


    @Override
    public void commonInterfaceMethod() {

        System.out.println("commonMethod");
    }

    @Override
    public void methodOfInterface2() {

        System.out.println("methodOfInterface2");
    }

    @Override
    public void methodOfInterface1() {

        System.out.println("methodOfInterface1");
    }

    public void methodOfParentClass()
    {
        System.out.println("methodOfParentClass");
    }


}
