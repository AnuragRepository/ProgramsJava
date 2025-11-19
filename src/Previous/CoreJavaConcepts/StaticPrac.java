package Previous.CoreJavaConcepts;
public class StaticPrac {

    static int stvar=0;


    public static void main(String [] args)
    {
        int nonstvar=0;
        StaticPrac obj1= new StaticPrac();
        StaticPrac obj2= new StaticPrac();

        StaticPrac.stvar++;
        //obj1.non-- unable to use



    }

}
