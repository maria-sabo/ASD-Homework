import java.util.Arrays;

public class Task1 {
    static void prn(int a[]) {
        System.out.println(Arrays.toString(a));
    }

    public static class MaxSum {
        int a, b, sum;

        MaxSum(int a, int b, int sum) {
            this.a = a;
            this.b = b;
            this.sum = sum;
        }

        public String toString() {
            return "Day1: " + this.a + ", Day2: " + this.b + " Sum: " + this.sum;
        }
    }

    static MaxSum bruteForce(int price[]) {
        int max = 0;
        if (price.length > 1) max = price[1] - price[0];
        int n = price.length;
        int a = 0, b = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (max < price[j] - price[i]) {
                    max = price[j] - price[i];
                    a = i;
                    b = j;
                }
            }
        }
        if (price.length != 0) {
            a++;
            b++;
        }
        return new MaxSum(a, b, max);
    }

    static MaxSum maxsumSubArray(int price[]) {
        int n = price.length;
        if (n == 0) return new MaxSum(0, 0, 0);
        int[] delta = new int[n - 1];

        int k = 0;
        for (int i = 0; i < n - 1; i++) {
            delta[k] = price[i + 1] - price[i];
            k++;
        }
        int l = 0, r = 0;
        int minPos = -1;
        int max = Integer.MIN_VALUE;
        int maxEndHere = 0;

        for (int i = 0; i < n - 1; i++) {
            maxEndHere = maxEndHere + delta[i];
            if (max < maxEndHere) {
                max = maxEndHere;
                l = minPos + 1;
                r = i;
            }
            if (maxEndHere < 0) {
                maxEndHere = 0;
                minPos = i;
            }
        }
        r = r + 1;
        return new MaxSum(l, r, max);
    }
}

