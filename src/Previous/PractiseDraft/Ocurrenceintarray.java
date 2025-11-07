package Previous.PractiseDraft;

import java.util.HashMap;

public class Ocurrenceintarray {

    public static void main(String[] args)
    {
        int input[] = {10, 30, 10, 30, 30, 30 ,10, 5, 0, -1, -1, 4};
        occurence(input);
    }
    public static void occurence(int input[])
    {
        int count = 0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<input.length;i++)
        {
            if(hm.get(input[i])==null)
            {
                hm.put(input[i],1);
            }
            else
            {
               count = hm.get(input[i]);
               count++;
               hm.put(input[i],count);

            }
        }
        System.out.println(hm.entrySet());

    }



}
