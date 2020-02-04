import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            long gpf = in.nextLong();
            long d = 1;
            while (d * d <= gpf) {
                if (gpf % ++d == 0) {
                    gpf /= d;
                    d = 1;
                }
            }
            System.out.println(gpf);
        }
    }
}