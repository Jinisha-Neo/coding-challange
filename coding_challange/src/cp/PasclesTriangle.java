
/*     1
      1 1
     1 2 1
    1 3 3 1
   1 4 6 4 1
  1 5 10 10 5 1
 1 6 15 20 15 6 1
* */
package cp;

import java.util.Scanner;

public class PasclesTriangle {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            int no = 1;
            for (int k = 1; k <= i; k++) {

                System.out.print(no + " ");
                no = no * (i - k) / k;
            }
            System.out.println();
        }
    }
}
