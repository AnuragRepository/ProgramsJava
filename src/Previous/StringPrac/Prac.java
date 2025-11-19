package StringPrac;

import java.util.Scanner;

public class Prac {

    public static void main(String[] args)
    {
       System.out.print("Type String = ");
       Scanner sc = new Scanner(System.in);
        String original=sc.nextLine();
       StringBuilder sb= new StringBuilder(original).reverse();

       if(sb.toString().equalsIgnoreCase(original))
       {
           System.out.println(original +" is a pallindrome number");
       }
       else {
           System.out.println(original +" is not a pallindrome number");
       }
    }


}
