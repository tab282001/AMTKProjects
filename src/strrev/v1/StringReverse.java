package strrev.v1;

public class StringReverse {
    public static void main(String[] args) {
        String input = "abc";
        System.out.println(reverseStr(input));
    }
    public static String reverseStr( String input)
    {
        String rev="";
        for (int i=input.length()-1; i>=0;i-- ) {
            rev = rev + input.charAt(i);
        }
        return rev;
    }
}

