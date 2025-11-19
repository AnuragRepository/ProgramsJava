package Previous.ArrayPrac;

public class SecondMaxArrayTrad {

    public static void main(String[] args)
    {
        int a[] = {45, 12, 45, 0, 5, 1, 77, 77, 45, 0, 5, 1, 1110, 777, 777};

        int max= a[0];
        int secondMax = 0;
        for(int i=0;i<a.length;i++)
        {
            secondMax=a[i];
            if(max<a[i])
            {
                max= a[i];
            }
        }


    }

}
