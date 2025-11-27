package Revision.Notepad;

class ReverseWordSequence{

    public static void main(String[] args)
    {
        String input = "My  nameis      Anurag";
        //String output = "Anurag      nameis  My ";

        System.out.println("Input String = "+input);
        System.out.print("Output String = ");
        String[] word = input.split(" ");
        for(int i = word.length-1;i>=0;i--)
        {
            System.out.print(word[i]+" ");
        }

    }

}
