import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class MemberCheck {
    public String[] whosDishonest(String[] club1, 
                                    String[] club2, 
                                    String[] club3) {

// Revised Approach
        Set<String> set1 = new HashSet<>(Arrays.asList(club1));
        Set<String> set2 = new HashSet<>(Arrays.asList(club2));
        Set<String> set3 = new HashSet<>(Arrays.asList(club3));
        TreeSet<String> allNames = new TreeSet<>(set1);
        allNames.addAll(set2);
        allNames.addAll(set3);
        List<String> result = new ArrayList<>();
        for (String person : allNames) {
            int clubsVisited = 0;
            if (set1.contains(person)) clubsVisited++;
            if (set2.contains(person)) clubsVisited++;
            if (set3.contains(person)) clubsVisited++;
            if (clubsVisited >= 2) result.add(person);
            }
    return result.toArray(new String[0]);
    }

// First approach
    // TreeSet<String> sorted_people = new TreeSet<>();
    // for (String person : club1) {
    //     int recurrences = 0;
    //     if (Arrays.asList(club2).contains(person)) {
    //         recurrences += 1;
    //     }
    //     if (Arrays.asList(club3).contains(person)) {
    //         recurrences += 1;
    //     }
    //     if (recurrences >= 1) {
    //         sorted_people.add(person);
    //     }
    // }
    // for (String person : club2) {
    //     int recurrences = 0;
    //     if (Arrays.asList(club3).contains(person)) {
    //         recurrences += 1;
    //     }
    //     if (recurrences >= 1) {
    //         sorted_people.add(person);
    //     }
    // }
    // String[] people = sorted_people.toArray(new String[sorted_people.size()]);
    // return people;
    // }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}