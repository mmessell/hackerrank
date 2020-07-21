import org.junit.Assert;
import org.junit.Test;

public class SockMerchantTest {

    @Test
    public void SampleTestCase0() {
        int n = 9;
        int ar[] = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};

        int sockPairs = SockMerchant.sockMerchant(n, ar);
        Assert.assertEquals(3, sockPairs);
    }

    @Test
    public void SampleTestCase1() {
        int n = 10;
        int ar[] = new int[]{1, 1, 3, 1, 2, 1, 3, 3, 3, 3};

        int sockPairs = SockMerchant.sockMerchant(n, ar);
        Assert.assertEquals(4, sockPairs);
    }
}
