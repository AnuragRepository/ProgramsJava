package Previous.PractiseDraft;

import java.util.HashMap;

public class Occurencestr {

    public static void main(String[] args)
    {
        String input = "My Name Is Anurag";

        occurence(input);
    }
    public static void occurence(String input)
    {
        int count = 0;
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

        for(int i = 0 ; i<input.length();i++)
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

    }




}
