import org.junit.Assert;
import org.junit.Test;

public class FraudulentActivityNotificationsTest {

    @Test
    public void sampleTestCase0() {
        int[] spendings = new int[]{2, 3, 4, 2, 3, 6, 8, 4, 5};
        int days = 5;

        int notifications = FraudulentActivityNotifications.activityNotifications(spendings, days);
        Assert.assertEquals(2, notifications);
    }

    @Test
    public void sampleTestCase1() {
        int[] spendings = new int[]{1, 2, 3, 4, 4};
        int days = 4;

        int notifications = FraudulentActivityNotifications.activityNotifications(spendings, days);
        Assert.assertEquals(0, notifications);
    }

    @Test
    public void sampleTestCase2() {
        int[] spendings = new int[]{10, 20, 30, 40, 50};
        int days = 3;

        int notifications = FraudulentActivityNotifications.activityNotifications(spendings, days);
        Assert.assertEquals(1, notifications);
    }

    @Test
    public void sampleTestCaseEven() {
        int[] spendings = new int[]{20, 30, 40, 50};
        int days = 2;

        int notifications = FraudulentActivityNotifications.activityNotifications(spendings, days);
        Assert.assertEquals(0, notifications);
    }
}
