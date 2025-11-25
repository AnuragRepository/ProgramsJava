package Revision.Notepad;

    class Swap{

        public static void main(String[] args)
        {
            int a = 10;
            int b = 20;
            swapUsingAnotherVariable(a,b);
            swapWithoutUsingAnotherVariable(a,b);

        }
        public static void swapUsingAnotherVariable(int a, int b) {

            int temp;
            System.out.println("a = "+a+" and b = "+b);

            temp =a;
            a =b;
            b = temp;

            System.out.println("a = "+a+" and b = "+b);

        }

        public static void swapWithoutUsingAnotherVariable(int a, int b)
        {
            System.out.println("a = "+a+" and b = "+b);
            a = a+b;// 30
            b = a-b;// 10
            a = a-b;//20
            System.out.println("a = "+a+" and b = "+b);
        }

    }

