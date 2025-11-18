package Revision.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordSequence {

    public static void main(String[] args)
    {
        String reqInput = "My Name Is Anurag";
        String reqOutput= "Anurag Is Name My";

        //Convert String to Array using split
        //Convert Array to List
        List<String> list = Arrays.asList(reqInput.split(" "));

        //original List
        list.stream().forEach(s->System.out.print(s+" "));

        //reverse
        Collections.reverse(list);

        //reversed List
        list.stream().forEach(s->System.out.print(s+" "));









    }


}
