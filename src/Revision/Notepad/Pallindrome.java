package Revision.Notepad;

    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

    class Pallindrome {
        public static void main(String[] args) {

            String input = "anurag";
            StringBuilder sb = new StringBuilder(input).reverse();
            System.out.println("Reverse of "+input+ " = "+sb);
            if(sb.toString().equalsIgnoreCase(input))
            {
                System.out.println(input+" is a pallindrome number");
            }
            else
            {
                System.out.println(input+" is not a pallindrome number");
            }

        }
    }
