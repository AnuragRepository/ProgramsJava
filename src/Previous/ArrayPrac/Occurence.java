package Previous.ArrayPrac;

import java.util.HashMap;

public class Occurence {

    public static void main(String[] args)
    {
        int originalArray[] =  {45, 12, 45, 0, 5, 1, 77, 77, 45, 0, 5, 1, 1110, 777, 777};

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int count=0;
        for(int i=0;i<originalArray.length;i++)
        {
            if(hm.get(originalArray[i])==null)
            {
                hm.put(originalArray[i],1);
            }
            else
            {
               count = hm.get(originalArray[i]);
               count++;
               hm.put(originalArray[i],count);
            }
        }
        System.out.print(hm.entrySet());

    }

}
