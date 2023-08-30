package cp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HappyNumber {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean isHappy = false;

        if(n==1 || n == 7)
        {
            isHappy = true;
            System.out.println("Happy number");
        }


        int sum = 0;
        while(n > 9)
        {
            while(n != 0)
            {
                sum = (int) (sum + Math.pow(n % 10,2));
                n = n /10;
            }
            n = sum;

            System.out.println("sum "+sum);
            if(sum == 1 || sum == 7) {
                isHappy = true;
                System.out.println("Happy number");
                break;
            }
            else {
                sum = 0;
            }

        }

        if(isHappy == false)
        {
            System.out.println("not a happy number");
        }

    }
}
