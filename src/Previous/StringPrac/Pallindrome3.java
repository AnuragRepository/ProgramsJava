package StringPrac;

import java.util.Scanner;

public class Pallindrome3 {

    public static void main(String[] args)
    {
        System.out.print("Input String = ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Inputed String = "+s);
        StringBuilder sb = new StringBuilder(s).reverse();

        if(sb.toString().equalsIgnoreCase(s))
        {
            System.out.println(s+" is a pallindrome number");
        }
        else {
            System.out.println(s+" is not a pallindrome number");
        }

    }



}
