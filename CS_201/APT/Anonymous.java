import java.util.Map;
import java.util.HashMap;

public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        // fill in code here
        HashMap<Character,Integer> allLetters = new HashMap<>();
        String all = String.join(" ",headlines);
        for (char ch: all.toLowerCase().toCharArray()){
            int occurences = allLetters.getOrDefault(ch, 0);
            allLetters.put(ch,occurences+1);

        }
        int count = 0;
        for (String s : messages) {
            if (canMake(s, allLetters)) {
                count += 1;
            }
        }
        return count;
    }
    private boolean canMake(String s, HashMap<Character,Integer> allLetters) {
        // make a map of characters in s, compare to allLetters
        Map<Character,Integer> map = new HashMap<>();
        // int[] need = new int[300];
        for (char ch: s.toLowerCase().toCharArray()){
            int occurences = map.getOrDefault(ch, 0);
            map.put(ch,occurences+1);
            // need[ch] += 1;
        }
        for (char ch = 'a'; ch<= 'z'; ch++) {
            // if (need[ch] > have[ch]) return false;
            int have = allLetters.getOrDefault(ch,0);
            int need = map.getOrDefault(ch, 0);
            if (need > have) return false;
            }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}