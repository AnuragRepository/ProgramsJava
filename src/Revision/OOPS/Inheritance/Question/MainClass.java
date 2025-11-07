package Revision.OOPS.Inheritance.Question;

public class MainClass {

    public static void main(String[] args)
    {
        ClassA obj1 = new ClassB();// obj has class A reference and classB also extend ClassA
        System.out.println(obj1.i);// i will have classA value
        obj1.display1();

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
