package StringPrac;

import java.net.StandardSocketOptions;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurence2 {

    public static void main(String[] args)
    {
        System.out.println("Enter String = ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();// ANURAG
        HashMap<Character,Integer> hm  = new HashMap<>();
        int count =0;
        for(int i=0;i<input.length();i++)
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

        for(Map.Entry<Character,Integer> Entry:hm.entrySet())
        {
          System.out.println("Occurence of "+Entry.getKey() +" is "+Entry.getValue());
        }
        System.out.print("Ocurrence of ");
        System.out.print(hm.keySet()+" ");
        System.out.print("are ");
        System.out.println(hm.values()+" ");

    }


}
