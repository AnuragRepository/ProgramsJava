package StringPrac;

import java.util.Scanner;

public class StringPallindrome2 {

    public static void main(String[] args)
    {
        System.out.print("Enter String = ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Entered String = " +input);
        checkPallindrome(input);
    }
    public static void checkPallindrome(String input)
    {
        StringBuffer sb = new StringBuffer(input).reverse();
        System.out.println("Reversed String = "+sb);
        if(input.equalsIgnoreCase(sb.toString())) {
            System.out.println(input + " is a pallindrome number");
        }
        else {
            System.out.println(input + " is not a pallindrome number");
        }

    }



}
