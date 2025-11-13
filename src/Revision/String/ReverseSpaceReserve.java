package Revision.String;

import java.util.ArrayList;


public class ReverseSpaceReserve {

    public static void main(String[] args)
    {
        String input = "My Name Is Anurag";
        System.out.println("Original String = "+input);
        String output= "yM emaN sI garunA";
        reverseStringSpaceRetain(input);
    }
    public static void reverseStringSpaceRetain(String input)
    {
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

}
