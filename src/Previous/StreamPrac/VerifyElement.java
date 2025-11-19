package Previous.StreamPrac;

import java.util.stream.Stream;

public class VerifyElement {

    public static void main(String[] args)
    {
      boolean flag= Stream.of("Anurag","Saya","Master").anyMatch(s->s.equalsIgnoreCase("Master" ));

      System.out.println("Is Master present in list = "+flag);

    }

}
