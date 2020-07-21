import org.junit.Assert;
import org.junit.Test;

public class JumpingOnTheCloudsTest {

    @Test
    public void SampleTestCase0() {
        int c[] = new int[]{0, 0, 1, 0, 0, 1, 0};

        int jumps = JumpingOnTheClouds.jumpingOnClouds(c);
        Assert.assertEquals(4, jumps);
    }

    @Test
    public void SampleTestCase1() {
        int c[] = new int[]{0, 0, 0, 1, 0, 0};

        int jumps = JumpingOnTheClouds.jumpingOnClouds(c);
        Assert.assertEquals(3, jumps);
    }
}
