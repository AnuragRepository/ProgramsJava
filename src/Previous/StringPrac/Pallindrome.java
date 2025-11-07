package StringPrac;

import java.util.Scanner;

public class Pallindrome {

    static String enteredString,reversedString="";

    public void enterString()
    {
        System.out.print("Enter string = ");
        Scanner sc= new Scanner(System.in);
        enteredString = sc.nextLine();
        System.out.println("Entered String = " +enteredString);
    }

    public void stringreversal()
    {
        for(int i=enteredString.length()-1;i>=0;i--)
        {
            reversedString = reversedString + enteredString.charAt(i);
        }
        System.out.println("Reversed String = " +reversedString);
    }
    public static void verifyPallindrome()
    {
        if (enteredString.equalsIgnoreCase(reversedString))
        {
            System.out.println(enteredString +" is a pallindrome number");
        }
        else
        {
            System.out.println(enteredString +" is not a pallindrome number");
        }
    }

    public static void main(String [] args)
    {
        Pallindrome obj = new Pallindrome();
        obj.enterString();
        obj.stringreversal();
        verifyPallindrome();
    }

}
