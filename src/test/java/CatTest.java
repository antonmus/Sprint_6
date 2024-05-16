import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import java.util.List;
import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private Cat cat;
   @Mock
    Feline feline;
   @Before
    public void setCat() {
       cat = new Cat(feline);
    }
    @Test
    public void soundCatTest(){
        String expectedSound = "Мяу";
        assertEquals(expectedSound, cat.getSound());
    }
    @Test
    public void foodCatTest() throws Exception {
       List<String> expectedCatFood  = List.of("Животные", "Птицы", "Рыба");
       Mockito.when(feline.eatMeat()).thenReturn(expectedCatFood);
       assertEquals(expectedCatFood, cat.getFood());

    }
}
