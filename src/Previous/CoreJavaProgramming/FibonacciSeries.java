package Previous.CoreJavaProgramming;

public class FibonacciSeries {

    public static void main(String[] args)
    {
        //0 1 1 2 3 5
        int sum = 0;
        int a = 0;
        int b = 1;
        int count=0;
        System.out.print(a+" "+b+" ");

        while(count< 10)
        {
            sum = a + b;
            a = b;
            b = sum;

            System.out.print(sum+" ");
            count++;
        }

    }


}
