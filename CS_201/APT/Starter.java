import java.util.ArrayList;

public class Starter {
    public int begins(String[] words, String first) {            
        int wordamount = 0;
        // int recurring = 0;

        ArrayList<String> seenwords = new ArrayList<>();
        for (int i=0; i<words.length; i+=1){
            String analyzedword = words[i];
            // System.out.println(analyzedword);
            String firstChar = analyzedword.substring(0, 1);
            // System.out.println(firstChar);
            if (first.equals(firstChar)){
                if (seenwords.contains(analyzedword)){
                    wordamount += 0;
                    // recurring += 1;
                    // System.out.println("Recurring word found");
                // System.out.println("yes");
                }
                else {
                    wordamount += 1;
                }
            seenwords.add(analyzedword);

            }
        }
    // System.out.printf("Amount of unique words starting with %s is %d", first, wordamount);
    // System.out.println();
    // System.out.printf("Amount of recurring words with first letter %s is %d", first, recurring);
    return wordamount;
    }

    // public static void main(String[] args) {
    //     Starter s = new Starter();
    //     String[] words = {"eel", "elephant", "giraffe", "at", "lies", "hat", "eel", "hat"};
    //     s.begins(words, "e");
    // }
}

// import java.util.*;

// public class Starter {
//     public int begins(String[] words, String first){
//         int count = 0;
//         HashSet
//     }
// }