package cp;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UglyNumber {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        Set<Integer> primeFactors = new HashSet<>();
        for(int i = 2; i <= n; i++)
        {
            if(n % i == 0)
            {
                primeFactors.add(i);

                n = n /i;
            }

        }
        System.out.println(primeFactors);
        if(primeFactors.isEmpty())
        {
            System.out.println("not ugly");
        }

        for(Integer i : primeFactors)
        {
            if(i > 5)
            {
                System.out.println("Not ugly number");
            }

        }
    }
}
