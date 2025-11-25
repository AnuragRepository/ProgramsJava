package Revision.Notepad;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
class Occurence{

    public static void main(String[] args)
    {
        String input = "anurag *&**%^,,";
        int count =0;
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i =0; i<input.length();i++)
        {
            if(hm.get(input.charAt(i))==null)
            {
                hm.put(input.charAt(i),1);
            }
            else
            {
                count = hm.get(input.charAt(i));
                count++;
                hm.put(input.charAt(i),count);
            }
        }
        System.out.println(hm.entrySet());

        Set<Map.Entry<Character,Integer>> hm1 = hm.entrySet();
        for(Map.Entry<Character,Integer> entry : hm1)
        {
            if(entry.getValue()>0)
            {
                System.out.println(entry.getKey()+" occurs for "+entry.getValue());
            }

        }
    }

}
