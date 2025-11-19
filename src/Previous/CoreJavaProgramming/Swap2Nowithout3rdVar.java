package Previous.CoreJavaProgramming;

import java.util.Scanner;

public class Swap2Nowithout3rdVar {
    public static void main(String[] args)
    {
        System.out.print("Enter Number1 = ");
        Scanner sc= new Scanner(System.in);
        int number1 = sc.nextInt();
        System.out.print("Enter Number2 = ");
        int number2 = sc.nextInt();

        System.out.println("Original Numbers are : Number1 = "+number1 +" and Number2 = "+number2);

//        Enter Number1 = 12
//        Enter Number2 = 25

        number1 = number1 + number2;//37
        number2 = number1 - number2;//12
        number1 = number1 - number2;//25

        System.out.println("Swapped Numbers are : Number1 = "+number1+" and Number2 = "+number2);
    }

}
