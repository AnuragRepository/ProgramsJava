package Previous.ArrayPrac;

public class MaxArrayTrad {

    public static void main(String[] args)
    {
        //int a[] = {45, 12, 45, 0, 5, 1, 77, 77, 45, 0, 5, 1, 1110, 777, 777};
        int a[] = {45, 12, 45, 0, 5, 1, 77,777,777,77, 45, 0, 5, 1, 1110};
        int max = a[0];
        int secondMax = 0;
        for(int i=0;i<a.length;i++)
        {
            secondMax = a[i];
            if(max<a[i])
            {
                max= a[i];
            }
        }
        System.out.println("Max element in array = "+max);
        System.out.println("Second Max element in array = "+secondMax);
    }

}
