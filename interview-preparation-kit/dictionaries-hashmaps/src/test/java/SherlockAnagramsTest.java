import org.junit.Assert;
import org.junit.Test;

public class SherlockAnagramsTest {

    @Test
    public void SampleTestCase01() {
        String s = "abba";

        int anagrams = SherlockAnagrams.sherlockAndAnagrams(s);
        Assert.assertEquals(4, anagrams);
    }

    @Test
    public void SampleTestCase02() {
        String s = "abcd";

        int anagrams = SherlockAnagrams.sherlockAndAnagrams(s);
        Assert.assertEquals(0, anagrams);
    }

    @Test
    public void SampleTestCase11() {
        String s = "ifailuhkqq";

        int anagrams = SherlockAnagrams.sherlockAndAnagrams(s);
        Assert.assertEquals(3, anagrams);
    }

    @Test
    public void SampleTestCase12() {
        String s = "kkkk";

        int anagrams = SherlockAnagrams.sherlockAndAnagrams(s);
        Assert.assertEquals(10, anagrams);
    }

    @Test
    public void SampleTestCase2() {
        String s = "cdcd";

        int anagrams = SherlockAnagrams.sherlockAndAnagrams(s);
        Assert.assertEquals(5, anagrams);
    }
}
