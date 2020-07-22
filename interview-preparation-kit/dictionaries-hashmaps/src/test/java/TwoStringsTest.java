import org.junit.Assert;
import org.junit.Test;

public class TwoStringsTest {

    @Test
    public void SampleTestCase01() {
        String s1 = "hello";
        String s2 = "world";

        boolean valid = TwoStrings.twoStringsHelper(s1, s2);
        Assert.assertTrue(valid);
    }

    @Test
    public void SampleTestCase02() {
        String s1 = "hi";
        String s2 = "world";

        boolean valid = TwoStrings.twoStringsHelper(s1, s2);
        Assert.assertFalse(valid);
    }
}
