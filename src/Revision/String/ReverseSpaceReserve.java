package Revision.String;

import java.util.ArrayList;
import java.util.List;


public class ReverseSpaceReserve {

    public static void main(String[] args)
    {
        String input = "My  Name  Is  Anurag";// sample input1 one space common
        String input1 = "My Name  Is   Anurag";//sample input1 ,space increament by 1 between each words
        String input3  = "My   Name Is    Anurag"; //sample input3, inconsistent space

        //will not  work if space is inconsistent as it will split with one space and remaining space concatenate with word ,
        // but by this way extra space will add at end we have to trim at end so try by another way

        reverseStringSpaceRetain(input3);
        reverseStringSpaceRetainConventionalWay(input1);

        //Recommended Way
        retainSpaceStringReverseOpt(input);

    }
    public static void reverseStringSpaceRetain(String input1)
    {
        System.out.println("\nOutput By StringBuilder Way : ");
        String[] arrayInput = input1.split(" ");
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

    public static void reverseStringSpaceRetainConventionalWay(String input1)
    {
        System.out.println("\n\nOutput By conventional Way");
        String[] arrayInput = input1.split(" ");
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
            System.out.print(rev+" ");//yM
            //System.out.println();
        }
        System.out.print("Reverse List Print:\n");
        reverseList.stream().forEach(s->System.out.print(s+"  "));
    }

    public static void retainSpaceStringReverseOpt(String input)
    {
        //Created List and store all index value of spaces in string
        List<Integer> indices = new ArrayList<>();
        for(int i =0;i<input.length();i++){
            if(input.charAt(i)==' '){
                indices.add(i);
            }
        }
        StringBuilder output = new StringBuilder();
        for (String s : input.split(" ")) {
            StringBuilder sb = new StringBuilder(s);
            output.append(sb.reverse());
        }
        for (int index : indices) {
            output.insert(index, " ");
        }
        System.out.println("\n\nRecommended Way = "+output);

    }

}
