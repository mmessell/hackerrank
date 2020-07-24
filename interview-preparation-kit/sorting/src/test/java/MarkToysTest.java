import org.junit.Assert;
import org.junit.Test;

public class MarkToysTest {

    @Test
    public void sampleTestCase0() {
        int[] prices = new int[]{1, 12, 5, 111, 200, 1000, 10};
        int k = 50;

        int maximumToys = MarkToys.maximumToys(prices, k);

        Assert.assertEquals(4, maximumToys);
    }

    @Test
    public void sampleTestCase1() {
        int[] prices = new int[]{1, 2, 3, 4};
        int k = 7;

        int maximumToys = MarkToys.maximumToys(prices, k);

        Assert.assertEquals(3, maximumToys);
    }

    @Test
    public void sampleTestCase2() {
        int[] prices = new int[]{3, 7, 2, 9, 4};
        int k = 15;

        int maximumToys = MarkToys.maximumToys(prices, k);

        Assert.assertEquals(3, maximumToys);
    }
}
