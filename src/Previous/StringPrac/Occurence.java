package StringPrac;

import java.util.HashMap;

public class Occurence {

    public static void main(String[] args)
    {
        String s = "anurag";
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(hm.get(s.charAt(i))==null)//if input hm.get(i), output all character with occurrence 1
            {
                hm.put(s.charAt(i),1);
            }
            else
            {
                count= hm.get(s.charAt(i));
                count++;
                hm.put(s.charAt(i),count);

            }
        }
       System.out.println(hm.entrySet());


    }

}
