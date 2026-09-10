public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        // fill in code here
        int maxstrlength = 0;
        String strandstr = "";
        int maxRecurrences_nuc = 0;
        for (String s : strands) {
            int recurrences_nuc = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.substring(i, i + 1).equals(nuc)) {
                    recurrences_nuc += 1;
                    if (recurrences_nuc > maxRecurrences_nuc) {
                        maxRecurrences_nuc = recurrences_nuc;
                        maxstrlength = s.length();
                        strandstr = s;
                    }
                    else if (recurrences_nuc == maxRecurrences_nuc && s.length() > maxstrlength) {
                        maxstrlength = s.length();
                        strandstr = s;
                    }
                        }
                    }
                }
    return strandstr;
    }           
    public static void main(String[] args) {
        System.out.println("HELLO");
    } 
}

    
