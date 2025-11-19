package Previous.CoreJavaProgramming;

import java.util.Scanner;

public class PallindromeNumber {

    static int enteredNumber,reverse;

    public void enterNumber()
    {
        System.out.print("Enter Number = ");
        Scanner sc= new Scanner(System.in);
        enteredNumber = sc.nextInt();
        System.out.println("Entered Number = " +enteredNumber);
    }

    public static void reverseNumber()
    {
       int rem;
       int temp= enteredNumber;
       while(temp!=0)
       {
         rem= temp%10;//1//2//1
         reverse= reverse*10+ rem;//1//2//3
         temp=temp/10;//12//
       }
        System.out.println("Reverse number= "+reverse);
    }

    public static void verifyPallindrome()
    {
         if (reverse==enteredNumber)
         {
             System.out.println(enteredNumber+" is a pallindrome number");
         }
         else {
             System.out.println(enteredNumber+" is not a pallindrome number");
         }
    }


    public static void main (String [] args)
    {
        PallindromeNumber obj= new PallindromeNumber();
        obj.enterNumber();
        reverseNumber();
        verifyPallindrome();
    }

}
