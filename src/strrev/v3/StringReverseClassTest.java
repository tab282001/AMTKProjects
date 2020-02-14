package strrev.v3;

import static org.junit.Assert.*;

public class StringReverseClassTest {

    @org.junit.Test
    public void reverseStr() {
        assertEquals("cba",new StringReverseClass().reverseStr("abc"));
        assertEquals("hello",new StringReverseClass().reverseStr("olleh"));

        assertEquals("cba",new StringReverseClassNoExtraSpace().reverseStr("abc"));
        assertEquals("dcba",new StringReverseClassNoExtraSpace().reverseStr("abcd"));

        assertEquals("cba",new StringReverseClassRecursive().reverseStr("abc"));
        assertEquals("dcba",new StringReverseClassRecursive().reverseStr("abcd"));
    }
}