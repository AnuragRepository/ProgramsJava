package Previous.CoreJavaProgramming;

import java.util.Scanner;

public class SumOfDigits {

    static int enteredNumber;
    public void enterNumber()
    {
        System.out.print("Enter Number = ");
        Scanner sc= new Scanner(System.in);
        enteredNumber=sc.nextInt();
        System.out.println("Entered Number = "+enteredNumber);
    }
    public static void sumofDigits()
    {
        int sum=0, rem;
        int temp=enteredNumber;
        while(temp!=0)
        {
            rem=temp % 10;//3//5//3
            sum= sum + rem;//3//8//1
            temp = temp/10;//35//3
        }
        System.out.println("Sum of Digits of " +enteredNumber +" is = " +sum);
    }



    public static void main(String[] args)
    {
        SumOfDigits obj = new SumOfDigits();
        obj.enterNumber();
        sumofDigits();
    }

}
