import org.junit.Assert;
import org.junit.Test;

public class NewYearChaosTest {

    @Test
    public void SampleTestCase01() {
        int[] q = new int[]{2, 1, 5, 3, 4};

        int bribes = NewYearChaos.minimumBribesHelper(q);
        Assert.assertEquals(3, bribes);
    }

    @Test
    public void SampleTestCase02() {
        int[] q = new int[]{2, 5, 1, 3, 4};

        int bribes = NewYearChaos.minimumBribesHelper(q);
        Assert.assertEquals(-1, bribes);
    }

    @Test
    public void SampleTestCase11() {
        int[] q = new int[]{5, 1, 2, 3, 7, 8, 6, 4};

        int bribes = NewYearChaos.minimumBribesHelper(q);
        Assert.assertEquals(-1, bribes);
    }

    @Test
    public void SampleTestCase12() {
        int[] q = new int[]{1, 2, 5, 3, 7, 8, 6, 4};

        int bribes = NewYearChaos.minimumBribesHelper(q);
        Assert.assertEquals(7, bribes);
    }
}
