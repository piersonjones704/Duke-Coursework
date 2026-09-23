public class Encryption {
    public String encrypt(String message){
        // you write code here
        char current = 'a';
        String encrypted = "";
        char[] coding = new char[300];
        // int[] coding = new int[300];
       for (char ch : message.toCharArray()) {
            if (coding[ch] == 0) {
                coding[ch] = current;
                current+=1;
            }
            encrypted += coding[ch];
        }
       return encrypted; 
   }
}