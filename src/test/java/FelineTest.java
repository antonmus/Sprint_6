import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    Feline feline;
    @Before
    public void setFeline(){
        feline = new Feline();
    }
    @Test
    public void felineFamilyTest(){
        String expectedFamily = "Кошачьи";
        assertEquals(expectedFamily, feline.getFamily());
    }
    @Test
    public void KittenFelineTestNoArguments() {
        int expectedCountKitten = 1;
        assertEquals(expectedCountKitten, feline.getKittens());
    }
    @Test
    public void countKittensFelineTest(){
        int expectedCountKitten =  3;
        assertEquals(expectedCountKitten, feline.getKittens(expectedCountKitten));
    }
    @Test
    public void felineEatMeatTest() throws Exception {
        List<String> expectedEatMeat  =  List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedEatMeat, feline.eatMeat());
    }
}
