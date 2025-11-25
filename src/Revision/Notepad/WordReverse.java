package Revision.Notepad;

import java.util.ArrayList;
class WordReverse{

    public static void main(String[] args)
    {
        String input = "My name is Anurag";
        //String output = "yM eman si garunA";

   /*  1. Store space in spacelist
       2. split with space and store in arrayString
       3. Reverse each splitted word from arrayString with help of stringBuilder and store all word in another output StringBuilder
       4. insert stored space of spacelist in output StringBuilder */

        System.out.println("Input String = "+input);

        ArrayList<Integer> spaceList = new ArrayList<Integer>();
        for(int i =0;i<input.length();i++)
        {
            if(input.charAt(i)==' ')
            {
                spaceList.add(i);
            }
        }
        System.out.print("Space index of input string = ");
        spaceList.stream().forEach(s->System.out.print(s+" "));

        String[] word = input.split(" ");

        StringBuilder output = new StringBuilder();
        for(int i=0;i<word.length;i++)
        {
            StringBuilder sb = new StringBuilder(word[i]).reverse();
            output.append(sb);

        }
        for(int index: spaceList)
        {
            output.insert(index," ");
        }
        System.out.println("\nOutput String = "+output);

    }


}