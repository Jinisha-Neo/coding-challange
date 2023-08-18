/*Given two circles C1 of radius R1 and C2 of radius R2,centered at (X1,Y1) and (X2,Y2) respectively.Find out whether they touch(at one or more than one points).

Example 1:

Input:
X1=3
Y1=4
R1=5
X2=14
Y2=18
R2=8
Output:
0
Explanation:
The circles centred at (3,4) and (14,18)
and having radii 5 and 8 respectively
do not touch each other.
Example 2:

Input:
X1=3
Y1=4
R1=5
X2=14
Y2=18
R2=18
Output:
1
Explanation:
The circles centred at (3,4) and (14,18)
and having radii 5 and 18 respectively
touch each other at two points.
* */

package cp;

import java.util.Scanner;

public class CircleIntersect {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        int r1 = s.nextInt();

        int x2 = s.nextInt();
        int y2 = s.nextInt();
        int r2 = s.nextInt();

        double c1c2 = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));

        if(c1c2 < (r1+r2))
        {
            System.out.println("Circle intersect with each other at two point");
        }
        else if(c1c2 == (r1+r2))
        {
            System.out.println("Circle touches each other");
        }
        else
        {
            System.out.println("Circles do not touch each other");
        }
    }
}
