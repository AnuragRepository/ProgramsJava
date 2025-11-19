package Previous.CoreJavaProgramming;

import java.util.Scanner;

public class Swap2Nousing3rdVar {

    public static void main(String[] args)
    {
        System.out.print("Enter Number1 = ");
        Scanner sc= new Scanner(System.in);
        int number1 = sc.nextInt();
        System.out.print("Enter Number2 = ");
        int number2 = sc.nextInt();

        int temp = 0;

        System.out.println("Original Numbers are : Number1 = "+number1 +" and Number2 = "+number2);

        temp= number1;
        number1=number2;
        number2=temp;

        System.out.println("Swapped Numbers are : Number1 = "+number1+" and Number2 = "+number2);

    }


}
