import java.util.LinkedHashSet;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        LinkedHashSet<String> unique_strings = new LinkedHashSet<>();
        for (String s : list) {
            if (s.length() >= minLength) {
                unique_strings.add(s);
            }
        }
        String[] uni_strs_array = unique_strings.toArray(new String[0]);
        return uni_strs_array;
    }
}