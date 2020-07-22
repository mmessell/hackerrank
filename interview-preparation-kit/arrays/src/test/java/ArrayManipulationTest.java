import org.junit.Assert;
import org.junit.Test;

public class ArrayManipulationTest {

    @Test
    public void SampleTestCase0() {
        int[][] queries = new int[][]{
                new int[]{1, 2, 100},
                new int[]{2, 5, 100},
                new int[]{3, 4, 100}
        };
        int n = 5;

        long max = ArrayManipulation.arrayManipulation(n, queries);

        Assert.assertEquals(200, max);
    }

    @Test
    public void SampleTestCase1() {
        int[][] queries = new int[][]{
                new int[]{1, 5, 3},
                new int[]{4, 8, 7},
                new int[]{6, 9, 1}
        };
        int n = 10;

        long max = ArrayManipulation.arrayManipulation(n, queries);

        Assert.assertEquals(10, max);
    }

    @Test
    public void SampleTestCase2() {
        int[][] queries = new int[][]{
                new int[]{2, 6, 8},
                new int[]{3, 5, 7},
                new int[]{1, 8, 1},
                new int[]{5, 9, 15}
        };
        int n = 10;

        long max = ArrayManipulation.arrayManipulation(n, queries);

        Assert.assertEquals(31, max);
    }
}
