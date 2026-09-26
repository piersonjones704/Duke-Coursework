import java.util.ArrayList;

public class Starter {
    public int begins(String[] words, String first) {            
        int wordamount = 0;
        ArrayList<String> seenwords = new ArrayList<>();
        for (int i=0; i<words.length; i+=1){
            String analyzedword = words[i];
            String firstChar = analyzedword.substring(0, 1);
            if (first.equals(firstChar)){
                if (seenwords.contains(analyzedword)){
                    wordamount += 0;                    
                }
                else {
                    wordamount += 1;
                }
            seenwords.add(analyzedword);

            }
        }
    return wordamount;
    }
}