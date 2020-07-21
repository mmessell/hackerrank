import org.junit.Assert;
import org.junit.Test;

public class TwoDArrayDSTest {

    @Test
    public void SampleTestCase0() {
        int[][] arr = new int[][]{
                new int[]{1, 1, 1, 0, 0, 0},
                new int[]{0, 1, 0, 0, 0, 0},
                new int[]{1, 1, 1, 0, 0, 0},
                new int[]{0, 0, 2, 4, 4, 0},
                new int[]{0, 0, 0, 2, 0, 0},
                new int[]{0, 0, 1, 2, 4, 0}
        };

        int hourglassSum = TwoDArrayDS.hourglassSum(arr);
        Assert.assertEquals(19, hourglassSum);
    }

    @Test
    public void SampleTestCase1() {
        int[][] arr = new int[][]{
                new int[]{1, 1, 1, 0, 0, 0},
                new int[]{0, 1, 0, 0, 0, 0},
                new int[]{1, 1, 1, 0, 0, 0},
                new int[]{0, 9, 2, -4, -4, 0},
                new int[]{0, 0, 0, -2, 0, 0},
                new int[]{0, 0, -1, -2, -4, 0}
        };

        int hourglassSum = TwoDArrayDS.hourglassSum(arr);
        Assert.assertEquals(13, hourglassSum);
    }

    @Test
    public void SampleTestCase2() {
        int[][] arr = new int[][]{
                new int[]{-9, -9, -9, 1, 1, 1},
                new int[]{0, -9, 0, 4, 3, 2},
                new int[]{-9, -9, -9, 1, 2, 3},
                new int[]{0, 0, 8, 6, 6, 0},
                new int[]{0, 0, 0, -2, 0, 0},
                new int[]{0, 0, 1, 2, 4, 0}
        };

        int hourglassSum = TwoDArrayDS.hourglassSum(arr);
        Assert.assertEquals(28, hourglassSum);
    }
}
