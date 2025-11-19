package Previous.StreamPrac;

public class StringCreateWays {

   //1. //String literal
    //In this case only 1 object will create, no separate memory will be allocated for s1 as s already has same value
    String s = "Anurag";
    String s1 = "Anurag";

    String s2 =" Anu";   // In this 1 more object will create as no string having Anu value

    //2.//By new
    // 2 object will be created with separate memory since we are creating via new even though same value
    String s3 = new String ("Janu");
    String s4 = new String ("Janu");

}
