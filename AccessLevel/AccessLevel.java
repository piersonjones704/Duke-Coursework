public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        String Access = "";
        for (int val : rights) {
            if (val < minPermission) {
                Access += "D";
            }
            else {
                Access += "A";
            } 
        }
        return Access; 
     }
  }