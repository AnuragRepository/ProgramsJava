package Previous.StreamPrac;

import java.util.Arrays;

public class IntegerArrayUniqueSorted {

    public static void main(String[] args)
    {
        //WAP to print unique number in integer array and sort it

        int a[]={0, 3, 1,0, 6, 8, 90, 0, 3, 1, 1, 1, 90};

        Arrays.stream(a).distinct().sorted().forEach(s->System.out.print(s+" "));

    }


}
