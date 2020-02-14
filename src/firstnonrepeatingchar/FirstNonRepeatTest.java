package firstnonrepeatingchar;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstNonRepeatTest {

    @Test
    public void firstNon() {
        assertEquals(java.util.Optional.of('d').get(),new FirstNonRepeat().firstNon("aabbccd"));
        assertEquals(java.util.Optional.of('a').get(),new FirstNonRepeat().firstNon("abbccd"));
        assertNull(new FirstNonRepeat().firstNon("aabbccdd"));


        assertEquals(java.util.Optional.of('d').get(),new FirstNonRepeat().firstNonMAp("aabbccd"));
        assertEquals(java.util.Optional.of('a').get(),new FirstNonRepeat().firstNonMAp("abbccd"));
        assertNull(new FirstNonRepeat().firstNonMAp("aabbccdd"));

    }
}