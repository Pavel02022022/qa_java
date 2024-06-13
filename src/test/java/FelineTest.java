import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void getKittensWithoutCountExpectsOne() {
        Feline feline = new Feline();
        int kitens = feline.getKittens();
        assertEquals(1, kitens);
    }

    @Test
    public void getKittensWithCountExpectsFive() {
        Feline feline = new Feline();
        int kitensExpected = 5;
        int kitens = feline.getKittens(kitensExpected);
        assertEquals(kitensExpected, kitens);
    }

    @Test
    public void getFamilyExpectsFamliy() {
        Feline feline = new Feline();
        String family = feline.getFamily();
        assertEquals("Кошачьи", family);
    }

    @Test
    public void felineExpectsEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> type = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), type);
    }

}
