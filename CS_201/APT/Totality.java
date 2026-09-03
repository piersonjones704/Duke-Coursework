public class Totality {
    public int sum(int[] a, String stype) {
        // you add code here
        // int oddarray[];
        // int evenarray[];
        // int allarray[];
        int odd = 0;
        int even = 0;
        int all = 0;
        if (stype.equals("odd")){
            for (int i = 1; i < (a.length); i += 2) {
                odd += a[i];
            }
            System.out.println(odd);
            return odd;
            }
        else if (stype.equals("even")){
            for (int i = 0; i < (a.length); i += 2) {
                even += a[i];
            }
            System.out.println(even);
            return even;
            }
        else {
            for (int i = 0; i < (a.length); i += 1) {
                all += a[i];
            }
            System.out.println(all);
            return all;
            }
    }
    // public static void main(String[] args) {
    //     Totality t = new Totality();

    //     int[] a = {1,2,3,4,5};
    //     t.sum(a, "even");
    // }
}   