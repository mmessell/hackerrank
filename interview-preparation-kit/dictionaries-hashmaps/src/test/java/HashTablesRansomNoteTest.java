import org.junit.Assert;
import org.junit.Test;

public class HashTablesRansomNoteTest {

    @Test
    public void SampleTestCase0() {
        String[] magazine = new String[]{"give", "me", "one", "grand", "today", "night"};
        String[] note = new String[]{"give", "one", "grand", "today"};

        boolean valid = HashTablesRansomNote.checkMagazineHelper(magazine, note);
        Assert.assertEquals(true, valid);
    }

    @Test
    public void SampleTestCase1() {
        String[] magazine = new String[]{"two", "times", "three", "is", "not", "four"};
        String[] note = new String[]{"two", "times", "two", "is", "four"};

        boolean valid = HashTablesRansomNote.checkMagazineHelper(magazine, note);
        Assert.assertEquals(false, valid);
    }

    @Test
    public void SampleTestCase2() {
        String[] magazine = new String[]{"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
        String[] note = new String[]{"ive", "got", "some", "coconuts"};

        boolean valid = HashTablesRansomNote.checkMagazineHelper(magazine, note);
        Assert.assertEquals(false, valid);
    }
}
