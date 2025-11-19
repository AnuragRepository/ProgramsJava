package Previous.MasterQuest;

import java.util.ArrayList;
import java.util.List;

public class ArrayIndexFetch {

    public static void main(String[] args)
    {
      /*  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.

        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        Example 2:

        Input: nums = [3,2,4], target = 6
        Output: [1,2]
        Example 3:

        Input: nums = [3,3], target = 6
        Output: [0,1]


        Constraints:

        2 <= nums.length <= 104
                -109 <= nums[i] <= 109
                -109 <= target <= 109
        Only one valid answer exists.*/

        /*    int nums[]  = {3,2,4};
        int targetGiven = 6;*/

       /* int nums[]  = {3,3};
        int targetGiven = 6;*/

       /* int nums[] = {2,7,11,15};
        int targetGiven = 9;*/

        /*   int nums[]  = {11,2,15,7};
        int targetGiven = 9;*/

        int nums[]  = {2,11,15,7};int targetGiven = 9;
        List<Integer> index = arrayIndex(nums, targetGiven);
        System.out.println("ArrayIndices are "+index.get(index.size()-2)+","+index.get(index.size()-1)); //Print list elements either by size
        // Print list element either by foreach loop
       /* for(Integer indices: index)
        {
            System.out.print(indices+" ");
        }*/
    }
    public static List<Integer> arrayIndex(int[] num, int targetGiven)
    {
        int targetActual = 0;
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for(int k=0;k<num.length;k++)
        {
            for(int i=k+1;i<num.length;i++)
            {
                targetActual= num[k]+num[i];
                if(targetActual==targetGiven)
                {
                    ls.add(k);
                    ls.add(i);
                    break;
                }
            }
        }
        return ls;
    }



}
