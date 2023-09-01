/*Given two strings S1 and S2 in lowercase, the task is to make them anagram. The only allowed operation is to remove a character from any string. Find the minimum number of characters to be deleted to make both the strings anagram. Two strings are called anagram of each other if one of them can be converted into another by rearranging its letters.

Example 1:

Input:
S1 = bcadeh
S2 = hea
Output: 3
Explanation: We need to remove b, c
and d from S1.
Example 2:

Input:
S1 = cddgk
S2 = gcd
Output: 2
Explanation: We need to remove d and
k from S1.




* */
package cp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakeAnagram {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        char sa1 [] = s1.toCharArray();
        char sa2 [] = s2.toCharArray();


        if(sa1.length > sa2.length)
        {
            for (int i = 0; i < sa1.length; i++) {
                for (int j = 0; j < sa2.length; j++) {
                    if (sa1[i] == sa2[j]) {
                        sa1[i] = '0';
                        sa2[j] = '0';
                    }
                }
            }
            System.out.println("Remove these from characters string");
            for(int i = 0; i < sa1.length;i++)
            {
                if(sa1[i] != '0')
                    System.out.print(sa1[i]+" ");
            }
        }
        else {
            for (int i = 0; i < sa2.length; i++) {
                for (int j = 0; j < sa1.length; j++) {
                    if (sa1[i] == sa2[j]) {
                        sa1[i] = '0';
                        sa2[j] = '0';
                    }
                }
            }
            System.out.println("Remove these from characters string");
            for(int i = 0; i < sa2.length;i++)
            {
                if(sa2[i] != '0')
                    System.out.print(sa2[i]+" ");
            }
        }


    }
}
