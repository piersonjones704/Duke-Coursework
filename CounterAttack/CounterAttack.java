
import java.util.HashMap;

public class CounterAttack {
     public int[] analyze(String str, String[] words) {
        int[] counts = new int[words.length];
        HashMap<String, Integer> map = new HashMap<>();
        for (String s: str.split(" ")) {
            int occurs = map.getOrDefault(s, 0);
            map.put(s, occurs + 1);
        }
        for (int k = 0; k < words.length; k++) {
            counts[k] = map.getOrDefault(words[k],0);
        }
     
     return counts;
    }
 }
