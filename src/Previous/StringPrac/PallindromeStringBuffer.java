package StringPrac;

import java.util.Scanner;

public class PallindromeStringBuffer {

    public static void main(String[] args)
    {
        System.out.print("Enter String = ");
        Scanner sc= new Scanner(System.in);
        String original=sc.nextLine();

        StringBuffer sb= new StringBuffer(original).reverse();

        if(original.equalsIgnoreCase(sb.toString()))
        {
            System.out.println(original +" is a pallindrome number");
        }
        else {
            System.out.println(original +" is not a pallindrome number");
        }



    }

}
