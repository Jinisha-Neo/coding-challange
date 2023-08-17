/*Given an integer array having distinct elements, find the surpasser count for each element in it. In other words, for each array element, find the total number of elements to its right, which are greater than it.
For example:
Input:  { 4, 6, 3, 9, 7, 10 }

Output: { 4, 3, 3, 1, 1, 0 }
* */
package cp;

import java.util.Scanner;

public class Surpasser {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int ans[] = new int[n];
        int count = 0;

        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }

        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n; j++)
            {
                if(arr[i] < arr[j])
                {
                    count++;
                }
            }
            ans[i] = count;
            count = 0;
        }

        for(int i = 0; i < n; i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
