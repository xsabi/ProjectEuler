import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            long n = in.nextLong();
            long p = 1, q = 1, r = 0, s = 0;
            while (p + q <= n) {
                r = p + q;
                p = q;
                q = r;
                if (r % 2 == 0) s += r;
            } 
            System.out.println(s);
        }
    }
}