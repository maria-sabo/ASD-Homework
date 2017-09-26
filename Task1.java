import java.util.Arrays;

/**
 * Created by Ma$ha on 26.09.2017.
 */
public class Task1 {
    static void prn(int a[]) {
        System.out.println(Arrays.toString(a));
    }

    static String brutForce(int price[]) {
        int max = price[1] - price[0];
        int N = price.length;
        int a = 0;
        int b = 0;
        int x = 0;
        for (int i = 0; i < N - 1; i++) {
            x++;
            for (int j = i + 1; j < N; j++) {
                x++;
                if (max < price[j] - price[i]) {
                    max = price[j] - price[i];
                    a = i;
                    b = j;
                }
            }
        }
        return Integer.toString(max) + " " + "day1: " + Integer.toString(a) + " " + "day2: " + Integer.toString(b);
    }

    static String maxsumSubArray(int price[]) {
        int N = price.length;
        int[] delta = new int[N - 1];
        int k = 0;
        for (int i = 0; i < N - 1; i++) {
            delta[k] = price[i + 1] - price[i];
            k++;
        }
        int l = 0;
        int r = 0;
        int min_pos = -1;
        int max = Integer.MIN_VALUE;
        int max_ending_here = 0;

        for (int i = 0; i < N - 1; i++) {
            max_ending_here = max_ending_here + delta[i];
            if (max < max_ending_here) {
                max = max_ending_here;
                l = min_pos + 1;
                r = i;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
                min_pos = i;
            }
        }
        r = r + 1;
        return Integer.toString(max) + " day1: " + Integer.toString(l) + ", day2: " + Integer.toString(r);
    }
}
