package cp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SetBits {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> bits = new ArrayList<>();
        int count = 0;
        int rem;
        while(n != 1)
        {
            bits.add(n % 2);
            n = n /2;
        }
        bits.add(1);
        System.out.println(bits);
        for(int bit:bits)
        {
            if(bit == 1)
                count++;
        }
        System.out.println(count);
    }
}
