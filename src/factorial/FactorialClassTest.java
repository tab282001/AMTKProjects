package factorial;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialClassTest {

    @Test
    public void fact() {
        assertEquals(120,new FactorialClass().fact(5));
        assertEquals(1,new FactorialClass().fact(0));

        assertEquals(120,new FactorialClass().factRec(5));
        assertEquals(1,new FactorialClass().factRec(0));
    }
}