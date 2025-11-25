package Revision.Notepad;

import java.util.ArrayList;
class Duplicate{

    public static void main(String[] args)
    {
        int [] arrayInput = {55,77,22,55,99,99,99,1,0,8,8,77};
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i =0; i<arrayInput.length;i++)
        {
            for(int j =i+1; j<arrayInput.length;j++)
            {
                if(arrayInput[i]==arrayInput[j])
                {
                    if(!al.contains(arrayInput[i]))
                    {
                        al.add(arrayInput[i]);
                        System.out.print(arrayInput[i]+" ");
                    }

                }
            }

        }
        System.out.println("\nDuplicate Elements are ");
        al.stream().forEach(s->System.out.print(s+" "));
    }

}
