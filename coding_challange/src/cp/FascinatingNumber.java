/**
 * Given a number N. Your task is to check whether it is fascinating or not.
 * Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3, and when both these products are concatenated with the original number, then it results in all digits from 1 to 9 present exactly once.
 * Example 1:
 *
 *         Input:
 *         N = 192
 *         Output: Fascinating
 *         Explanation: After multiplication with 2
 *         and 3, and concatenating with original
 *         number, number will become 192384576
 *         which contains all digits from 1 to 9.
 *         Example 2:
 *
 *         Input:
 *         N = 853
 *         Output: Not Fascinating
 *         Explanation: It's not a fascinating
 *         number.
 */


package cp;

import java.util.Scanner;

public class FascinatingNumber {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int no =s.nextInt();

        String str = Integer.toString(no)+Integer.toString(no * 2)+Integer.toString(no * 3);

        if(str.contains("1") && str.contains("2") && str.contains("3") && str.contains("4") && str.contains("5") && str.contains("6")
                && str.contains("7") && str.contains("8") && str.contains("9"))
        {
            System.out.println("Fascinating number");
        }
        else
        {
            System.out.println("not a Fascinating number");
        }
    }
}
