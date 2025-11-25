package Revision.Notepad;
    class PrimeList{

        public static void main(String[] args)
        {
            int[] a = {10, 9, 2, 7, 93, 0,121, 119, 140};
            for(int i =0; i<a.length;i++)
            {
                int div =0;
                int mid = a[i]/2;

                if(a[i] ==0 || a[i]==1)
                {
                    System.out.println(a[i] +" is not a prime number");
                }
                else
                {
                    for(int j =2; j<=mid ;j++)
                    {
                        if(a[i]%j==0)
                        {
                            div++;
                        }
                    }
                    if(div>=1)
                    {
                        System.out.println(a[i] +" is not a prime number");
                    }
                    else
                    {
                        System.out.println(a[i] +" is a prime number");
                    }
                }

            }

        }
    }
