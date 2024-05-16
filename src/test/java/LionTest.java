import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private Lion lion;
    @Mock
    Feline feline;
    @Before
    public void setLion() throws Exception {
        String sex = "Самец";
        lion = new Lion(sex, feline);
    }
    @Test
    public void countKittenLionTest(){
        int expectedCountKitten = 1;
        Mockito.when(feline.getKittens()).thenReturn(expectedCountKitten);
        assertEquals(expectedCountKitten, lion.getKittens());
    }
    @Test
    public void foodLionTest() throws Exception  {
        List<String> expectedLionFood  = List.of("Животные", "Птицы", "Рыба");
        String animalKind = "Хищник";
        Mockito.when(feline.getFood(animalKind)).thenReturn(expectedLionFood);
        assertEquals(expectedLionFood, lion.getFood());
    }
}
