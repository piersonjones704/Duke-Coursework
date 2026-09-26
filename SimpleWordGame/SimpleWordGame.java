import java.util.ArrayList;
import java.util.TreeSet;

public class SimpleWordGame {
    public int points(String[] player, 
                      String[] dictionary) {
        ArrayList<String> dictionarylist = new ArrayList<>();
        for (String s : dictionary) {
            dictionarylist.add(s);
        }
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < player.length; i++) {
            if (dictionarylist.indexOf(player[i]) >= 0) {
                set.add(player[i]);
            }
        } 
        int ret = 0;
        for (String s : set) {
            ret += s.length()*s.length();
        }
        return ret;
    }
}