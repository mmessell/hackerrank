import org.junit.Assert;
import org.junit.Test;

public class CountingValleysTest {

    @Test
    public void SampleTestCase0() {
        int n = 8;
        String s = "UDDDUDUU";

        int valleys = CountingValleys.countingValleys(n, s);
        Assert.assertEquals(1, valleys);
    }

    @Test
    public void SampleTestCase1() {
        int n = 12;
        String s = "DDUUDDUDUUUD";

        int valleys = CountingValleys.countingValleys(n, s);
        Assert.assertEquals(2, valleys);
    }
}
