import org.junit.Assert;
import org.junit.Test;

public class RepeatedStringTest {

    @Test
    public void SampleTestCase0() {
        String s = "aba";
        long n = 10;

        long repeats = RepeatedString.repeatedString(s, n);
        Assert.assertEquals(7, repeats);
    }

    @Test
    public void SampleTestCase1() {
        String s = "a";
        long n = 1000000000;

        long repeats = RepeatedString.repeatedString(s, n);
        Assert.assertEquals(1000000000, repeats);
    }
}
