package Revision.String;

import java.util.ArrayList;

public class ReverseSpaceRetainPrac {

    public static void main(String[] args)
    {
        String reqInput1 =     "My       Name Is  Anurag";
        String reqOutput1 =    "yM       emaN sI  garunA";

        String reqInput2 =     "My Name Is Anurag";
        String reqOutput2 =    "yM emaN sI garunA";

        String reqInput3 =     "My  Name  Is  Anurag";
        String reqOutput3 =    "yM  emaN  sI  garunA";

        reverseSpaceRetain(reqInput1);
        reverseSpaceRetain(reqInput2);
        reverseSpaceRetain(reqInput3);
    }

    public static void reverseSpaceRetain(String reqInput)
    {
         /*   Note - multiple consecutive delimiter will produce empty string in spliting with that delimiter
        Step 1 - Find index of each space in string and store space indexes in list of integer
        Step 2 - Split the string with empty space ,store element in array.
        Step 3 - Reverse each element and concat it
        Step 4 - insert the space indexes with space character in reversed string    */

        ArrayList<Integer> spaceIndexesList = new ArrayList<Integer>();
        for(int i=0;i<reqInput.length();i++)
        {
            if(reqInput.charAt(i) == ' ')
            {
                spaceIndexesList.add(i);
            }
        }
        String[] splittedStringArray = reqInput.split(" ");

        StringBuilder output = new StringBuilder();
        for(String s:splittedStringArray)
        {
            StringBuilder sb = new StringBuilder(s);
            //output = sb.append(s).reverse();
            output.append(sb.reverse());
            //System.out.println(output);

        }
        System.out.println("ReversedStringWithoutSpaces :\n"+output);

        for(int spaceIndices:spaceIndexesList)
        {
            output.insert(spaceIndices," ");
            //System.out.println(output);
        }
        System.out.println("ReversedStringWithSpaces :\n"+output);
        System.out.println("\n");
    }




}






