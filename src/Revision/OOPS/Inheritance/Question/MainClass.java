package Revision.OOPS.Inheritance.Question;

public class MainClass {

    public static void main(String[] args)
    {

        /*
        Access Type                 | Decided At     | Based On             | Output |
            | --------------------- | ------------   | -------------------- | ------ |
            | Variable (obj.x)      | Compile time   | Reference type (A)   | 10     |
            | Method (obj.getX())   | Runtime        | Object type (B)      | 20     |*/

        ClassA obj1 = new ClassB();// obj has class A reference and classB also extend ClassA


        System.out.println(obj1.i);// i will have classA value, variable depends on left hand side which has been referenced
        obj1.display1();// method of classB will be called ,method depends on right hand side, whose object created

        ClassB obj2 = new ClassB();
        System.out.println(obj2.i);// i will have classB value
        obj2.display1();

        //ClassA obj3 = new ClassA();
        //System.out.println(obj3.i);// i will have classA value

        //not possible since classA don't have info of classB
       /* ClassB obj3 = new ClassA();
        System.out.println(obj1.i);*/



    }

}
