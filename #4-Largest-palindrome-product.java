import java.util.*;

public class Solution {

    public static boolean isProduct(int number) {
        int div = 999;
        while (div > 99 && number / div < 1000) {
            if (number % div == 0 && number / div > 99) return true;
            div--;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            boolean found = false;
            int head = n / 1000;
            String palindrome = "";
            while (!found) {
                String strHead = "" + head;
                palindrome = strHead + strHead.charAt(2) + strHead.charAt(1) + strHead.charAt(0);
                int value = Integer.valueOf(palindrome);
                if (value < n) found = isProduct(value);
                head--;
            }
            System.out.println(palindrome);
        }
    }
}