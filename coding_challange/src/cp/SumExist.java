package cp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SumExist {

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        int arr[] = new int[n];

        for(int j = 0; j < arr.length;j++)
        {
            arr[j] = s.nextInt();
        }

        Arrays.sort(arr);
        int left = 0;
        int right = n-1;

        while(left < right)
        {
            if(arr[left] + arr[right] == x)
               System.out.println("yes");
            else if(arr[left] + arr[right] < x)
                left++;
            else
                right--;
        }


    }
}
