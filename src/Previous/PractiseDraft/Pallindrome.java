package Previous.PractiseDraft;

import java.util.Scanner;

public class Pallindrome {

    public static void main(String[] args)
    {
        System.out.println("Enter String = ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        pallindrome(input);
    }

    public static void pallindrome (String input)
    {
        StringBuilder sb = new StringBuilder(input).reverse();
        if(input.equalsIgnoreCase(sb.toString()))
        {
            System.out.println(input+" is pallindrome number");
        }
        else {
            System.out.println(input+" is not a pallindrome number");
        }
    }

}
