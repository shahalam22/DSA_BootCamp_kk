/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 0, high = n, mid = n;
        if(n==1 || n==0) return n;
        while(low<high){
            mid = low + (high-low)/2;
            if(isBadVersion(mid)==true){
                high = mid;
            }
            else if(isBadVersion(mid)==false){
                low = mid+1;
            }
        }
        return high;
    }
}
