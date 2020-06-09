import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class DuplicateCharacter {
    public static void main(String[] args) {
        NonRepeatedCharacter npc = new NonRepeatedCharacter();
        npc.nonRepeat("analogy");   
    }

    public void nonRepeat(String str) {
        Map<Character, Integer> map = new HashMap();

        int i = 0;
        while(i < str.length()) {
            if(map.containsKey(str.charAt(i))== false) {
                map.put(str.charAt(i), 1);
            }else {
                int x = map.get(str.charAt(i));
                x++;
                map.put(str.charAt(i), x);
            }
            i++;
        }

        Set<Character> key = map.keySet();
       for(Character c: key) {
           if(map.get(c) > 1) {
               System.out.println(c+ " ====> "+map.get(c));
           }
       }
    }
}