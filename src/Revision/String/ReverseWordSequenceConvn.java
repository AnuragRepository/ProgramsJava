package Revision.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordSequenceConvn {

    public static void main(String[] args)
    {
        String reqInput = "My   Name Is Anurag";
        System.out.println(reqInput);
        String reqOutput= "Anurag Is Name   My";

        //This space will work in case on non consistent spaces as well
        String[] words = reqInput.split(" ");
        for(int i = words.length-1;i>=0;i--) {
            System.out.print(words[i]+" ");
        }














    }


}
