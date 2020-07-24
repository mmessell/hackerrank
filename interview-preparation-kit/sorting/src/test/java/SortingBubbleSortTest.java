import org.junit.Assert;
import org.junit.Test;

public class SortingBubbleSortTest {

    @Test
    public void sampleTestCase0() {
        int[] arr = new int[]{1, 2, 3};
        int[] output = SortingBubbleSort.countSwapsHelper(arr);
        SortingBubbleSort.countSwaps(arr);
        Assert.assertEquals(0, output[0]);
        Assert.assertEquals(1, output[1]);
        Assert.assertEquals(3, output[2]);
    }

    @Test
    public void sampleTestCase1() {
        int[] arr = new int[]{3, 2, 1};
        int[] output = SortingBubbleSort.countSwapsHelper(arr);
        Assert.assertEquals(3, output[0]);
        Assert.assertEquals(1, output[1]);
        Assert.assertEquals(3, output[2]);
    }

    @Test
    public void sampleTestCase2() {
        int[] arr = new int[]{4, 2, 3, 1};
        int[] output = SortingBubbleSort.countSwapsHelper(arr);
        Assert.assertEquals(5, output[0]);
        Assert.assertEquals(1, output[1]);
        Assert.assertEquals(4, output[2]);
    }
}
