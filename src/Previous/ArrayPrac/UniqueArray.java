package Previous.ArrayPrac;

import java.util.Arrays;

public class UniqueArray {

    public static void main(String[] args)
    {
        int originalArray []= {45, 12, 45, 0, 5, 1, 77, 77, 45, 0, 5, 1, 1110, 777, 777};

        Arrays.stream(originalArray).distinct().forEach(s->System.out.print(s+" "));
    }

}
