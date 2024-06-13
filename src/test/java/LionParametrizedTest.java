import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionParametrizedTest {
    private final String gender;
    private final boolean hasMane;
    Feline feline = new Feline();

    public LionParametrizedTest(String gender, boolean hasMane) {
        this.gender = gender;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getGenderType() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Оно", false}
        };
    }

    @Test
    public void doesHaveManeTest() {
        try {
            Lion lion = new Lion(gender, feline);
            assertEquals(hasMane, lion.doesHaveMane());
        }
        catch (Exception thrown) {
            assertEquals("Используйте допустимые значения пола животного - самей или самка", thrown.getMessage());
        }
    }

}
