import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FrequencyQueriesTest {

    @Test
    public void SampleTestCase0() {
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(new ArrayList<Integer>(){{add(1);add(5);}});
        queries.add(new ArrayList<Integer>(){{add(1);add(6);}});
        queries.add(new ArrayList<Integer>(){{add(3);add(2);}});
        queries.add(new ArrayList<Integer>(){{add(1);add(10);}});
        queries.add(new ArrayList<Integer>(){{add(1);add(10);}});
        queries.add(new ArrayList<Integer>(){{add(1);add(6);}});
        queries.add(new ArrayList<Integer>(){{add(2);add(5);}});
        queries.add(new ArrayList<Integer>(){{add(3);add(2);}});

        List<Integer> frequencies = FrequencyQueries.freqQuery(queries);
        Assert.assertTrue(0 == frequencies.get(0));
        Assert.assertTrue(1 == frequencies.get(1));
    }

    @Test
    public void SampleTestCase1() {
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(new ArrayList<Integer>(){{add(3);add(4);}});
        queries.add(new ArrayList<Integer>(){{add(2);add(1003);}});
        queries.add(new ArrayList<Integer>(){{add(1);add(16);}});
        queries.add(new ArrayList<Integer>(){{add(3);add(1);}});

        List<Integer> frequencies = FrequencyQueries.freqQuery(queries);
        Assert.assertTrue(0 == frequencies.get(0));
        Assert.assertTrue(1 == frequencies.get(1));
    }

    @Test
    public void SampleTestCase2() {
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(new ArrayList<Integer>(){{add(1);add(3);}});
        queries.add(new ArrayList<Integer>(){{add(2);add(3);}});
        queries.add(new ArrayList<Integer>(){{add(3);add(2);}});
        queries.add(new ArrayList<Integer>(){{add(1);add(4);}});
        queries.add(new ArrayList<Integer>(){{add(1);add(5);}});
        queries.add(new ArrayList<Integer>(){{add(1);add(5);}});
        queries.add(new ArrayList<Integer>(){{add(1);add(4);}});
        queries.add(new ArrayList<Integer>(){{add(3);add(2);}});
        queries.add(new ArrayList<Integer>(){{add(2);add(4);}});
        queries.add(new ArrayList<Integer>(){{add(3);add(2);}});

        List<Integer> frequencies = FrequencyQueries.freqQuery(queries);
        Assert.assertTrue(0 == frequencies.get(0));
        Assert.assertTrue(1 == frequencies.get(1));
        Assert.assertTrue(1 == frequencies.get(2));
    }
}
