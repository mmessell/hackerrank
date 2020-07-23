import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CountTripletsTest {

    @Test
    public void SampleTestCase0() {
        List<Long> arr = new ArrayList<Long>() {{
            add(1L);
            add(2L);
            add(2L);
            add(4L);
        }};
        long r = 2;

        long tripleCount = CountTriplets.countTriplets(arr, r);
        Assert.assertEquals(2, tripleCount);
    }

    @Test
    public void SampleTestCase1() {
        List<Long> arr = new ArrayList<Long>() {{
            add(1L);
            add(3L);
            add(9L);
            add(9L);
            add(27L);
            add(81L);
        }};
        long r = 3;

        long tripleCount = CountTriplets.countTriplets(arr, r);
        Assert.assertEquals(6, tripleCount);
    }

    @Test
    public void SampleTestCase2() {
        List<Long> arr = new ArrayList<Long>() {{
            add(1L);
            add(5L);
            add(5L);
            add(25L);
            add(125L);
        }};
        long r = 5;

        long tripleCount = CountTriplets.countTriplets(arr, r);
        Assert.assertEquals(4, tripleCount);
    }
}
