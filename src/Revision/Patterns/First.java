package Revision.Patterns;

public class First {

    public static void main(String[] args)
    {
        First first = new First();
        first.pattern1();
        first.pattern2();
        first.pattern3();
    }
    public void pattern1() {

      /*  ****
          ****
          ****
          ****
      */
        System.out.println("First Basic Pattern ");
        for (int i = 0; i < 4; i++)
        {
            for(int j=0; j<4;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println("\n");
        }

    }

    public void pattern2()
    {
        System.out.println("Second Pattern ");
     /*   1 2 3 4
          5 6 7 8
          9 10 11 12
          13 14 15 16
     */
        int c =1;
        for(int i =0; i<4;i++)
        {

            for(int j =0; j<4;j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println("\n");
        }

    }
    public void pattern3()
    {
        System.out.println("Third Pattern ");
        //Approach First think for pattern1 then pattern2 then conclude pattern3
    /*    1 2 3 4
          5 6 7
          8 9
          10
     */
        int c =1;
        int col =4;
        for(int i =0; i<4;i++)
        {
            for(int j =0; j<col;j++)
            {
                System.out.print(c+" ");
                c++;
            }
            col--;
            System.out.println("\n");
        }

    }






}
