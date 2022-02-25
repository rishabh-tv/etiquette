import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilTest {
    @Test
    public void shouldGetLengthofString() {
        String teststring="Hello Rishabh";
        Assert.assertEquals(teststring.length(),13);

    }



}
