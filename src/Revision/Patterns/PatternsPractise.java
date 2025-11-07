package Revision.Patterns;

public class PatternsPractise {

    public static void main(String[] args)
    {
        PatternsPractise first = new PatternsPractise();
        first.pattern1();
        first.pattern2();
        first.pattern3();
        first.pattern4();
        first.pattern5();
        first.pattern6();
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
                System.out.print("*"+"\t");
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
                System.out.print(c+"\t");
                c++;
            }
            System.out.println("\n");
        }

    }
    public void pattern3()
    {
        System.out.println("Third Pattern One way ");
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
                System.out.print(c+"\t");
                c++;
            }
            col--;
            System.out.println("\n");
        }

        System.out.println("Third Pattern Second way ");
        //or col variable can be removed and column value can be extracted from row

        int a =1;
        for(int i =0; i<4;i++)
        {
            for(int j =0; j<4-i;j++)
            {
                System.out.print(a+"\t");
                a++;
            }
            System.out.println("\n");
        }


    }
    public void pattern4()
    {
        System.out.println("Forth Pattern ");
        //Approach = column elements num equal to row number
     /* 1
        2 3
        4 5 6
        7 8 9 10
        */
        int c =1;
        for(int i =0; i<4 ; i++)
        {
            for(int j=0; j<=i;j++)
            {
                System.out.print(c+"\t");
                c++;
            }
            System.out.println("\n");
        }

    }
    public void pattern5()
    {
        System.out.println("Fifth Pattern ");
        //Approach- rows equal to column element
       /*
        0
        0 1
        0 1 2
        0 1 2 3
        */

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(j+"\t");
            }
            System.out.println("\n");
        }

    }
    public void pattern6()
    {
        System.out.println("Sixth Pattern ");
        //Approach- rows equal to column element , element count start from 1 every time
         /*
        1
        1 2
        1 2 3
        1 2 3 4
        */

        for(int i=0;i<4;i++)
        {
            int c =1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(c+"\t");
                c++;
            }
            System.out.println("\n");
        }

    }
    
}
