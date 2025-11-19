package Revision.String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class OccurenceConcat {

    public static void main(String[] args)
    {
        String input = "aabbcddab";
        //String output = "a3b3c1d2";

        //Use LinkedHashMap for maintaining insertion order as we are concatenating key ,valie
        //HashMap may not always maintain insertion order

        LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<Character,Integer>();
        int count =0;
        for(int i=0;i<input.length();i++)
        {
            if(lhm.get(input.charAt(i))==null)
            {
                lhm.put(input.charAt(i),1);
            }
            else {
                count = lhm.get(input.charAt(i));
                count++;
                lhm.put(input.charAt(i),count);
            }
        }
        System.out.println(lhm.entrySet());

        Set<Map.Entry<Character,Integer>> entrySet = lhm.entrySet();

        for(Map.Entry<Character,Integer> hm1: entrySet)
        {
            System.out.print(hm1.getKey().toString().concat(hm1.getValue().toString()));
        }
    }
}
