package strrev.v3;

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
        StringBuilder rev= new StringBuilder();
        char[] charArray= input.toCharArray();
        for (int c=charArray.length-1; c>=0;c-- )
         {
            rev = rev.append(charArray[c]);
        }

        return rev.toString();
    }
}

class StringReverseClassNoExtraSpace{
    public String reverseStr( String input){
        char [] charArray = input.toCharArray();
        char temp;
        int len= charArray.length;
        for( int i =0; i< len/2;i++)
        {
            temp = charArray[i];
            charArray[i] = charArray[len-1-i];
            charArray[len-1-i] = temp;
        }
        String output = new String(charArray);
        return output;
    }
}

class StringReverseClassRecursive{
    public String reverseStr( String input){
        if(input.length()<=1)
            return input;
        return reverseStr(input.substring(1)) + input.charAt(0);
    }
}