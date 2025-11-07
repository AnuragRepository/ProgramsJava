package Previous.ArrayPrac;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args)
    {
        int originalarray[] = {45, 12, 45, 0, 5, 1, 77, 77, 45, 0, 5, 1, 1110, 777, 777};

        Arrays.stream(originalarray).sorted().forEach(s->System.out.print(s+" "));

    }

}
