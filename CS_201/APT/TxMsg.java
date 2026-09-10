public class TxMsg {
    public String getMessage(String original) {
        String[] words = original.split(" ");
        for (int k=0; k < words.length; k++) {
            words[k] = convert(words[k]);
        } 

        return String.join(" ", words);
    }
    private boolean onlyVowels(String s) {
        // toCharArray is a string method that takes the string and converts it into 
        // a new character array where each element represents a character form the original string 
        for(char ch : s.toCharArray()) {
            if (! isVowel(ch)) {
                return false;
            }
        }
        return true;
    }
    private boolean isVowel(char ch){
        return "aeiou".indexOf(ch) >= 0;
        // return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;

    }
    private String convert(String str) {
        if (onlyVowels(str)) {
            return str;
        }
        String  ret = "";
        str = "a" + str;
        for (int k = 1; k < str.length(); k++) {
            if (! isVowel(str.charAt(k)) && isVowel(str.charAt(k-1))) {
                ret += str.charAt(k);
            }
        }
        return ret;
    }
    // This helps validate the code compiles correctly while not affecting results on APT test
    public static void main(String[] args) {
        System.out.println("HELLO");
    } 
}