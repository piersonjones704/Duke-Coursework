import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class BigWord {
    public String most(String[] sentences) {
        // you write code heref
        ArrayList<String> list = new ArrayList<>();
        for (String s : sentences) {
            s = s.toLowerCase();
            String[] aa = s.split(" ");
            list.addAll(Arrays.asList(aa));
        }
        HashMap<String, Integer> map = new HashMap<>();
        // int max = 0;
        String maxString = "";
        for (String s : list) {
            int count = Collections.frequency(list, s);
            map.put(s,count+1);
            // if (count > max) {
            //     max = count;
            //     maxString = s;
        }
        int max = Collections.max(map.values());
        for (String s : map.keySet()) {
            if (map.get(s) == max) {
                maxString = s;
            }
        }
    return maxString;
    }
}