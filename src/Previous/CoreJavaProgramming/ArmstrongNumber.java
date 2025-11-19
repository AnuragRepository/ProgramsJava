package Previous.CoreJavaProgramming;

import java.util.Scanner;

public class ArmstrongNumber {

    static  int enteredNumber,sumofDigitsCube =0;
    public void enterNumber()
    {
        System.out.print("Enter Number = ");
        Scanner sc = new Scanner(System.in);
        enteredNumber=sc.nextInt();
    }
    public static void summationCubeDigit()
    {
         int temp= enteredNumber,rem;
         while (temp!=0)
         {
             rem = temp % 10;
             sumofDigitsCube= sumofDigitsCube+ (rem*rem*rem);
             temp=temp/10;
         }
         System.out.println("Summation of cube of digits of "+enteredNumber+"= "+sumofDigitsCube);
    }
    public  static void verifyArmstrong()
    {
        if(sumofDigitsCube == enteredNumber)
        {
            System.out.println(enteredNumber+" is a armstrong number");
        }
        else
        {
            System.out.println(enteredNumber+" is not armstrong number");
        }
    }

    public static void main(String[] args)
    {
        ArmstrongNumber obj= new ArmstrongNumber();
        obj.enterNumber();
        summationCubeDigit();
        verifyArmstrong();

    }

}
