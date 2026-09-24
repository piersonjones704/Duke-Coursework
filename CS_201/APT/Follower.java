import java.util.*;

public class Follower {
    public int[] follows(String[] words) {
    ArrayList<Integer> indexes = new ArrayList<>();
    HashMap<String, Integer> pairing = new HashMap<>();
    int index_count = 0;
        for (String s : words) {
            for (int i = index_count + 1; i<words.length; i++) {
                if (words[i].equals(s)) {
                    indexes.add(index_count);
                    break;
                }
            }
            index_count += 1;
        }
    indexes.sort(Comparator.naturalOrder());
    return indexes.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
