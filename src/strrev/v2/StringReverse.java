package strrev.v2;

public class StringReverse {
    public static void main(String[] args) {
        String input = "Hello WOrld";
        StringReverseClass src = new StringReverseClass();
        System.out.println( src.reverseStr(input));
    }
}

class StringReverseClass{
    public String reverseStr( String input)
    {
        String rev="";
        for (int i=input.length()-1; i>=0;i-- ) {
            rev = rev + input.charAt(i);
        }
        return rev;
    }
}
