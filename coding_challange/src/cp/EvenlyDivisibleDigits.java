/*Given a number N. Count the number of digits in N which evenly divides N.

Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.

Example 1:

Input:
N = 12
Output:
2
Explanation:
1, 2 both divide 12 evenly
Example 2:

Input:
N = 23
Output
0
Explanation:
2 and 3, none of them
divide 23 evenly
* */

package cp;

import java.util.Scanner;

public class EvenlyDivisibleDigits {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int rem;
        boolean isDivide = false;
        int temp = num;

        while(num > 0)
        {
            rem = num % 10;

            if(temp % rem == 0)
            {
                System.out.println(rem + " divides "+temp+" equally");
                isDivide = true;
            }
            num = num / 10;
        }

        if(isDivide == false){
            System.out.println("None of them divides equally");
        }
    }
}
