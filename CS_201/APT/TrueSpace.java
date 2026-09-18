public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
    // fill in code here 
    long total_disk_space = 0;
    for (int byte_size : sizes) {
        if (byte_size > clusterSize) {
            int remainder = byte_size % clusterSize;
            int quotient = byte_size / clusterSize;
            if ((remainder) != 0) { 
                total_disk_space += ((quotient + 1) * clusterSize);
            }
            else {
                // if (quotient == 0)
                total_disk_space += (quotient * clusterSize);
            }
        } 
        else {
            if (byte_size == 0) {}
            else {
                total_disk_space += clusterSize;
            }
        }
    }
    return total_disk_space;
    }
}