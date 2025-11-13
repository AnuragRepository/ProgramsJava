package Revision.String;

import java.util.ArrayList;


public class ReverseSpaceReserve {

    public static void main(String[] args)
    {
        String input = "My Name Is Anurag";
        System.out.println("Original String = "+input);
        String output= "yM emaN sI garunA";
        reverseStringSpaceRetain(input);
        reverseStringSpaceRetainConventionalWay(input);
    }
    public static void reverseStringSpaceRetain(String input)
    {
        System.out.println("\nOutput By StringBuilder Way : ");
        String[] arrayInput = input.split(" ");
        ArrayList<String> reverseList = new ArrayList<String>();
        System.out.print("Reversed String = ");
        for(int i = 0; i<arrayInput.length;i++)
        {
            StringBuilder sb = new StringBuilder(arrayInput[i]).reverse();// need to optimize since we are creating new object in every loop iteration
            System.out.print(sb+" ");
            reverseList.add(sb.toString());
        }
        System.out.print("\nReversed List = ");
        reverseList.stream().forEach(s->System.out.print(s+" "));
    }

    public static void reverseStringSpaceRetainConventionalWay(String input)
    {
        System.out.println("\n\nOutput By conventional Way");
        String[] arrayInput = input.split(" ");
        ArrayList<String> reverseList = new ArrayList<String>();
        System.out.print("Reversed String  = \n");
        for(int i = 0; i<arrayInput.length;i++)
        {
            String rev="";
            for(int j= arrayInput[i].length()-1;j>=0;j--)
            {
                 rev = rev+ arrayInput[i].charAt(j);
            }
            reverseList.add(rev);
            System.out.print(rev);
            System.out.println();
        }
        System.out.print("Reverse List Print:\n");
        reverseList.stream().forEach(s->System.out.print(s+" "));

    }
}
