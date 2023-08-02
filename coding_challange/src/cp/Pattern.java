/*
* Write code to print all combinations of positive integers in increasing order that sum to a given positive number.
For Example:
Input:  N = 3

1 1 1
1 2
3

Input:  N = 4

1 1 1 1
1 1 2
1 3
2 2
4

Input:  N = 5

1 1 1 1 1
1 1 1 2
1 1 3
1 2 2
1 4
2 3
5
*
* */
package coding_challange.src.cp;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pattern {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        findCombinations(n);
    }

    public static void findCombinations(int sum)
    {

        int[] nums = new int[sum];

        int starting_index = 0;
        printCombinations(nums, starting_index, sum, sum);
    }
    public static void printCombinations(int[] nums, int i, int sum, int sum_left)
    {

        int prev_num = (i > 0) ? nums[i - 1] : 1;
        for (int k = prev_num; k <= sum; k++)
        {
            nums[i] = k;

            if (sum_left > k) {
                printCombinations(nums, i + 1, sum, sum_left - k);
            }

            if (sum_left == k)
            {
                System.out.println(Arrays.stream(nums).limit(i + 1).boxed()
                        .collect(Collectors.toList()));
            }
        }
    }
}
