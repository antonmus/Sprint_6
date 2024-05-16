import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertThrows;
@RunWith(Parameterized.class)
public class LionExTest {
    private final String sex;
    private static final String EXPECTED_TEXT = "Используйте допустимые значения пола животного - самей или самка";

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                { "самец" },
                { "sames" },
                { " " },
                { "123" },
                { "С@мка" }
        };
    }
    public LionExTest(String sex) {
        this.sex = sex;
    }
    @Test
    public void lionExTest() {
        Feline feline = new Feline();
       Exception indexOutOfBoundsException =  assertThrows(Exception.class, ()-> new Lion(sex, feline));
       Assert.assertEquals(EXPECTED_TEXT,  indexOutOfBoundsException.getMessage());
    }
}
