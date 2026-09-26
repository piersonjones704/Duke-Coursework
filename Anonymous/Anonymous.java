import java.util.Map;
import java.util.HashMap;

public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
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
        Map<Character,Integer> map = new HashMap<>();
        for (char ch: s.toLowerCase().toCharArray()){
            int occurences = map.getOrDefault(ch, 0);
            map.put(ch,occurences+1);
        }
        for (char ch = 'a'; ch<= 'z'; ch++) {
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