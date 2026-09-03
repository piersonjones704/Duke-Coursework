public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r, 
                            int x1, int y1, int x2, int y2) {
        // you write code here
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
    //     int crosses = 0;
    //     for(int k=0; k < x.length; k+= 1){
    //         if (isInside(x1,y1,x[k],y[k],r[k]) && 
    //             ! isInside(x2,y2,x[k],y[k],r[k])){
    //             crosses += 1;
    //             }
    //         if (isInside(x2,y2,x[k],y[k],r[k]) && 
    //             ! isInside(x1,y1,x[k],y[k],r[k])){
    //             crosses += 1;
    //             }
    //         else {
    //             crosses += 0;
    //         }
    //     }
    //     return crosses;
    //     }

    // public boolean isInside(int x, int y, int cx, int cy, int r){
	// 	double distSquared = (x-cx)*(x-cx) + (y-cy)*(y-cy);
	// 	double radSquared = r*r;
    //        return distSquared < radSquared;
