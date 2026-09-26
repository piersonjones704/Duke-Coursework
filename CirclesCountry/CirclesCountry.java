public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r, 
                            int x1, int y1, int x2, int y2) {
        int crosses = 0;
        for (int i = 0; i < x.length; i += 1){
            int xval = x[i];
            int yval = y[i];
            int rval = r[i];
            double distcent1 = Math.sqrt((xval - x1)*(xval - x1) + (yval - y1)*(yval - y1)); 
            double distcent2 = Math.sqrt((xval - x2)*(xval - x2) + (yval - y2)*(yval - y2)); 
            if ((distcent1 < rval) && (distcent2 > rval)){
                crosses += 1;
            }
            else if ((distcent1 > rval) && (distcent2 < rval)){
                crosses += 1;
            }
            else {
                crosses += 0;
            }
        }
        return crosses;
    }
}
