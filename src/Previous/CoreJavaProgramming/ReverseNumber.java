package Previous.CoreJavaProgramming;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args)
    {
        System.out.print("Enter element = ");
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        int temp,rem=0,reverse=0;
        temp=number;
        while(temp!=0)
        {
            rem=temp%10;// 1//3//5//1
            reverse= reverse*10+rem;//1/13//135//1351
            temp=temp/10;//153//15//1
        }
        System.out.println("Reverse of " +number +"= "+reverse);

    }

}
