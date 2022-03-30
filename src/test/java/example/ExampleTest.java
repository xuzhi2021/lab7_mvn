package example;//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.Test;
import org.junit.jupiter.api.Test;

public class ExampleTest{
    @Test
    public void test1(){
        assertEquals(1,Example.function(0));
    }
    @Test
    public void test2(){
        assertEquals(-1,Example.function(10));
    }
}