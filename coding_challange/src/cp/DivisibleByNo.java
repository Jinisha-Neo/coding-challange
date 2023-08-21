/*Given non-zero two integers N and M. The problem is to find the number closest to N and divisible by M. If there are more than one such number, then output the one having maximum absolute value.


Example 1:

Input:
N = 13 , M = 4
Output:
12
Explanation:
12 is the Closest Number to
13 which is divisible by 4.
Example 2:

Input:
N = -15 , M = 6
Output:
-18
Explanation:
-12 and -18 are both similarly close to
-15 and divisible by 6. but -18 has
the maximum absolute value.
So, Output is -18
* */
package cp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class Pair{
    int no;
    boolean div;

    Pair(int no, boolean div)
    {
        this.no = no;
        this.div = div;
    }

    public boolean isDiv() {
        return div;
    }

    public int getNo() {
        return no;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "no=" + no +
                ", div=" + div +
                '}';
    }
}
public class DivisibleByNo {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = Math.abs(s.nextInt());
        int m = s.nextInt();
        ArrayList<Pair> arr = new ArrayList<Pair>();
        int j = 0;

        for(int i = (n - m); i < (n+m); i++)
        {
            if(i % m == 0)
            {
                arr.add(new Pair(i,true));
            }
            else {
                arr.add(new Pair(i,false));
            }
        }
        int start = 0;
        int end = 0;
        int target = 0;


        for(int i = 0; i < arr.size(); i++)
        {
            if(arr.get(i).getNo() == n)
            {
                target = i;
            }
            if(arr.get(i).isDiv())
            {
                start = i;
                break;
            }
        }

        for(int i = start+1; i < arr.size(); i++)
        {
            if(arr.get(i).getNo() == n)
            {
                target = i;
            }
            if(arr.get(i).isDiv())
            {
                end = i;
                break;
            }
        }
//        System.out.println(arr.get(start)+" "+start);
//        System.out.println(arr.get(end)+" "+end);
//        System.out.println(arr.get(target)+" "+target);
//        System.out.println((Math.abs(target - start)) > Math.abs(target - end));

        if((Math.abs(target - start)) < Math.abs(target - end))
        {
            System.out.println(arr.get(start).getNo());
        }
        else if(Math.abs(target - start) == Math.abs(target - end))
        {
            System.out.println(Math.max(arr.get(start).getNo(),arr.get(end).getNo()));
        }


    }
}
