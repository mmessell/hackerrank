import org.junit.Assert;
import org.junit.Test;

public class MinimumSwaps2Test {

    @Test
    public void SampleTestCase0() {
        int[] arr = new int[]{4, 3, 1, 2};

        int swaps = MinimumSwaps2.minimumSwaps(arr);

        Assert.assertEquals(3, swaps);
    }

    @Test
    public void SampleTestCase1() {
        int[] arr = new int[]{2, 3, 4, 1, 5};

        int swaps = MinimumSwaps2.minimumSwaps(arr);

        Assert.assertEquals(3, swaps);
    }

    @Test
    public void SampleTestCase2() {
        int[] arr = new int[]{1, 3, 5, 2, 4, 6, 7};

        int swaps = MinimumSwaps2.minimumSwaps(arr);

        Assert.assertEquals(3, swaps);
    }
}
