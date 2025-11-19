package Revision.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OccurenceCharacters {

    public static void main(String[] args)
    {
        String input = "I want to work at Capgemini &*()@#$@ @ &";

        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        int count =0;
        for(int i =0; i<input.length();i++)
        {
            if(hm.get(input.charAt(i))==null)
            {
                hm.put(input.charAt(i),1);
            }
            else {

                count = hm.get(input.charAt(i));
                count++;
                hm.put(input.charAt(i),count);

            }
        }
        System.out.println(hm.entrySet());

        Set<Map.Entry<Character,Integer>> entrySet = hm.entrySet();

        System.out.println("Duplicate Elements are ");
        for(Map.Entry<Character,Integer> hm1 : entrySet)
        {
            if(hm1.getValue()>1)
            {
                System.out.print(hm1.getKey()+" ");
            }
        }
    }


}
