package Revision.SuperKeywordConcept;

public class SubClass extends SuperClass
{
    String  commonVar = "SubClass Variable";
     int a;
    SubClass(int a) // if we are using parameterised constructor in superclass then we have to use super(with argument) in our subclass constructor
    {
        super(a);// able to access SuperClass constructor even without using this in case of default constructor
        this.a = a ;
        System.out.println(a);
        System.out.println("I am SubClass Constructor");
    }
    public static void main(String[] args)
    {
        SubClass subClassObj = new SubClass(5);
        //subClassObj.commonMethod();
    }
    public void commonMethod()
    {
        System.out.println(commonVar);// it will take local SubClass value -SubClass Variable, if we comment SubClass variable then it will also take SuperClass variable value
        System.out.println(super.commonVar);//it will take SuperClass value as we are using super -SuperClass Variable
        System.out.println("I am SubClass method");
        super.commonMethod();
    }



}
