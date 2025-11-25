package Revision.Notepad;



    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

    class Fibonacci {
        public static void main(String[] args) {

            // 0 1 1 2 3 5 8 13
            int a = 0;
            int b = 1;
            int sum;
            System.out.print(a+" "+b+" ");
            int i =0;
            while(i<6)
            {
                sum = a+b;
                System.out.print(sum+" ");
                a=b;
                b= sum;
                i++;
            }

        }
    }

