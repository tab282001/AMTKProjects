package firstnonrepeatingchar;

import java.util.*;

public class FirstNonRepeat {
    public Character firstNon ( String input ){
        char[] chars = input.toCharArray();
        Queue<Character> queue = new LinkedList<>();
        HashMap<Character, Integer> map = new HashMap();
        for (char c:chars ) {
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
            {
                map.put(c,1);
                queue.add(c);
            }
        }
        Character finalval=null;
        while(true)
        {
            char cstack= queue.remove();
            if(map.get(cstack)==1)
            {
                finalval = cstack;
                break;
            }
            if(queue.isEmpty()) break;
        }
        return finalval;
    }

    public Character firstNonMAp ( String input ){
        char[] chars = input.toCharArray();

        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c:chars ) {
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        Character finalval=null;
        for ( char cvals:map.keySet())
        {
            if(map.get(cvals)==1) {
                finalval = cvals;
                break;
            }
        }

        return finalval;
    }






}
