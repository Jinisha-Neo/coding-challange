/*
* Given an array of distinct integers, shuffle it according to the given order of elements.
For example:
Input:
nums[] = { 1, 2, 3, 4, 5 }
pos[] = { 3, 2, 4, 1, 0 }

Output:

nums[] = { 5, 4, 2, 1, 3 }

i.e., if pos[i] = j, then update nums[j] = nums[i] for every index i.
In other words, update nums[pos[i]] = nums[i] for every index i.
* */


package coding_challange.src.cp;

import java.util.Scanner;

public class Shuffle {

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int nums[] = new int[n];
        int pos[] = new int[n];
        int ans[] = new int[n];
        int temp = 0;

        for(int i = 0; i < n; i++)
        {
            nums[i] = s.nextInt();
        }

        for(int i = 0; i < n; i++)
        {
            pos[i] = s.nextInt();
        }

        for(int i = 0; i< n; i++)
        {
            ans[pos[i]] = nums[i];
        }


        for(int i = 0; i < n; i++)
        {
            System.out.print(ans[i] + " ");
        }



    }
}
