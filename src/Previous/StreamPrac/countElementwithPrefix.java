package Previous.StreamPrac;

import java.util.stream.Stream;

public class countElementwithPrefix {

    public static void main(String[] args)
    {
      long count=  Stream.of("Anurag", "akanksha", "Saaya","Anjali").filter(

                s->s.startsWith("A")||s.startsWith("a")

        ).count();

        System.out.println("Elements with prefix A or a are = "+count);
    }


}
