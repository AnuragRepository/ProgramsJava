package Revision.OOPS.Polymorphism;

public class Overloading {

    //Concept - Multiple methods with same name but different argument number or argument datatype

    public static void main(String[] args)
    {
        payment(5);
        payment(2,6);
        payment(9,"UPI");
    }

    public static void payment(int credit_card, int debit_card)
    {
        System.out.println("Credit card and debit card with Integer data type");
    }
    public static void payment(int credit_card)
    {
        System.out.println("Credit card with Integer data type");
    }
    public static void payment(int credit_card,String debit_card)
    {
        System.out.println("Credit card and debit card with Integer,String data type");
    }

}
