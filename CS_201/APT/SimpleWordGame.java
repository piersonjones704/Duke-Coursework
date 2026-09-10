import java.util.ArrayList;
import java.util.TreeSet;

public class SimpleWordGame {
    public int points(String[] player, 
                      String[] dictionary) {
        // String[] playerwords = {"orange", "red", "tree", "blue", "car", "green", "green", "yellow"};
        // String[] dictionarywords = {"orange", "heights", "clouds", "water", "red", "blue", "kites", "yellow"};
        // TreeSet<String> playerwords = new TreeSet<>();
        ArrayList<String> dictionarylist = new ArrayList<>();
        for (String s : dictionary) {
            dictionarylist.add(s);
        }
        TreeSet<String> set = new TreeSet<>();
        // for (String p : player) {
        //     playerwords.add(p);
        // }
        for (int i = 0; i < player.length; i++) {
            if (dictionarylist.indexOf(player[i]) >= 0) {
                set.add(player[i]);
            }
        } 
        int ret = 0;
        // // for (String d : dictionary) {
        //     for (int i = 0; i < playerwords.length(); i++) {
        //         if (dictionary.indexOf(playerwords[i]) > 0) {
        //             set.add(playerwords[i]);
        //         }
        //     } 
        // // }
        for (String s : set) {
            ret += s.length()*s.length();
        }
        return ret;
    //   }// This helps validate the code compiles correctly while not affecting results on APT test
    // public static void main(String{} args) {
    //     System.out.println("HELLO");
    // } 
}
}