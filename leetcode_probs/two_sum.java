
class Solution{
    public int[] twoSum(int[] nums, int target)
    {
        if(nums.length>=2)
        {
            HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
            for(int i=0;i<nums.length;i++)
            {
                if(!h.isEmpty()&&h.containsKey(target-nums[i]))
                {
                    int[] k={h.get(target-nums[i]),i};
                    return k;
                }
                h.put(nums[i],i);
            }
        }
        int[] k={-1,-1};
        return k;
    }
}
/**************************Hash Map**************************

import java.util.*;
public class two_sum
{
	public static void main(String[] args) {
		HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
		h.put(1,20);
		h.put(2,21);
		h.put(3,22);
		h.put(4,23);
		for(int i=1;i<=4;i++)
		{
		    System.out.println(h.get(i));
		}
	}
}


******************************************************************/