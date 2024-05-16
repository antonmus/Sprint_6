import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class HasManeTest {
    String sex;
    boolean expectedHasMane;
    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                { "Самец", true },
                { "Самка", false }
        };
    }
    public HasManeTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }
    @Test
    public void hasManeTest() throws Exception {
        Feline feline = new Feline();
        Lion lion  = new Lion(sex, feline);
        Assert.assertEquals(expectedHasMane, lion.doesHaveMane());
    }
}
