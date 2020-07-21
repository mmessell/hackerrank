import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArraysLeftRotationTest {

    @Test
    public void SampleTestCase0() {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int d = 4;

        int[] rotLeftA = ArraysLeftRotation.rotLeft(a, d);
        Assert.assertTrue(Arrays.equals(new int[]{5, 1, 2, 3, 4}, rotLeftA));
    }

    @Test
    public void SampleTestCase1() {
        int[] a = new int[]{41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};
        int d = 10;

        int[] rotLeftA = ArraysLeftRotation.rotLeft(a, d);
        Assert.assertTrue(Arrays.equals(new int[]{77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77}, rotLeftA));
    }

    @Test
    public void SampleTestCase2() {
        int[] a = new int[]{33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97};
        int d = 13;

        int[] rotLeftA = ArraysLeftRotation.rotLeft(a, d);
        Assert.assertTrue(Arrays.equals(new int[]{87, 97, 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60}, rotLeftA));
    }
}
