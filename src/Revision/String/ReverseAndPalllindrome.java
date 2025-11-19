package Revision.String;

public class ReverseAndPalllindrome {

    public static void main(String[] args)
    {
        String input = "Anurag";
        String reverse ="";

        //using command iteration
        for(int i=input.length()-1;i>=0;i--)
        {
            reverse = reverse+input.charAt(i);
        }

        System.out.println("Reverse of "+input+" = "+reverse);

        if (input.equalsIgnoreCase(reverse))
        {
            System.out.println(input+" is a pallindrome number");
        }
        else {
            System.out.println(input+" is not a pallindrome number");
        }

        //using StringBuilder

        StringBuilder sbReverse = new StringBuilder(input).reverse();

        System.out.println("Reverse of "+input+" via StringBuilderClass = " +sbReverse);

        if (input.equalsIgnoreCase(sbReverse.toString()))
        {
            System.out.println(input+" is a pallindrome number");
        }
        else {
            System.out.println(input+" is not a pallindrome number");
        }
    }

}
