import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

import java.util.List;
@RunWith(Parameterized.class)
public class FelineTest {
    private final int expected;
    Feline feline;
    public FelineTest(int kittensCount){
        this.expected = kittensCount;
            }
    @Parameterized.Parameters
    public static Object[][] kittenCount() {
        return new Object[][] {
                { 0 },
                { 1 },
                { 5 },

        };
    }

    @Before
    public void feline(){
    feline = new Feline();
}
    @Test
    public void eatMeat() throws Exception{
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());

    }
    @Test
    public void getFamily() {
       // Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }
    @Test
    public void getKittensWoParams() {
        //Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithParams() {

        int actual = feline.getKittens(expected);
        assertEquals(expected, actual);
    }
}
