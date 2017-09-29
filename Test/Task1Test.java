import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ma$ha on 29.09.2017.
 */
public class Task1Test {
    @Test
    public void bruteForce() throws Exception {
        int[] a1 = new int[]{100};
        int[] a2 = new int[]{20, 20 , 10, -2, 14, 80};
        int[] a3 = new int[]{};
        assertEquals(Task1.bruteForce(a1).toString(), "Day1: 1, Day2: 1 Sum: 0");
        assertEquals(Task1.bruteForce(a2).toString(), "Day1: 4, Day2: 6 Sum: 82");
        assertEquals(Task1.bruteForce(a3).toString(), "Day1: 0, Day2: 0 Sum: 0");
    }
    @Test
    public void maxSubArray() throws Exception {
        int[] a1 = new int[]{0, 10, -3, -8, -4, 20, 1, -10, 8};
        int[] a2 = new int[]{11, -12, 15, -13, 12, 2, -5, 12};
        int[] a3 = new int[]{};
        assertEquals(Task1.maxsumSubArray(a1).toString(), "Day1: 3, Day2: 5 Sum: 28");
        assertEquals(Task1.maxsumSubArray(a2).toString(), "Day1: 1, Day2: 2 Sum: 27");
        assertEquals(Task1.maxsumSubArray(a3).toString(), "Day1: 0, Day2: 0 Sum: 0");
    }


}